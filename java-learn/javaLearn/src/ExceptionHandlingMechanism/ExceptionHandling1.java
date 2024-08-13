package ExceptionHandlingMechanism;

public class ExceptionHandling1 {
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
			}finally {
				System.out.println("inner finally bye");
			}
		} catch (Exception e) {
			System.out.println("Exception " + e);
		}
		finally {
		System.out.println("finally bye");
		}
	}
}
