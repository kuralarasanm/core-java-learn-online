package Strings;

public class Stringsdifference {
	public static void main(String[] args) {
//		"==" vs ".equals()" method
		
		String s1="hello";
		String s2="hello";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		String s3="hello";
		String s4=new String("hello");
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
	}
}
