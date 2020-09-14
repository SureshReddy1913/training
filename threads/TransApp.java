package com.training.threads;

public class TransApp implements Runnable {

	private Account account;
	private int amount;
	public TransApp(Account account2, int i, String string) {
		this.account=account2;
		this.amount=i;
		new Thread(this,string).start();
		
	}

	public static void main(String[] args) {
		Account account=new Account(1000);
		new TransApp(account,500,"Harry");
		new TransApp(account, 750, "zzz");
	}

	public void run() {
		synchronized (account) {
			account.withdraw(amount);
		}	
	}
}
