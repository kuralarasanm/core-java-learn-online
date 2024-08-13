package Wrapper;

//Wrapper class
//   boxing,auto-boxing,unboxing,auto-unboxing

public class WrapperClass {
	public static void main(String[] args) {
		// primitive data types int,double,char
		// Integer,Double,Character

		int i = 5;
		System.out.println(i);
		Integer obj = new Integer(5); // boxing
		System.out.println("boxing "+obj);
		
		Integer obj1 = 7; //auto-boxing
		Integer obj2 = i;
		System.out.println("auto-boxing "+obj1);
		System.out.println("auto-boxing "+obj2);
		
		int val=obj2.intValue();//unboxing
		int val2=obj2;//auto-unboxing
		System.out.println("unboxing "+val);
		System.out.println("auto-unboxing "+val2);
		
	System.out.println("-------------------------------");
	double d=18.37;
	
	Double dd=d;
	System.out.println("auto boxing "+dd);
	double dummy=dd.doubleValue();
	double dummy1=dd;
	System.out.println("unboxing "+dummy);
	System.out.println("auto-unboxing"+dummy1);
	}
}
