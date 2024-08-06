package jul26;

public class Test {
		public static void main(String[] args) throws Exception {
			
			MyThread mt = new MyThread() ;
			
			mt.start();
			
			synchronized (mt) {
				System.out.println("main thread calls the wait method");
				
				
				mt.wait();
				
				System.out.println("main thread got the notification");
				
				
				System.out.println(mt.num);
			}
		}
}
