package com.retailer.views;

import com.retailer.dao.FeedbackDao;
import com.retailer.dao.FeedbackDaoImpl;
import com.retailer.dtos.Report;

public class ReportApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  FeedbackDao feedbackDao=new FeedbackDaoImpl();
	  for(Report report: feedbackDao.computeAverageFeedback()) {
		  System.out.println(report);
	  }
	  
		
	}

}
