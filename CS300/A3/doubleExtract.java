
public class doubleExtract {

	public static void main(String[] args) {
		
		//Take in the first argument and convert it to a double
		String arg = args[0];
		double input = Double.parseDouble(arg);
		
		//Store the double in a long and convert double into bits
		long num = Double.doubleToLongBits(input);
		
		//Display the correct sign based on the boolean
		if(bitFunctions.getSign(num)==false){
			System.out.println("Sign: " + "+");  
		}
		else{
			System.out.println("Sign: " + "-");  
		}
		

		//Get exponent convert to double and print
		System.out.println("Exponent in Double Precision: " + bitFunctions.longToDoubleToString(bitFunctions.getExponent(num)));  
 
		//Get Mantissa convert to double and print
		System.out.println("Mantissa in Double Precision: " + bitFunctions.longToDoubleToString(bitFunctions.getMantissa(num))); 
		
	}

}
