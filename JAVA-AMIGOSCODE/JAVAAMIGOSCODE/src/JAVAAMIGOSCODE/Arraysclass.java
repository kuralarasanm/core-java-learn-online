package JAVAAMIGOSCODE;

import java.util.Arrays;

public class Arraysclass {
	public static void main(String[] args) {
		int[] numbers = new int[3];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);

		int[] numbers1 = { 1, 2, 3 };
		System.out.println(numbers1.length);

		String[] name = { "kural", "madhan" };
		System.out.println(name[0]);
		System.out.println(name[1]);
		
		Arrays.stream(numbers1).forEach(System.out::println);
	}
}
