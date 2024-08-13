package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
	public static void main(String[] args) {
		// Set interface - unordered and unique elements ex: 10,20,10 output: 10,20
//		1.HashSet - unsorted order
//		2.TreeSet- to get sorted order
		
		Set<Integer> s=new HashSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(34);
		s.add(23);
		s.add(10);
		System.out.println("HashSet "+s);
		
		Set<Integer> tree=new TreeSet<Integer>();
		tree.add(10);
		tree.add(20);
		tree.add(30);
		tree.add(34);
		tree.add(23);
		tree.add(10);
		System.out.println("TreeSet "+tree);
		
//		DrawBack: no index number
	}
}
