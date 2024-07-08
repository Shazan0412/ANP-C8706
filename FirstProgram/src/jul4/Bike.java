package jul4;

	abstract class Bike {
	    abstract void run();

	    void bikeBody() {
	        System.out.println("This is the body of the bike");
	    }
	}

	class Honda extends Bike {
	    @Override
	    void run() {
	        System.out.println("Honda bike is running");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Honda honda = new Honda();

	        honda.bikeBody();

	        honda.run();
	    }
	}

