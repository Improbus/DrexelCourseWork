package ngforms.browser.util;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

import android.os.Environment;

public class Utilities {
	private static File formTemplatePath;
	private static File formSavedPath;
	
	static {
		File ngfromsDir = new File(Environment.getExternalStorageDirectory(), "ngforms");
		formTemplatePath = new File(ngfromsDir, "templates");
		formSavedPath = new File(ngfromsDir, "saved");
	}
	
	public static File getFormTemplatePath() {
		return formTemplatePath;
	}
	
	public static File getFormSavedPath() {
		return formSavedPath;
	}
	
	public static ArrayList<String> getListOfFormsInDirectory(File directory) {
		ArrayList<String> directoryEntries = new ArrayList<String>();
		for (File file : directory.listFiles(getFormFileFilter())) {
			directoryEntries.add(file.getName().toString());
		}
		return directoryEntries;
	}
	
	private static FileFilter getFormFileFilter() {
		FileFilter result = new FileFilter() {
			public boolean accept(File f) {
				if (f.getName().toLowerCase().endsWith(".form")
						/*|| f.isDirectory()*/) {
					return true;
				}
				return false;
			}
		};
		return result;
	}
}
