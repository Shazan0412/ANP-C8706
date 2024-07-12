package FirstLAb;
public class Main {
	   public static void main(String[] args) {
	        Device device = new Device("Realme", "11 5g");
	        device.displayInfo();
	        device.powerOn();
	        device.powerOff();

	        Smartphone smartphone = new Smartphone("Realme", "11 5g", "Android", "108MP");
	        smartphone.displayInfo();
	        smartphone.powerOn();
	        smartphone.takePhoto();
	        smartphone.powerOff();
	    }

}
