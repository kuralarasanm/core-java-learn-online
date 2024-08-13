package javaLearn;

class This1 {
//	instance varible
	int num1, num2;

	void getData(int num1, int num2) {
//		local variable
		this.num1 = num1;
		this.num2 = num2;
	}

	void getData1(int a, int b) {
//		local variable
		num1 = a;
		num2 = b;
	}

	void display() {
		System.out.println(num1);
		System.out.println(num2);
	}
}

public class ThisKeyword {
	public static void main(String[] args) {
		This1 a = new This1();
		a.display();
		a.getData(10, 20);
		a.display();
		a.getData1(20, 30);
		a.display();
	}
}
