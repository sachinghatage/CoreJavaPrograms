package com.thread;

public class DeadLock {

	public static void main(String[] args) {

		String s1="karan";
		String s2="naveen";
		 
		Thread t1=new Thread() {
			public void run() {
				while(true) {
					synchronized(s1) {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						synchronized(s2) {
							System.out.println(s1+s2);
						}
					}
				}
			}
		};
		
		
		 
		Thread t2=new Thread() {
			public void run() {
				while(true) {
					synchronized(s2) {
						synchronized(s1) {
							System.out.println(s1+s2);
						}
					}
				}
			}
		};
		
		
	}

}
