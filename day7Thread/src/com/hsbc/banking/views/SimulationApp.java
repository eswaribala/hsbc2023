package com.hsbc.banking.views;

import java.util.Random;

import com.hsbc.banking.bl.SimulationThread;
import com.hsbc.banking.models.Bridge;
import com.hsbc.banking.models.Toll;
import com.hsbc.banking.models.Vehicle;

public class SimulationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle[] vehicles=new Vehicle[5];
		for(int i=0;i<5;i++)
           vehicles[i]=new Vehicle("TN-12-AJ"+new Random().nextInt(9999));
       Toll toll =new Toll();
       Bridge bridge=new Bridge();
       SimulationThread[] simulationThread=new SimulationThread[5];
       for(int i=0;i<simulationThread.length;i++) {
    	simulationThread[i]=new SimulationThread(vehicles[i],toll,bridge,"Thread-"+i);   
       }
		
	}

}
