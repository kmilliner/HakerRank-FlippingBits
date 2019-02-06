package flippingbits;

public class Decimal {
	
	public static String convertDecimailToBinary(long n) {
		String binary = ""; 
		long mod = 0;
		long division = n;
		
		do {
			mod = division % 2;
			division = division/2;
			binary = mod + binary;
			
		} while (division > 1);
		
		binary = division + binary;		
		return binary;
	}
}
