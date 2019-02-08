package postfix;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import postfix.PostfixTest;

class PostfixTest {

	@Test
	void postfixCalculator() {
		assertEquals("14", Postfix.postfixCalculator("5 1 2 + 4 * + 3 -"));
	}

}
