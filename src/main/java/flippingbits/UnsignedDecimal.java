package flippingbits;

public class UnsignedDecimal {
	//https://www.hackerrank.com/challenges/flipping-bits/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=miscellaneous
	public static long flippingBits(long n) {
			String binary = Binary.flipBinary(lpad("0", Decimal.convertDecimailToBinary(n), 32));
			long decimal = Binary.convertBinaryToDecimal(binary);
			return decimal;
	}
		
	public static String lpad(String character, String word, int length) {
		while(word.length() < length) {
			word = character + word;
		}
		return word;
	}
}
