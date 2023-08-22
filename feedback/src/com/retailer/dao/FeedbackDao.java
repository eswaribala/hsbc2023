package com.retailer.dao;

import com.retailer.dtos.Report;
import com.retailer.models.Feedback;

public interface FeedbackDao {

	Feedback[] generateFeedback();
	Report[] computeAverageFeedback();
	
}
