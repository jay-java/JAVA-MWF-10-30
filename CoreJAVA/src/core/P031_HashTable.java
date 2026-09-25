package core;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class P031_HashTable {
	public static void main(String[] args) {
		Map map = new Hashtable();
		map.put(1, "c");
		map.put(2, "c++");
		map.put("java", 2435);
		map.put(346.54, false);
		map.put('a', "python");
		map.put(124, "php");
		map.put(1, "dart");
		map.put(null, "");

		System.out.println(map);
	}
}
