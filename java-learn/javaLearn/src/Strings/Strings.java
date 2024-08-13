package Strings;

// stack and heap memory in jvm
public class Strings {
	public static void main(String[] args) {
		
		String str=new String("abcd");
		System.out.println(str);
		
		String s="hello";
		System.out.println(s);
		
//		string is object immutable
		s="abcd";
		System.out.println(s);
		String s1="abcd";
		System.out.println(s1);
	}
}
