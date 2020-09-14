package com.training.threads;

class MyBussinessLogic2 implements Runnable{

	Thread t;
	
	public MyBussinessLogic2() {
		
	}
	public MyBussinessLogic2(String name,int priority) {
		t=new Thread(this,name);
		t.setPriority(priority);
		t.start();

	}
	public void run() {
		System.out.println("run method started........"+Thread.currentThread().getName());

		for (int i = 0; i < 10; i++) {
			System.out.println("value of i is " + i + " in thread " + Thread.currentThread().getName() + " "
					);
		}
		System.out.println("run method stopped.............."+Thread.currentThread().getName());
		
	}
	
}

public class ThreadEx2 {

	public static void main(String[] args) {
		
		MyBussinessLogic2 mb = new MyBussinessLogic2();
		
		Thread t1= new Thread(mb);
		
		t1.setPriority(6);
		t1.setName("Shruth");
		t1.start();
		
		new MyBussinessLogic2("Namit", 7);
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main method ending,,,,,,,,,,,,");
	}
}
