package javaLearn;


class Welcome{
	void greet(String name,int age) {
		 System.out.println("Welcome "+name+" age is "+age);
	}
	public int add(int a,int b) {
		greet("kural",23);
		return a+b;
	}
}
public class Methods {
	public static void main(String[] args) {
		System.out.println("hi");
		Welcome obj=new Welcome();
//		obj.greet("kural", 23);
		int op=obj.add(10, 20);
		System.out.println(op);
	}
}
