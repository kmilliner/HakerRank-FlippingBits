package flippingbits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import flippingbits.UnsignedDecimal;

class UnsignedDecimalTest {

	@Test
	void lpad () {
		assertEquals("0000001001", UnsignedDecimal.lpad("0", "1001", 10)); 
		assertEquals("0000000100", UnsignedDecimal.lpad("0", "100", 10)); 
		assertEquals("000000000011100", UnsignedDecimal.lpad("0", "11100", 15)); 
		assertEquals("11110001001000000", UnsignedDecimal.lpad("0", "11110001001000000", 15));
	}
	
	@Test
	void flippingBits() {
		assertEquals(4294967286L, UnsignedDecimal.flippingBits(9));
		assertEquals(2147483648L, UnsignedDecimal.flippingBits(2147483647));
		assertEquals(4294967294L, UnsignedDecimal.flippingBits(1));
		assertEquals(4294967295L, UnsignedDecimal.flippingBits(0));
		assertEquals(4294967291L, UnsignedDecimal.flippingBits(4));
		assertEquals(4294843839L, UnsignedDecimal.flippingBits(123456));
	}
	
	@Test
	void flippingBits_Fail() {
		assertEquals(4294967280L, UnsignedDecimal.flippingBits(9));
		assertEquals(2147483640L, UnsignedDecimal.flippingBits(2147483647));
		assertEquals(4294967290L, UnsignedDecimal.flippingBits(1));
		assertEquals(4294967290L, UnsignedDecimal.flippingBits(0));
		assertEquals(4294967290L, UnsignedDecimal.flippingBits(4));
		assertEquals(4294843830L, UnsignedDecimal.flippingBits(123456));
	}

}
