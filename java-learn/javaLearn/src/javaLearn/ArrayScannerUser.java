package javaLearn;

import java.util.Scanner;

public class ArrayScannerUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("enter array elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
//		System.out.println(a[1]);
		int max = a[0];
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("biggest number = " + max);
		System.out.println("smallest number = " + min);
	}
}
