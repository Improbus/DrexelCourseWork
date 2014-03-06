package ngforms.core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.Hashtable;

import ngforms.core.fields.CheckboxField;
import ngforms.core.fields.LongTextField;
import ngforms.core.fields.MultipleChoiceField;
import ngforms.core.fields.NgDateField;
import ngforms.core.fields.NgTextField;
import ngforms.core.fields.NumberField;
import ngforms.core.validators.DateValidator;
import ngforms.core.validators.NotEmptyValidator;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider;

/**
 * Helper class to wrap NgFormXmlWriterImpl and NgFormXmlReaderImpl
 *
 */
public class NgFormHelper {

	private static NgFormXmlWriterImpl writerInstance = new NgFormXmlWriterImpl();
	private static NgFormXmlReaderImpl readerInstance = new NgFormXmlReaderImpl();
	private static Hashtable<String, String> xmlManualTranslations = new Hashtable<String, String>();
	
	static {
		xmlManualTranslations.put("<field class=\"DateField\" reference=\"../..\"/>", "<field type=\"datefield\" />");
		xmlManualTranslations.put("<java-class>ngforms.core.validators.DateValidator</java-class>","<datevalidator />");
		xmlManualTranslations.put("<java-class>ngforms.core.validators.NotEmptyValidator</java-class>","<notemptyvalidator />");
		xmlManualTranslations.put("<field class=\"TextField\" reference=\"../..\"/>","<field type=\"textfield\" />");
		xmlManualTranslations.put("<field class=\"MultipleChoiceField\" reference=\"../..\"/>", "<field type=\"multiplechoice\" />");
		xmlManualTranslations.put("<field class=\"LongTextField\" reference=\"../..\"/>", "<field type=\"longtextfield\" />");
		xmlManualTranslations.put("<field class=\"NumberField\" reference=\"../..\"/>", "<field type=\"numberfield\" />");
	}

	public static NgForm load(String file) {
		return readerInstance.readFromFile(file);
	}
	
	public static void save(NgForm form, String filepath) {
		writerInstance.write(form, filepath);
	}
	
	public static void submit(NgForm form, String host, int port) throws UnknownHostException, IOException {
		Socket sock = new Socket(host, port);
		String formStr = getFormXmlString(form);
		byte[] formData = formStr.getBytes();
		OutputStream os = sock.getOutputStream();
		os.write(formData, 0, formData.length);
		os.flush();
		sock.close();
	}
	
	private static void prepareXstreamAlias(XStream stream) {
		//Form Core Aliases
		stream.alias("ngform", NgForm.class);
		stream.alias("section", NgFormSection.class);
		
		// Field Aliases
		stream.alias("DateField", NgDateField.class);
		stream.alias("TextField", NgTextField.class);
		stream.alias("MultipleChoiceField", MultipleChoiceField.class);
		stream.alias("LongTextField", LongTextField.class);
		stream.alias("NumberField", NumberField.class);
		stream.alias("CheckboxField", CheckboxField.class);
		
		// Validation Aliases
		stream.alias("DateValidator", DateValidator.class);
		stream.alias("NotEmptyValidator", NotEmptyValidator.class);
	}
	
	private static String getFormXmlString(NgForm form) {
		// Make sure you call XStream with PureJavaReflectionProvider()
		// or else it will FAIL on the Android!
		XStream stream = new XStream(new PureJavaReflectionProvider());
		prepareXstreamAlias(stream);

		StringWriter os = new StringWriter();
		stream.toXML(form, os);
		String str = os.toString();
		
		Enumeration<String> keys = xmlManualTranslations.keys();
		while (keys.hasMoreElements()) {
			String el = keys.nextElement();
			str = str.replace(el, xmlManualTranslations.get(el));
		}
		
		return str;
	}
	
	private static class NgFormXmlReaderImpl implements INgFormReader {

		public NgForm readFromFile(String filepath) {

			try {
				// Read entire string in file
				FileReader fos = new FileReader(filepath);
				BufferedReader in = new BufferedReader(fos);
				String xml = "";
				String input = "";
				while ((input = in.readLine()) != null) {
					xml += input + '\n';
				}
				
				return readFromString(xml);

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return null;
		}

		private NgForm readFromString(String xml) {
			XStream stream = new XStream(new PureJavaReflectionProvider());
			prepareXstreamAlias(stream);

			String str = xml;
			Enumeration<String> keys = xmlManualTranslations.keys();
			while (keys.hasMoreElements()) {
				String el = keys.nextElement();
				str = str.replace(xmlManualTranslations.get(el), el);
			}
			
			NgForm result = (NgForm)stream.fromXML(str);
			return result;
		}
	}
	
	
	private static class NgFormXmlWriterImpl implements INgFormWriter {

		// function takes an NgForm object and outputs it to an XML file
		public void write(NgForm form, String filepath) {
			try {
				String str = getFormXmlString(form);

				FileOutputStream fos = new FileOutputStream(filepath);
				fos.write(str.getBytes());

				fos.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
