package javaLearn;

public class ArrayMatricesTranspose {
	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6}};
		
		int c[][]=new int[a[0].length][a.length];
		
		for(int i=0;i<a[0].length;i++) {
			for(int j=0;j<a.length;j++) {
				c[i][j]=a[j][i];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
