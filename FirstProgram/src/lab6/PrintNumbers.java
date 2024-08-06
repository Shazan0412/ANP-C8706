package lab6;

class PrintNumbers implements Runnable {
	    private int start;
	    private int end;

	    public PrintNumbers(int start, int end) {
	        this.start = start;
	        this.end = end;
	    }

	    @Override
	    public void run() {
	        String threadName = Thread.currentThread().getName();
	        System.out.println("Thread " + threadName + " started");

	        for (int i = start; i <= end; i++) {
	            System.out.println(threadName + ": " + i);
	        }

	        System.out.println("Thread " + threadName + " finished");
	    }
	
}

