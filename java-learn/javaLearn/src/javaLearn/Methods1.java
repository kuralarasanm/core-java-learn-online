package javaLearn;

//public class Methods1 {
//	public static void displayFunction() {
//		System.out.println("in display");
//	}
//	public static void main(String[] args) {
//		displayFunction();
//	}
//}       // or

public class Methods1 {
	public void display() {
		System.out.println("in display");
	}
	public static void main(String[] args) {
		new Methods1().display();
	}
}
