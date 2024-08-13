package Inheritance;

class a1{
	public void display() {
		System.out.println("in a1 display");
	}
}
class a2{
	public void display() {
		System.out.println("in a2 display");
	}
}
class a3 extends a1,a2{
	
}
//Mutiple Inheritance is not supported in java to achieve (interfaces)
public class MutipleInheritanceError {
	public static void main(String[] args) {
		a3 obj=new a3();
		obj.display();
	}
}
