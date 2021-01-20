package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		try {
			System.out.print("Number Account: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Balance initial: ");
			double balance = sc.nextDouble();
			System.out.print("WithdrawLimit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit );
			
			System.out.println("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			
			account.withdraw(amount);
			System.out.println(account);

		}
		catch(DomainException e){
			System.out.println("Withdraw error:" + e.getMessage());
		}
	}

}
