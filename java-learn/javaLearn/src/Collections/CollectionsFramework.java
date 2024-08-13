package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsFramework {
	public static void main(String[] args) {
//		collection and generics
//		collection API / collection Framework
		
		int a=5;
		int arr[]= {99,29,48,48,92};
		
//		Collection values=new Collection();//error because of interface
		          //generics
		Collection<Integer> values=new ArrayList<Integer>();
		values.add(10);
		values.add(20);
		values.add(30);
		values.add(10);
//		values.add("hello");// error because of Integer generics
		System.out.println(values);
		
		for(int val:values) {
			System.out.println(val*2);
		}
		System.out.println("-----------------");
		System.out.println("list interface");
		//remove method
		while(values.contains(10)) {
			values.remove(10);
		}
		System.out.println(values.contains(10));
		System.out.println(values);
	}
}
