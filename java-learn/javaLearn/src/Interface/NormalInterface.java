package Interface;

//Normal interface
interface MyInterface1 {
	void display();

	void show();
}

public class NormalInterface {
	public static void main(String[] args) {

		MyInterface1 obj = new MyInterface1() {

			@Override
			public void display() {
				System.out.println("in display anonymous interface");

			}

			// more then a method
			public void show() {
				System.out.println("in show");
			}
		};
		obj.display();
		obj.show();
	}
}
