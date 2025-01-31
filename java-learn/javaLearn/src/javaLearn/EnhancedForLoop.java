package javaLearn;

public class EnhancedForLoop {
	public static void main(String[] args) {
		// Enhanced For Loop / For-Each Loop

		int a[] = { 1, 2, 3, 4, 5, 6 };

		for (int value : a) {
			System.out.print(value + " ");
		}
		System.out.println();
		for (int value : a) {
			System.out.println(value);
		}

		int b[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int temp[] : b) {
			for (int value : temp) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}
}
