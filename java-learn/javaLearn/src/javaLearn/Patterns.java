package javaLearn;

public class Patterns {
	public static void main(String[] args) {
//		 0123
//		0****
//		1****
//		2****
//		3****
		
//		for(int i=0;i<4;i++) { // (rows)
//			for(int j=0;j<4;j++) { // (columns)
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		 0123
//		0****
//		1*  *
//		2*  *
//		3****
//		for(int i=0;i<4;i++) { // (rows)
//			for(int j=0;j<4;j++) { // (columns)
//				if(i==0 || i==3||j==0||j==3) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		
//		int row=4;
//		int col=4;
//		for(int i=0;i<row;i++) { // (rows)
//			for(int j=0;j<col;j++) { // (columns)
//				if (i == 0 || i == row - 1 || j == 0 || j == col - 1) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}

//		*
//		**
//		***
//		****
		
		int row=4;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
//				System.out.print(i+" ");
//				System.out.print(j+" ");
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
