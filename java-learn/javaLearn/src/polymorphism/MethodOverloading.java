package polymorphism;

class Overload {
	int num1, num2, result;

	void sum(int a, int b) {
		num1 = a;
		num2 = b;
		result = num1 + num2;
		System.out.println(result);
	}

	void sum(double a, double b) {
//		num1=(int)a;
//		num2=(int)b;
//		result=num1+num2;
		double num1 = a;
		double num2 = b;
		double result = num1 + num2;
		System.out.println(result);
	}

	void sum(int a, double b) {
		num1=a;
		num2=(int)b;
		result=num1+num2;
		System.out.println(result);
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
//		polymorphism(same thing in diff.ways)
//		--> compile time (method overloading)
//		--> run time (method overriding)

		Overload obj = new Overload();
		obj.sum(10, 20);
		obj.sum(10.5, 10.572);
		obj.sum(10, 10.5);
	}
}
