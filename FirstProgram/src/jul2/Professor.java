package jul2;

	public class Professor {
	    private String name;

	    public Professor(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }
	}
	
   private class Department {
	    private Professor head;
	    private String name;

	    public Department(String name, Professor head) {
	        this.name = name;
	        this.head = head;
	    }

	    public Professor getHead() {
	        return head;
	    }

	    public String getName() {
	        return name;
	    }   
	}

	
  public class University {
	    private Department department;

	    public University(Department department) {
	        this.department = department;
	    }

	    public Department getDepartment() {
	        return department;
	    }
	}
    public class Main{
	    public static void main(String[] args) {
	        Professor professor = new Professor("Nitin Jain");
	        Department department = new Department("Computer Science", professor);
	        University university = new University(department);

	        System.out.println("University Department: " + university.getDepartment().getName());
	        System.out.println("Department Head: " + university.getDepartment().getHead().getName());
	    }
	}
