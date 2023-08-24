package com.hsbc.banking.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ResourceBundle;

import com.hsbc.banking.models.Feedback;

public class FeedbackDaoImpl implements FeedbackDao {

	private File file;
	private ResourceBundle resourceBundle;
	String dirName,fileName;
	
	public FeedbackDaoImpl() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		this.resourceBundle=ResourceBundle.
				getBundle("com/hsbc/banking/resources/file");
		dirName=this.resourceBundle.getString("directoryName");
		fileName=this.resourceBundle.getString("feedbackFileName");
		file=new File(dirName,fileName);
		if(!file.exists())
			file.createNewFile();
		
	}

	@Override
	public boolean storeFeedback(Feedback[] feedbacks) throws FileNotFoundException, 
	IOException {
		// TODO Auto-generated method stub
		ObjectOutputStream objectOutputStream=
				new ObjectOutputStream(
						new FileOutputStream(file));
		for(Feedback feedback:feedbacks )
			objectOutputStream.writeObject(feedback);
		
		objectOutputStream.close();
		return true;
	}

	private int countRecords() throws 
	FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream objectInputStream=new 
				ObjectInputStream(new FileInputStream(file));
		int count=0;
		try {
		while(objectInputStream.readObject()!=null) {
			count++;
		}
		}
		catch(EOFException exception)
		{
			
		}

		objectInputStream.close();
		return count;		
		
	}
	
	@Override
	public Feedback[] readFeedback() throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Feedback[] feedbacks=new Feedback[countRecords()];
		ObjectInputStream objectInputStream=new 
				ObjectInputStream(new FileInputStream(file));
		Object obj=null;
		int i=0;
		try {
		while((obj=objectInputStream.readObject())!=null) {
			feedbacks[i]=(Feedback) obj;
			i++;
		}
		}
		catch(EOFException eof) {
			
		}
		objectInputStream.close();
		return feedbacks;
	}

}
