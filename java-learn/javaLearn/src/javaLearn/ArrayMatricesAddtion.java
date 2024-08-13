package javaLearn;

import java.util.Scanner;

public class ArrayMatricesAddtion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter no of rows of m1");
		int row1 = sc.nextInt();
		System.out.println("enter no of column of m1");
		int col1 = sc.nextInt();

		System.out.println("enter no of rows of m2");
		int row2 = sc.nextInt();
		System.out.println("enter no of rows of m2");
		int col2 = sc.nextInt();

		if ((row1 == row2) && (col1 == col2)) {
			int a[][] = new int[row1][col1];
			int b[][] = new int[row2][col2];

			int c[][] = new int[row1][col1];

			System.out.println("enter the matrix 1 elements");

			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					System.out.println("enter for " + i + "," + j);
					a[i][j] = sc.nextInt();
				}
			}

			System.out.println("enter the matrix 2 elements");

			for (int i = 0; i < b.length; i++) {
				for (int j = 0; j < b[i].length; j++) {
					System.out.println("enter for " + i + "," + j);
					b[i][j] = sc.nextInt();
				}
			}

			System.out.println("resultant matrix");
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					c[i][j] = a[i][j] + b[i][j];
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
			// this is extra loop 
//			for(int i=0;i<a.length;i++) {
//				for(int j=0;j<a[i].length;j++) {
//					System.out.print(c[i][j]+" ");
//				}
//				System.out.println();
//			}
		}
		else {
			System.out.println("order of matrices should be same");
		}

	}
}
