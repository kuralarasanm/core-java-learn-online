package javaLearn;

import java.util.Scanner;

public class TwoDimensionalArray {
	public static void main(String[] args) {
//		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
//		
////		System.out.println(a[1][2]);
//		for(int i=0;i<a.length;i++) { //0<3 a[0][]
//			for(int j=0;j<a[i].length;j++) { //0,1,2
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}

		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of rows");
		int row = sc.nextInt();
		System.out.println("enter no of column");
		int col = sc.nextInt();
		int a[][] = new int[row][col];
		for (int i = 0; i < row; i++) { // or i<a.length
			for (int j = 0; j < col; j++) {// or j<a.length
				System.out.println("enter for " + i + "," + j);
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("resultant matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
}
