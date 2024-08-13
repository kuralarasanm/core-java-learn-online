package ExceptionHandlingMechanism;

public class ExceptionHandlingMechanism {
	public void throwsDemo() throws NullPointerException {
		String str = null;
		System.out.println(str.length());
	}

	public void slave() {
		try {
			throwsDemo();
		} catch (NullPointerException e) {
			System.out.println("Exception " + e);
		}
	}

	public static void main(String[] args) {
		try {
			int a = 5 / 1;
			System.out.println("no EXception of a is " + a);

			try {
				int c[] = { 2 };
				c[0] = 10;
				System.out.println("no exception " + c[0]);
				c[10] = 35;// exception
				System.out.println("inner try");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("inner try exception " + e);
			} finally {
				System.out.println("inner finally bye");
			}
		} catch (ArithmeticException e) {
			System.out.println("Exception " + e);
		} finally {
			System.out.println("finally bye");
		}
		try {
			int a = 5 / 0;
//			throw is used to raised a exception if remove a also exception
			throw new ArithmeticException();
		} catch (Exception e) {
			System.out.println("handling throw");
			System.out.println("exception " + e);
		}
		ExceptionHandlingMechanism obj = new ExceptionHandlingMechanism();
		obj.slave();
	}
}
