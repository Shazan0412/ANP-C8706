package jul1;

public class ObjectCounter {
			
		private static int objectCount = 0; 

	    ObjectCounter() {
	        objectCount++; 
	}

	    public static int getObjectCount() {
	        return objectCount; 
	    }
	    
	    public static void main(String[] args) {

	        ObjectCounter obj1 = new ObjectCounter();
	        ObjectCounter obj2 = new ObjectCounter();
	        ObjectCounter obj3 = new ObjectCounter();
	        ObjectCounter obj4 = new ObjectCounter();
	        ObjectCounter obj5 = new ObjectCounter();

	        System.out.println("Number of objects created: " + ObjectCounter.getObjectCount());
	    }
}