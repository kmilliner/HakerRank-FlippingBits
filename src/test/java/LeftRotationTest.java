import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import arrayleftrotattion.LeftRotation;

class LeftRotationTest {

	@Test
	void rotLeft() {
		int[] result = {5,1,2,3,4};
		int[] array  = {1,2,3,4,5};
		assertArrayEquals(result, LeftRotation.rotLeft(array, 4));
		
		int[] result1 = {77, 97, 58, 1, 86, 58, 26, 10, 86, 51, 41, 73, 89, 7, 10, 1, 59, 58, 84, 77};
		int[] array1  = {41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51};
		assertArrayEquals(result1, LeftRotation.rotLeft(array1, 10));
	}

}
