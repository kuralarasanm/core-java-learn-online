package InnerClass;

class Test1 {
	public void test() {
		System.out.println("in test");
	}
}

//class Test2 extends Test1{
//	public void test() {
//		System.out.println("in new test");
//	}
//}
public class AnonymousInnerClass {
	public static void main(String[] args) {
//		Test2 t=new Test2();
//		t.test();

		// AnonymousInnerClass
		Test1 t = new Test1() {
			public void test() {
				System.out.println("in new test");
			}
		};
		t.test();
	}
}
