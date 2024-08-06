package jul15;

public class ObjectVehicle {
	public static void main(String[] args) {
		
		Vehicle v = new Vehicle() ;
		v.setCompany("Mahindra");
		v.setModelName("Bolero");
		v.setPrice((double)1200000);
		
		System.out.println(v.getCompany());
		System.out.println(v.getModelName());
		System.out.println(v.getPrice());	
		
		Vehicle v1 = new Vehicle() ;
		v1.setCompany("Suzuki");
		v1.setModelName("Swift");
		v1.setPrice((double)500000);
		
		System.out.println(v1.getCompany());
		System.out.println(v1.getModelName());
		System.out.println(v1.getPrice());
	}
	


}
