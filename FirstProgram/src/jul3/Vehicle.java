package jul3;

public class Vehicle {
	    public String drive() {
	        return "Drive.";
	    }
	
	    public static void main(String[] args) {
	        Vehicle car = new Car();
	        System.out.println("Driving a car: " + car.drive());

	        Vehicle motorcycle = new Motorcycle();
	        System.out.println("Driving a motorcycle: " + motorcycle.drive());
	    }
}
