package flippingbits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryTest {

	@Test
	void convertBinaryToDecimal() {
		assertEquals(9, Binary.convertBinaryToDecimal("1001"));
		assertEquals(4, Binary.convertBinaryToDecimal("100"));
		assertEquals(28, Binary.convertBinaryToDecimal("11100"));
		assertEquals(123456, Binary.convertBinaryToDecimal("11110001001000000"));
	}
	
	@Test
	void flipBinary() {
		assertEquals("0110", Binary.flipBinary("1001"));
		assertEquals("011", Binary.flipBinary("100"));
		assertEquals("00011", Binary.flipBinary("11100"));
		assertEquals("00001110110111111", Binary.flipBinary("11110001001000000"));
	}

}
