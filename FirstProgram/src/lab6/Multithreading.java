package lab6;

public class Multithreading {
	    public static void main(String[] args) {
	        Thread thread1 = new Thread(new PrintNumbers(1, 20), "Thread1");
	        Thread thread2 = new Thread(new PrintNumbers(21, 60), "Thread2");

	        thread1.start();
	        thread2.start();

	        for (int i = 61; i <= 80; i++) {
	            System.out.println("Main Thread: " + i);
	        }
	    }
}
	

	
