package InnerClass;

class outer{
	//variable
	//methods
	//constructors
	//class
	
	class inner{
		int a=10;
		public void show() {
			System.out.println("in nested inner class show method");
		}
		
	}
	static class inner1{
		 public void show() {
				System.out.println("in static inner class show method");
			}
	}
	
}
public class NestedInnerClass {
	public static void main(String[] args) {
		//inner class - a class inside a class
		outer out=new outer();
		outer.inner obj=out.new inner();
		obj.show();
		//static inner class
		outer.inner1 obj1=new outer.inner1();
		obj1.show();
	}
}
