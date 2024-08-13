package javaLearn;

public class ArrayMatricesMultiplication {
	public static void main(String[] args) {
		int a[][] = { { 1, 2 }, { 3, 4 } };// 2*2
		int b[][] = { { 1, 2, 3 }, { 4, 5, 6 } };// 2*3

		// 2*2 2*3  when multiple matrix apply only 1st matrix col and 2nd matrix row will same
//		column 1 == row 2
		int c[][] = new int[a.length][b[0].length];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
				}
			}
		}

		System.out.println("resultant matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();

		}
	}
}
