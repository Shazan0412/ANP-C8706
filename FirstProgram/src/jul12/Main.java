package jul12;

public class Main {
	    public static void main(String[] args) {
	        Mobile Vivo = new Mobile();
	        Vivo.setCameraPixel(108);
	        Vivo.setBatteryMAh(5000);
	        Vivo.setDisplayType("AMOLED");
	        Vivo.setPrice(15000);
	        Vivo.installApp();
	        System.out.println("Sum: " + Vivo.calculation(10, 20, 30));
	        
	        
	        Mobile Oppo = new Mobile(12, 3000, "LED", 20000);
	    }
	}



