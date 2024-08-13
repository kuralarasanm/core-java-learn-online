package polymorphism;

class parents{
	void show() {
		System.out.println("parent");
	}
}
class childs extends parents{
	void show() {
		System.out.println("child");
	}
}
public class Methodoverride {
	public static void main(String[] args) {
//		Method Overriding(Run time polymorphism)
//		Achieved by Inheritance concept
//		Rules
//		  -> Both Super & sub class methods should be having same name
//		  -> Static & final Methods cannot be Overridden
		  
		  childs c=new childs();
		  c.show();
	}
}
