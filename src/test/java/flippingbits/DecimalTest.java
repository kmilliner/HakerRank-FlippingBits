package flippingbits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import flippingbits.Decimal;

class DecimalTest {

	@Test
	void convertDecimailToBinary() {
		assertEquals("1001", Decimal.convertDecimailToBinary(9));
		assertEquals("100", Decimal.convertDecimailToBinary(4));
		assertEquals("11100", Decimal.convertDecimailToBinary(28));
		assertEquals("11110001001000000", Decimal.convertDecimailToBinary(123456));
	}

}
