package core;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class P029_TreeSet {
	public static void main(String[] args) {
		//treeset -> sorted set
		Set set = new TreeSet();
		set.add(123);
		set.add(2345);
		set.add(346642456);
		set.add(-346);
		set.add(0);
		set.add(-34656);
		set.add(6789);
		System.out.println(set);

		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
