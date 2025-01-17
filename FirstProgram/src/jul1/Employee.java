package jul1;

public class Employee {
		    private String name;
		    private int id;
		    private double salary;
		    private String department;

		    public Employee(String name, int id, double salary, String department) {
		        this.name = name;
		        this.id = id;
		        this.salary = salary;
		        this.department = department;
		    }

		    public void display() {
		        System.out.println("Name: " + name);
		        System.out.println("ID: " + id);
		        System.out.println("Salary: " + salary);
		        System.out.println("Department: " + department);
		        System.out.println("-------------");
		    }

		    public static void main(String[] args) {
		        Employee emp1 = new Employee("Shazan", 101, 50000, "CSE");
		        Employee emp2 = new Employee("Ravi", 102, 60000, "CSE");
		        Employee emp3 = new Employee("Aryan", 103, 70000, "IT");

		        emp1.display();
		        emp2.display();
		        emp3.display();
		    }
		}

