package labassignment2;

public class CurrentAccount extends Account {
	
		private int tradeLisscencecnumber;
		private static final double MIN_BALANCE = 500.0;
	    public CurrentAccount(String membername, double balance) {
			super(membername, balance);
		}
	    public void getAccountBalance() {
	    	System.out.println(getBalance());
	    }
	    public void withdraw(double amount) {
	    	if((getBalance()-amount)>=MIN_BALANCE)
	    	{
	    		setBalance(getBalance()-amount);
	    	}
	    	else
	    		System.out.println("Insuffuiecient");
		}
	    
	}


