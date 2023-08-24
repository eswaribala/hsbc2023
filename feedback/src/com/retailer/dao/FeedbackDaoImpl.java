package com.retailer.dao;

import java.util.Random;

import com.retailer.dtos.Report;
import com.retailer.exceptions.FeedbackRatingException;
import com.retailer.models.Car;
import com.retailer.models.Feedback;

public class FeedbackDaoImpl implements FeedbackDao {

	private CarDao carDao;
	
	@Override
	public Feedback[] generateFeedback() {
		// TODO Auto-generated method stub
		carDao=new CarDaoImpl();
		Car[] cars=carDao.generateCars();
		Feedback[] feedbacks=new Feedback[5];
		byte rating=0;
		for(int i=0;i<feedbacks.length;i++) {
			 try {
			generateRating();
			feedbacks[i]=new Feedback("Customer"+i,"City"+i,
					cars[new Random().nextInt(3)],
					rating,
					rating);
			 }
			 catch(FeedbackRatingException feedbackRatingException) {
				 throw feedbackRatingException;
			 }
			 
			
		}
		
		
		return feedbacks;
	}
	@Override
	public Report[] computeAverageFeedback() {
		// TODO Auto-generated method stub
		carDao=new CarDaoImpl();
		Car[] cars=carDao.generateCars();
		//two dim to store sum and count
		int[][] data=new int[cars.length][2];
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++)
				data[i][j]=0;		}		
		
		
		for(Feedback feedback : generateFeedback()) {
		   for(int i=0;i<data.length;i++) {
			   if(feedback.getCar().getModelName()==cars[i].getModelName()) {
				   data[i][0]+=feedback.getDrivingComfortRating()+feedback.getSeatComfortRating();
			       data[i][1]++; 			   }
		   }        			
		}
		
		Report[] reports=new Report[3];
		for(int i=0;i<data.length;i++) {
			if(data[i][0]==0)
		      reports[i]=new Report(cars[i],0);
			else
				reports[i]=new Report(cars[i],data[i][0]/data[i][1]);	
				
		}
		
		return reports;
	}
	
	private static byte generateRating() {
		byte rating=(byte) new Random().nextInt(10);
		if(rating>5)
			throw new FeedbackRatingException("Rating "
					+ "should be between 1 to 5");
		else
			return rating;
	}

}
