package Strings;

public class StringClassMethods {
	public static void main(String[] args) {
		String s = "hello";
		System.out.println(s.length());
		// indexof
		System.out.println(s.indexOf('e'));
		// charAt(index)
		System.out.println(s.charAt(0));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.concat("world"));
		s = s + "world";
		System.out.println(s);
		
		String s1="hello";
		String s2="hello";
		System.out.println(s1.compareTo(s2));
//		 0 -> String content are equal
//		 +ve
//		 -ve
		
		String s3="  hello  ";
		s3=s3.trim();
		System.out.println(s3.length());
		
		String s4="hello world";
		s4=s4.replace('e', 'o');
		System.out.println(s4);
		
		String s5="kuralarasan";
		System.out.println(s5.substring(5));
		System.out.println(s5.substring(0, 5));
		System.out.println(s5.subSequence(0, 5));
		System.out.println(s5.contains("kural"));
		System.out.println(s5.lastIndexOf('a'));
		
		String s6="abc";
		String s7="ABC";
		System.out.println(s6.equals(s7));
		System.out.println(s6.equalsIgnoreCase(s7));
		
		String s8="i,wanna,you";
		String ss[]=s8.split(",");
		for(String temp:ss) {
			System.out.println(temp);
		}
		
		String sing="aeiou";
		char ch[]=sing.toCharArray();
		for(char c:ch) {
			System.out.println(c);
		}
		
		String rev=String.valueOf(ch);
		System.out.println(String.valueOf(ch));
		
	}
}
