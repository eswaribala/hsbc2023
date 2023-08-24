package com.hsbc.banking.dao;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.hsbc.banking.models.Feedback;

public interface FeedbackDao {
	
	boolean storeFeedback(Feedback[] feedbacks)throws FileNotFoundException,IOException;

	Feedback[] readFeedback()throws ClassNotFoundException, FileNotFoundException,IOException;
}
