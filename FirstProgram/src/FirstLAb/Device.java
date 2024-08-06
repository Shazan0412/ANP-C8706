package FirstLAb;

public class Device {
    private String brand;
    private String model;
    private boolean powerStatus;

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.powerStatus = false; // Initially, the device is off
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    public void powerOn() {
        if (!powerStatus) {
            powerStatus = true;
            System.out.println("The device is now ON.");
        } else {
            System.out.println("The device is already ON.");
        }
    }

    public void powerOff() {
        if (powerStatus) {
            powerStatus = false;
            System.out.println("The device is now OFF.");
        } else {
            System.out.println("The device is already OFF.");
        }
    }
}
