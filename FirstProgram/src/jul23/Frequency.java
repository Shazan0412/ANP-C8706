package jul23;

import java.util.*;

public class Frequency {
			public static void main(String[] args) {
				String[] words ={ "apple", "orange", "banana", "apple", "banana", "banana", "orange" } ;

				
				Map<String , Integer> map = new HashMap<>() ;
				
				for(String fruit : words) {
					
					if(map.containsKey(fruit)) {
						map.put(fruit, map.get(fruit)+1) ;
					}else {
						map.put(fruit, 1) ;
					}
					
					for(Map.Entry<String, Integer>  eEntry : map.entrySet()) {
						System.out.println(eEntry.getKey()+ "->"+ eEntry.getValue());
					}
				}
			}
}
