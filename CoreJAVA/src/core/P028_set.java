package core;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class P028_set {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(123);
		set.add("java");
		set.add(34623467423456l);
		set.add('a');
		set.add(2346.456);
		set.add(true);
		set.add(123);
		System.out.println(set);

		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
