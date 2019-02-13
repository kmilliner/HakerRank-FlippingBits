package arrayleftrotattion;

public class LeftRotation {

	//https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		int[] result = rotLeft(a, 3);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
	}
	
	public static int[] rotLeft(int[] a, int d) {
		int[] result = new int[a.length];
		int index;
		int rotation;
		
		for (int i = 0; i < a.length; i++) {
			rotation = i - d;
			
			if (rotation < 0)
				index = a.length + rotation;
			else
				index = rotation;
			
			result[index]=a[i];
		}
		return result;
    }

}
