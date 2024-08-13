package javaLearn;

public class ArrayDiagonal {
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 8, 8, 9 } };
//		principal (main/leading) diagonal
//		secondary diagonal

		int pd = 0;
		int sd = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
				if (i == j) {
					pd = pd + a[i][j];
				}
				if (i + j == a.length - 1) {
					sd = sd + a[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("primary diagonal");
		System.out.println(pd);
		System.out.println("secondary diagonal");
		System.out.println(sd);
	}
}
