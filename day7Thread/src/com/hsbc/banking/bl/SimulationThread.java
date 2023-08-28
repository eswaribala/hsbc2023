package com.hsbc.banking.bl;

import java.util.Random;

import com.hsbc.banking.models.Bridge;
import com.hsbc.banking.models.Toll;
import com.hsbc.banking.models.Vehicle;

public class SimulationThread implements Runnable{
  
	private Vehicle vehicle;
	private Toll toll;
	private Bridge bridge;
	
	public SimulationThread(Vehicle vehicle,Toll toll,
			Bridge bridge, String name) {
		super();
		this.vehicle=vehicle;		
		this.toll=toll;
		this.bridge=bridge;
		
		// TODO Auto-generated constructor stub
		new Thread(this,name).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(this.vehicle) {
		System.out.println("Vehicle-"+this.vehicle.getRegNo()
		+"-crossing"+this.toll.message()
		+"-crossing"+this.bridge.message()
		+"-"+Thread.currentThread().getName());
		}
		}

}
