package com.training.threads;

public class Account {

	private int money;
	public Account(int money) {
		this.money=money;
	}
	
	public synchronized void withdraw(int amount) {
		if(amount<money) {
			try {
				Thread.sleep(1000);
				this.money=this.money-amount;
				System.out.println("Received amount : "+amount+"  available bal:"+this.money);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("Balance: "+this.money);
		}
		else
		{
			System.out.println("Sorry "+Thread.currentThread().getName()+" no bal");
		}
	}
}
