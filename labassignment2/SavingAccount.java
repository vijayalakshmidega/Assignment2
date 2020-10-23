package labassignment2;

public class SavingAccount extends Account{
	
		private final static double RATE = 5;
		private final static double MAX_WITHDRAW_LIMIT = 5000.0;
		private final static double MIN_BALANCE = 500.0;
		
		public SavingAccount(String membername, double balance) {
			super(membername, balance);
			
		}
		public double getBalance(double amount) {
			double interest;
			if(getBalance()>=MIN_BALANCE) {
				interest=getBalance()*RATE;
			}
			else
				interest=0.0;
			return interest;
	    }
		public void withdraw(double amount) {
			if((getBalance()-amount)>=MIN_BALANCE) {
				setBalance(getBalance()-amount);
			}
			else
				System.out.println("Insufficient money");
		}
		
	}


