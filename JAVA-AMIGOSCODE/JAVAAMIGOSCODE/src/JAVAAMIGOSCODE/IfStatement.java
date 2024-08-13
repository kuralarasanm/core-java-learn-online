package JAVAAMIGOSCODE;

public class IfStatement {
	public static void main(String[] args) {
		int age = 10;
		if (age >= 18) {
			System.out.println("adult");
		} else if (age >= 16 && age < 18) {
			System.out.println("almost adult");
		} else {
			System.out.println("not an adult");
		}
	}
}
