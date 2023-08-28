package com.hsbc.banking.bl;

public class Clock extends Thread{

	public String tick() {
		return "tick";
	}
	public String tock() {
		return "tock";
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=1;i<=60;i++) {
			System.out.println(tick()+i+tock()+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

}
