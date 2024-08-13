package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListInterface {
//	list-ArrayList and LinkedList
	public static void main(String[] args) {
//		List<Integer> values=new ArrayList<Integer>(); // or
		ArrayList<Integer> values=new ArrayList<Integer>();
		values.add(10);
		values.add(20);
		values.add(30);
		values.add(11);
		values.add(9);
		values.add(1, 8);
		Collections.sort(values);
		System.out.println("sort "+values);
		System.out.println("size "+values.size());
		values.set(0,11);
		System.out.println("get "+values.get(0));
		System.out.println("set "+values);
		// Collection -> value
		// ArrayList -> index
		values.remove(0);
		System.out.println("remove "+values);
		System.out.println("value 20 index of "+values.indexOf(20));
		values.remove(values.indexOf(20));
		System.out.println("remove index of 20 "+values);
		values.add(40);
		Iterator it=values.iterator();
		System.out.println("iterator "+it.next());
		System.out.println("iterator "+it.next());
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		for(int i:values) {
			System.out.print(i+" ");
		}
	}
}
