package jul12;

public class Basic {
		public static void main(String[] args) {
			 Employee e1 = new Employee();
		        e1.employeeID = 111;
		        e1.employeeName = "Shazan";
		        e1.employeeSalary = 50000;
		      e1.display() ;
		      
		     Employee e2 = new Employee(112, 45000, "Asjad") ; 
		     e2.display(
		    		 ) ;
		}
}
