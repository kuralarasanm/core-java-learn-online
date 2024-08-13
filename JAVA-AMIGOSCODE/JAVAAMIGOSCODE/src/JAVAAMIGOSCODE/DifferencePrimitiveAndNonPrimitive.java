package JAVAAMIGOSCODE;

public class DifferencePrimitiveAndNonPrimitive {
	public static void main(String[] args) {
		int a = 10;
		int b = a;
		a = 100;
		System.out.println("a = " + a + ",b = " + b);

		Person alex = new Person("alex");
		Person mariam = alex;
		
		System.out.println("before chaning alex");
		System.out.println(alex.name+" "+mariam.name);
		
//		alex.name="alexander";
		mariam.name="mariam";
		
		System.out.println("after changing alex");
		System.out.println(alex.name+" "+mariam.name);
	}

	static class Person {
		String name;

		Person(String name) {
			this.name = name;
		}
	}
}
