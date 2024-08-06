package jul15;


public class ObjectLaptop {
		public static void main(String[] args) {
			Laptop a1 = new Laptop() ;
			a1.CompanyName = "Asus"; 
			a1.ModelNumber = "15s" ;
			a1.Price = (double) 40000; 
			a1.InstallIDE();
			a1.display() ; 
			System.out.println(a1);
			
		    Laptop a2 = new Laptop() ;
		    a2.CompanyName = "Lenovo" ;
		    a2.ModelNumber = "Tuff" ;
		    a2.Price = (double) 45000 ;
		    a2.InstallIDE();
			a2.display() ; 
		    
		    Laptop a3 = new Laptop() ; 
		    a3.CompanyName = "Dell" ; 
		    a3.ModelNumber = "Inspiron" ;
		    a3.Price = (double) 50000 ;
		    a3.InstallIDE();
			a3
			.display() ; 
		}
}