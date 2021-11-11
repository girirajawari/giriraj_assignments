package ExceptionsPart;
import java.util.*;

public class SavingsAccount {

	public static void main(String[] args) throws IllegalBankingTransactionException,InsufficientBalanceException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your deposit");
		double deposit = scanner.nextDouble();
		double balance = deposit;
		balance+=deposit;
		System.out.println("Enter your withdraw Amount");
		double withdraw = scanner.nextDouble();
		withdraw( withdraw,balance);
		scanner.close();
	}

	private static void withdraw(double withdraw, double balance) throws IllegalBankingTransactionException,InsufficientBalanceException {
		if(withdraw <= balance && withdraw >0) {
			System.out.println("Hi Take your amount "+ balance );
			
		}
		else if(withdraw <0) {
			throw new IllegalBankingTransactionException();
			
		}
		else if(withdraw > balance || withdraw ==0) {
			throw new InsufficientBalanceException ();
			
		}
		
	}
}


