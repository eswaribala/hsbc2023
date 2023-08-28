package com.hsbc.banking.bl;

public class SimpleThread extends Thread{

	private String name;	
	
	public SimpleThread(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(char ch : this.name.toCharArray()) {
			System.out.print(ch);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Halted....");
				break;
			}
		}
		
	}

	
	
}
