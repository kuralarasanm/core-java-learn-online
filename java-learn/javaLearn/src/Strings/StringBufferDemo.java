package Strings;

public class StringBufferDemo {
	public static void main(String[] args) {
//		Mutable strings 
//		both are same
//		StringBuilder - non thread safe
//		StringBuffer - thread safe
		
		StringBuffer obj=new StringBuffer("hello");
		StringBuilder obj1=new StringBuilder("world");
		obj=obj.append(" world");
		System.out.println(obj);
		
//		System.out.println(obj.reverse());
		System.out.println(obj.length());
		System.out.println(obj.substring(2));
		System.out.println(obj.substring(2,4));
		
		
		obj.insert(0, "user ");
		System.out.println(obj);
		
		obj.delete(2, 4);
		System.out.println(obj);
		
		obj.replace(1,2,"y");
		System.out.println(obj);
		
		obj.setCharAt(0, 'j');
		System.out.println(obj);
		
		obj1.insert(0, "user ");
		System.out.println(obj1);
	}
}
