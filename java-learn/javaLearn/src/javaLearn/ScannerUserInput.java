package javaLearn;

import java.util.Scanner;

public class ScannerUserInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.next();
		System.out.println("enter your age");
		int age=sc.nextInt();
		System.out.println("enter your phone");
		long phone=sc.nextLong();
		System.out.println("enter your temperature");
		double temp=sc.nextDouble();
		System.out.println("enter your charater");
		char c=sc.next().charAt(0);
		
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		System.out.println("phone : "+phone);
		System.out.println("temperature : "+temp);
		System.out.println("character : "+c);
		sc.close();
	}
}
