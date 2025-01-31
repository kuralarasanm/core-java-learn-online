package Interface;

//@FunctionalInterface
//interface MyInterface {
//	void display();
////	void show();// error because only 1 method
//}
//
////class MyInterfaceImp implements MyInterface {
////	@Override
////	public void display() {
////		System.out.println("in display");
////
////	}
////}
//
//public class FunctionalInterfaceDemo {
//	public static void main(String[] args) {
////	  Types of interface
////	   1. Normal Interface -> more than 1 method (>1)
////	   2. Functional interface with lambda expression -> (1 method) - single abstract method (SAM)
////	   3.Marker interface (serializable) (0 methods)-permission
//
//		// reference //object
////		MyInterface obj = new MyInterfaceImp();
////		obj.display();
//
////		MyInterface obj = new MyInterface() {
////
////			@Override
////			public void display() {
////				System.out.println("in display anonymous interface");
////
////			}
////		};
//
//		// only FunctionalInterface we can write lambda expression
//		MyInterface obj = () -> {
//			System.out.println("in lambda expression");
//		};
//		obj.display();
//	}
//}

@FunctionalInterface
interface MyInterface {
//	void display(int i);

//	void display(int i,int j);

	int add(int i, int j);
}

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		// (i)
//		MyInterface obj = (int i) -> {
//			System.out.println("in lambda expression " + i);
//		};
//		obj.display(10);

//		MyInterface obj = (i,j) -> {
//			System.out.println("in lambda expression " + i+" "+j);
//		};
//		obj.display(10,20);

//		MyInterface obj = (i, j) -> {
//			return i + j;
//		}; //or
		MyInterface obj = (i, j) -> i + j;
		int result = obj.add(5, 10);
		System.out.println(result);
	}
}


