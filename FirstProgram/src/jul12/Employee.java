package jul12;

public class Employee {
	int employeeID;
    int employeeSalary;
    String employeeName;
    	
    public Employee() {
    	
    }
    
    public Employee(int employeeID , int employeeSalary, String employeeName) {
    	this.employeeID = employeeID ;
    	this.employeeName = employeeName ;
    	this.employeeSalary = employeeSalary ;
    }
    
    public void ShiftIn() {
    	System.out.println("Shift Started");
    }
    
    public void ShiftOut() {
    	System.out.println("Shift Ended");
    }
    void display() {
    	System.out.println(employeeID+" "+ employeeName+" "+employeeSalary);
    	
    }
}
