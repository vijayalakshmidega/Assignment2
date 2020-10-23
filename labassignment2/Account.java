package labassignment2;
import java.util.Random;
public class Account {
	

		String membername;
		Random rand = new Random();
		String num = 10000 + rand.nextInt(89999) + "";
		double balance;
		
		public Account(String membername,double balance) {
			this.membername=membername;
			this.balance=balance;
		}
		
		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public void deposit(double amount) {
			setBalance(getBalance() + amount);
			
			
		}

		@Override
		public String toString() {
			return "Account [membername=" + membername + ", rand=" + rand + ", num=" + num + ", balance=" + balance + "]";
		}
		
	}


