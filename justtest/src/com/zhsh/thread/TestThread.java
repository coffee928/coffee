package com.zhsh.thread;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Thread t = new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(9000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("ggg");
			}
		});
		
		t.start();
		t.start();
			
		Object ooo;
		
		
		ReentrantReadWriteLock rrw;//实现原理
		
		

	}

}
