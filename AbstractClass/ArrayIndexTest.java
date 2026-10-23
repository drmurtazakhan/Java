// File Name: ArrayIndexTest.java
public class ArrayIndexTest {
	public static void main(String[] args) {
		int count = 0;
		int[] numbers = { 6, 7, 5, 4 };

		System.out.println("Initial count: " + count);

		// Pre-increment (++count):
		// 1. First increases 'count' by 1 (count becomes 1).
		// 2. Then assigns the value 20 to numbers[1].
		numbers[++count] = 20;

		System.out.println("Count after increment: " + count);
		System.out.println();

		// Loop through and print each element in the array
		System.out.println("Array contents:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("numbers[" + i + "] = " + numbers[i]);
		}
	}
}