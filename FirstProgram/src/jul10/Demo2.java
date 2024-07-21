package jul10;

	public class Demo2 {
			public static void main(String[] args) {
	
	String s  = new String("Shazan") ;
	
	char arr[] = {'S', 'h', 'a', 'z', 'a', 'n'} ;
			
	String s2  = new String(arr) ;
	
	System.out.println(s2);
	
	System.out.println(s);
	
	
	String j  = "Shazan" ;
	String h = "Shazan" ; // welcome  
	
     j.concat(" CSE") ; // this concept is called strings are immutable in java 
	
       j = j.concat(" CSE") ;
    
    
	System.out.println(j);
	
	
	System.out.println(j == h); // true 
	System.out.println(j==s);  // false 
	
	System.out.println(j.equals(s)); // true
	System.out.println(j.equals(h));  // true 
	
	
	
	System.out.println(h.charAt(1));
	System.out.println(h.length());
	System.out.println(h.substring(3));
	System.out.println(h.substring(1, 4));
	System.out.println(h.toUpperCase());
	System.out.println(h.contains("lco"));
			}
	}