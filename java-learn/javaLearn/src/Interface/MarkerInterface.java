package Interface;

interface permission {

}

class MyClass1 implements permission{
	public void show() {
		System.out.println("in show method");
	}
}

public class MarkerInterface {
	public static void main(String[] args) {
		MyClass1 obj = new MyClass1();
		if (obj instanceof permission) {
			obj.show();
		} else {
			System.out.println("no access granted");
		}
	}
}
