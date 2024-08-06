package jul17;

public class Bank {
	
		double amount ;
		
		public Bank() {
			
			amount = 500 ;
		}
		
		public void withdraw(double payment) throws LowBalanceException {
			if(payment>amount) {
				throw new LowBalanceException("you can't withdraw amount") ;
			}else {
				amount = amount - payment ;
				System.out.println("Please receive your amount");
			}
			System.out.println("your current balance is" +amount);
		}
}
