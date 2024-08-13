package Interface;

//abstract class b{
//	abstract void display();
//	void show() {
//		
//	}
//}
//difference between
interface Ab{
	// variables - by default static and final
	// methods - only abstract methods
	// no contructors
	
	int age=23;// static and final
	void show();// by default - public abstract
	void display();
	
}
class Aimp implements Ab{

	@Override
	public void show() {
//		age=30; //error
		System.out.println("in display");
		
	}

	@Override
	public void display() {
		System.out.println("in show");
		
	}
	
}
public class Interface {
	public static void main(String[] args) {
//		Interface Basics
//		Multiple inheritance with Interface
//		Types of Interfaces
//		  1. Normal interface
//		  2. Functional interface with lambda expression
//		  3. Marker Interface (Serializable)
//		  default and static method in interface
		
//		Ab obj;
//		obj=new Aimp();
		//or 
//		Ab obj=new Aimp();
		//or
		Aimp obj=new Aimp();
		obj.show();
		obj.display();
		
		System.out.println(Ab.age); // direct to call so it is static
	}
}
// class extends class
// class implements interface
// interface extends interface
