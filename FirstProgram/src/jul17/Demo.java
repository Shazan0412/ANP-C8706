package jul17;

public class Demo {
	public static void main(String[] args) {
		
		
		Bank bb = new Bank() ;
		
		System.out.println(bb.amount);
		
		try {
			bb.withdraw(600) ;
		} catch (LowBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
