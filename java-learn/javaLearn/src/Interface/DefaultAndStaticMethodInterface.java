package Interface;

interface wierd {
	default void show() {
		System.out.println("in show default method");
	}

	static void display() {
		System.out.println("in static method");
	}
}

class wierdImp implements wierd {
	
	static void display() {
		System.out.println("in static method 1");
	}
	
}

public class DefaultAndStaticMethodInterface {
	public static void main(String[] args) {
		// default
		wierdImp obj = new wierdImp();
		obj.show();
		// static
		wierd.display();
		wierdImp.display();
	}
}
