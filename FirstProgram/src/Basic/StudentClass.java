package Basic;

public class StudentClass {
            public static void main(String[] args) {
				
            	student s1 = new student ();
            	s1.name = "Shazan" ;
            	s1.address = "Bhopal" ;
            	s1.subject = "FJWP" ;
            	
            	 s1.display();
			}
            
          void display() {
        
           System.out.println("name is" + name );
           System.out.println("address is" + address );
           System.out.println("subject is" + subject );
          }
}
