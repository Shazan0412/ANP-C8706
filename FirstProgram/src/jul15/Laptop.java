package jul15;

public class Laptop {

	String CompanyName;
	String ModelNumber;	
	Double Price;
		
	public Laptop() {
	}
		
   @Override
	public String toString() {
		return "Laptop [CompanyName=" + CompanyName + ", ModelNumber=" + ModelNumber + ", Price=" + Price + "]";
	}

public Laptop(String companyName, String modelNumber, Double price) {
			this.CompanyName = companyName;
			this.ModelNumber = modelNumber;
			this.Price = price;
	}
			
	public void InstallIDE() {
		System.out.println("Eclipse installed successfully");
	}
		
	void display() {
		System.out.println(CompanyName +" "+ ModelNumber +" "+ Price);
	}

}
