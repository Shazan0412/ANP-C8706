package jul18;

import java.util.HashSet;

public class ArrayList {
	public static void main(String[] args) {
//		Stack <Integer> = new Stack<> ;
		HashSet<String> set = new HashSet<String>() ;
		set.add("Ravi") ;
		set.add("Shazan") ;
		set.add("Asjad") ;
		
		set.add("Omair") ;
		set.add("Ahsan") ;
		set.add("Ayesha") ;
		
		
		System.out.println(set);
		
		
		LinkedHashSet<String> sset = new LinkedHashSet<String>() ;
		set.add("Ravi") ;
		set.add("Shazan") ;
		set.add("Asjad") ;
		
		set.add("Omair") ;
		set.add("Ahsan") ;
		set.add("Ayesha") ;
		
		
		System.out.println(sset);
	}

}
