
public class bitFunctions {
	
	//I used the hexidecimal values from a Tutorial on floating point arithmetic
	
	//Grab the sign bit and check if it is 0 or 1 to determine the sign
	public static boolean getSign(long num){
		return ((num & 0x8000000000000000L) != 0);
	}
	
	//Extract the 11 exponent bits and print it out in double precision form
	public static long getExponent(long num){
		return (num & 0x7ff0000000000000L);
	}
	
	//Extract the 54 Mantissa bits and properly display it in double form as well
	public static long getMantissa(long num){
		return ((num & 0x000fffffffffffffL) | 0x0010000000000000L);
	}
	
	//
	public static String longToDoubleToString(long num){
		return Double.toString(Double.longBitsToDouble(num));
	}
	

}
