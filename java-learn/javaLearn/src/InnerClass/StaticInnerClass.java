package InnerClass;



class outers{
	//variable
	//methods
	//constructors
	//class
	
	static class inner{
		int a=10;
		public void show() {
			System.out.println("in static inner class show method");
		}
		
	}
	static class inner1{
		 public void show() {
				System.out.println("in static inner1 class show method");
			}
	}
	
}
public class StaticInnerClass {
	public static void main(String[] args) {
		
		outers.inner obj=new outers.inner();
		obj.show();
		outers.inner1 obj1=new outers.inner1();
		obj1.show();
	}
}
