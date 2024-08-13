package ExceptionHandlingMechanism;

public class ExceptionHandlingthrow {
	public static void main(String[] args) {
		try {
			int a=5/0;
//			throw is used to raised a exception if remove a also exception
			throw new ArithmeticException();
		}catch (Exception e) {
			System.out.println("exception "+e);
		}
	}
}
