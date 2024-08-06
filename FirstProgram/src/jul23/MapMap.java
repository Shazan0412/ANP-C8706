package jul23;

import java.util.*;

public class MapMap {
	public static void main(String[] args) {
		HashMap<String, Integer> mp = new HashMap<>();

		mp.put("apple, 2", null );
		mp.put("Banana, 3", null);
		mp.put("orange, 2", null);
		

		for (Map.Entry<String, Integer> ee : mp.entrySet()) {
			System.out.println(ee.getKey()+"--"+ee.getValue());
		}

		System.out.println(mp);
	}
}
