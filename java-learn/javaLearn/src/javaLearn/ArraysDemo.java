package javaLearn;

public class ArraysDemo {
	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println(a[3]);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("-------------------------");
		int b[]= {10,20,30,40,50,60,70,80,90,100};
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		System.out.println("-----------------------------");
		String s[]= {"kural","madhan","naveen","power"};
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}
}
