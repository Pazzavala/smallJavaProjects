package DataStructures;

public class ArrayDeletions {

	static void printArray(int[] intArray, int length) {
		for(int i = 0; i < length; i++) {
		System.out.println("Index: " + i + " contains: " + intArray[i]);
		}
	}

	public static void main(String [] args) {

		// Deleting from end of Array O(1)
		int[] intArray = new int[10];

		int length = 0;

		for(int i = 0; i < 6; i++) {
			intArray[length] = i;
			length++;
		}

		printArray(intArray, length);

		System.out.println("\n");

		length--;

		printArray(intArray, length);

		System.out.println("\n");


		// Deleting from start of Array O(n)
		for(int i = 1; i < length; i++) {
			intArray[i-1] = intArray[i];
		}

		length--;

		printArray(intArray, length);

		System.out.println("\n");


		// Deleting form anywhere in Array
		int indexToDelete = 2;

		for(int i = indexToDelete; i < length; i++) {
			intArray[i - 1] = intArray[i];
		}
		
		length--;

		printArray(intArray, length);
		System.out.println("\n");



		int[] array = new int[10];


		array[0]++;
		array[0]++;

		printArray(array, array.length);

	}
}

