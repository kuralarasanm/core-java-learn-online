package javaLearn;

class parentfather {
	// constructors
	public parentfather() {
//		super(); by default is present
		System.out.println("in parent default");
	}

	public parentfather(int val) {
//		super();
		System.out.println("in parent parameterized " + val);
//		super();//error
	}

	// methods
	//variable
	int a = 20;

	public void display() {
		System.out.println("in parent display");
	}
}

class childson extends parentfather {
	// constructors
	public childson() {
//		super(); by default is present
		System.out.println("in child default");
	}

	public childson(int i) {
//		super();// by default is present
		super(10 + 2);
		System.out.println("in child parameterized " + i);
	}

	// methods
	
	// variable
	int a = 10;

	public void display() {
		super.display();
		System.out.println("in child display");
		super.display();
		System.out.println("a = " + a);
		System.out.println("a = " + super.a);
	}
}

public class SuperKeyword {
	public static void main(String[] args) {
//		Achieved by inheritance concept
//		used to access immediate parent class variables,methods and constructors from child class
//		
//	note: name of Base class and derived class variables and methods should be same
		childson obj = new childson();
		childson obj1 = new childson(10);
		obj.display();
	}
}
