package flippingbits;

public class Binary {
	public static String flipBinary(String binary) {
		String result = binary.replace("0", " ");
		result = result.replace("1", "0");
		result = result.replace(" ", "1");
		return result;
	}

	public static long convertBinaryToDecimal(String binary) {
		long decimal = 0;
		char[] bits = binary.toCharArray();
		
		for (int i = 0, exponent = bits.length -1; i < bits.length; i++, exponent--) {
			if(bits[i] == '1') 
				decimal += Math.pow(2, exponent);
		}
		return decimal;
	}
}
