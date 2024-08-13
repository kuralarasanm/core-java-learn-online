package ExceptionHandlingMechanism;

public class ExceptionHandlingthrows {
	public void throwsDemo() throws NullPointerException {
		String str=null;
		System.out.println(str.length());
	}
	public void slave() {
		try {
			throwsDemo();
		}catch (NullPointerException e) {
			System.out.println("Exception "+e);
		}
	}
	public static void main(String[] args) {
		ExceptionHandlingthrows obj=new ExceptionHandlingthrows();
		obj.slave();
	}
}
