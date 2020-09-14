package com.training.threads;

class MyBussinessLogic extends Thread {
	

	public void run() {
		System.out.println("run method started........");

		for (int i = 0; i < 10; i++) {
			System.out.println("value of i is " + i + " in thread " + Thread.currentThread().getName() + " "
					);
		}
		System.out.println("run method stopped.............."+Thread.currentThread().getName());
	}
}

public class ThreadEx1 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());

		// max = 10; min =1; norm =5
		System.out.println((Thread.currentThread().getPriority()));

		MyBussinessLogic mb = new MyBussinessLogic();

		// it will create os level thread on behalf of java and invoke run() method
		mb.start();
		
		MyBussinessLogic mb2 = new MyBussinessLogic();
		mb2.setName("first name");
		mb2.start();
		
		MyBussinessLogic mb3 = new MyBussinessLogic();
		mb3.setName("Second name");
		mb3.start();
		
		MyBussinessLogic mb4 = new MyBussinessLogic();
		mb4.setPriority(Thread.MAX_PRIORITY);
		mb4.setName("Third name");
		mb4.start();
		
		try {
			mb.join();
			mb2.join();			//Waiting for children to join
			mb3.join();
			mb4.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("in thread ->"+Thread.currentThread().getName());
	}
}
