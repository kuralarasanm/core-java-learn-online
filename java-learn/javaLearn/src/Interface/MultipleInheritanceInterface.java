package Interface;

interface parent1{
	void display();

}
interface parent2{
	void show();
}
class MyClass{
	public void summa() {
		System.out.println("in summa");

	}
}
class childs1 extends MyClass implements parent1,parent2{

	@Override
	public void show() {
		System.out.println("in show");
		
	}

	@Override
	public void display() {
		System.out.println("in display");
		
	}
	
}
//We can achieve multiple inheritance with interface
public class MultipleInheritanceInterface {
	public static void main(String[] args) {
		childs1 obj=new childs1();
		obj.display();
		obj.show();
		obj.summa();
	}
}
