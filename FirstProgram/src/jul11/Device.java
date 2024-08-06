package jul11;

public class Device {
	    private String brand;
	    private String model;

	    public Device(String brand, String model) {
	        this.brand = brand;
	        this.model = model;
	    }

	    public void displayDeviceInfo() {
	        System.out.println("Device Information:");
	        System.out.println("Brand: " + brand);
	        System.out.println("Model: " + model);
	    }

	    public void powerOn() {
	        System.out.println("Device is powered on.");
	    }

	    public void powerOff() {
	        System.out.println("Device is powered off.");
	    }


	
	// Main.java
	public class Main {
	    public static void main(String[] args) {
	        Smartphone smartphone = new Smartphone("Apple", "iPhone 13", "iOS 15", 12);

	        smartphone.displaySmartphoneInfo();
	        smartphone.powerOn();
	        smartphone.takePhoto();
	        smartphone.powerOff();
	    }
	}
}
