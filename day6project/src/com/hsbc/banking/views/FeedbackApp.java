package com.hsbc.banking.views;

import java.io.IOException;
import java.util.Random;

import com.hsbc.banking.dao.FeedbackDao;
import com.hsbc.banking.dao.FeedbackDaoImpl;
import com.hsbc.banking.models.Feedback;


public class FeedbackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FeedbackDao feedbackDao;
      try {
		feedbackDao=new FeedbackDaoImpl();
		feedbackDao.storeFeedback(generateFeedback());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
      
	}
	
	
	private static Feedback[] generateFeedback() {
		
	 Feedback[] feedbacks=new Feedback[10];
	 byte rating=0;
	 String[] models= {"Ford Ecosport","Toyota Innova","Hyundai i20"};
		for(int i=0;i<feedbacks.length;i++) {
			rating=(byte) new Random().nextInt(5);
			feedbacks[i]=new Feedback("Customer"+i,"City"+i,
					models[new Random().nextInt(3)],
					rating,
					rating);
			 
	}
	return feedbacks;	
	}	
	

}
