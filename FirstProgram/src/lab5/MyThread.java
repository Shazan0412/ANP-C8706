package lab5;

public class MyThread extends Thread {
    private int sum;

    @Override
    public void run() {
        sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
    }

    public int getSum() {
        return sum;
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();

        // Wait for the thread to finish execution
        thread.join();

        System.out.println("The sum of numbers from 1 to 100 is: " + thread.getSum());
        System.out.println("Main thread is done!");
    }
}

