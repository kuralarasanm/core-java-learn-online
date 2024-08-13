package JAVAAMIGOSCODE;

import java.time.LocalDate;

public class NonPrimitiveDataTypes {
	public static void main(String[] args) {
		// non primitive data types
		String name=new String("kuralarasan");
		System.out.println(name.toUpperCase());
		LocalDate now=LocalDate.now();
		System.out.println(now);
		System.out.println(now.getMonth());
	}
}
