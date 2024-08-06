package jul24;

public class Employee {
	
	
		public String EmpName ;
		public int EmpID ;
		public Double Salary ;
		
		
		public Employee(String empName, int empID, Double salary) {
			this.EmpName = empName;
			this.EmpID = empID;
			this.Salary = salary;
		}


		@Override
		public String toString() {
			return "Employee [EmpName=" + EmpName + ", EmpID=" + EmpID + ", Salary=" + Salary + "]";
		}
		
		
		
		
}
