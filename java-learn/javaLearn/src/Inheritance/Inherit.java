package Inheritance;

class GrandParent {
	int a;

	void display() {
		System.out.println("Grandparent");
	}
}

class parent extends GrandParent {
	int b;

	void show() {
		System.out.println("parent");
	}
}

class Child extends parent {
	int c;

	void print() {
		System.out.println("child");
	}
}

class child1 extends parent {
	void show1() {
		System.out.println("child1");
	}
}

class child2 extends parent {
	void show2() {
		System.out.println("child2");
	}
}

public class Inherit {
	public static void main(String[] args) {
//		InHeritence
//		
//		Super(Base,parent)Class
//		sub(Derived,child)Class
//		
//		Accessing variables and methods of super class
//		using sub class object
//		  
//		  ->single ->parent to child
//		  ->multilevel -> grandParent to parent to child
//		  ->hierarchical-> parent to child1 and parent to child2
//		  ->Multiple(not supported directly)
//		  ->Hybrid(not support)

		Child c = new Child();
		c.a = 10;
		c.b = 20;
		c.c = 30;
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);
		c.display();
		c.show();
		c.print();
		System.out.println("hierarchical:");
		child1 c1=new child1();
		c1.show1();
		c1.show();
		System.out.println("--------");
		child2 c2=new child2();
		c2.show2();
		c2.show();
		
	}
}
