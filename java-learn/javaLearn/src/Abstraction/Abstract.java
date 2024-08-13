package Abstraction;

abstract class Empolyee{
	abstract void display();//declaration
	void show() {
		System.out.println("Abstract show");
	}
}
class Servant extends Empolyee{ //derived class
	void display() {
		System.out.println("Abstract method in derived class");
	}
}
public class Abstract {
	public static void main(String[] args) {
//		Abstraction (abstract)
//		->Abstract method (method having only declaration)
//		->Definition will be written in Dervied class
//		->abstract class (contains atleast one abstract method)
//		->concreate class (class which doesn't contain any abstract method)
//		->we cannot create OBJECT for abstract class
		
		Servant obj=new Servant();
		obj.display();
		obj.show();
	}
}
