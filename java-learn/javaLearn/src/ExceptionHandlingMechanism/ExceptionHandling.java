package ExceptionHandlingMechanism;

public class ExceptionHandling {
	public static void main(String[] args) {
		// try,catch,throw,throws,finally

		try {
			int a = 5 / 1;
			System.out.println("no EXception "+a);
			int b = 5 / 0;//this is Exception
			System.out.println("Exception "+b);
		} catch (Exception e) { 
			System.out.println("Exception " + e);
		}

		System.out.println("hi");
	}
}
