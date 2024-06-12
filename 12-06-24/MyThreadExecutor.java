package com.tnsif.daythirteen.multithreading;

public class MyThreadExecutor {

	public static void main(String[] args) {
		
		MyThread A1 = new MyThread(); 
		System.out.println("Before runnable stage Thread is alive or not? "+ A1.isAlive());//checks the thread state before starts
		A1.start(); //prints the statement which is present in MyThread class 
		
		try {
			Thread.sleep(4000);
		}
		
		catch(Exception e) {
			System.out.println("Thread is Interrupted");
		}
		
		System.out.println("After Complete execution of Thread, is alive or not? "+ A1.isAlive());//checks the thread state after it ends

	}

}