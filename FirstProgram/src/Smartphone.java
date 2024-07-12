package FirstLAb;

public class Smartphone extends Device {
    private String operatingSystem;
    private String cameraResolution;

    public Smartphone(String brand, String model, String operatingSystem, String cameraResolution) {
        super(brand, model);
        this.operatingSystem = operatingSystem;
        this.cameraResolution = cameraResolution;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Camera Resolution: " + cameraResolution);
    }

    public void takePhoto() {
        System.out.println("Taking a photo with resolution: " + cameraResolution);
    }
}
