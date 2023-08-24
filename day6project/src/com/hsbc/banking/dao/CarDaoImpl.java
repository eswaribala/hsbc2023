package com.hsbc.banking.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

import com.hsbc.banking.models.Car;

/**
 * 
 * @author Balasubramaniam
 * @version 1.0
 */
public class CarDaoImpl implements CarDao{

	private File file;
	private ResourceBundle resourceBundle;
	
	@Override
	public boolean createCarStore() throws IOException {
		// TODO Auto-generated method stub
		this.resourceBundle=ResourceBundle.
				getBundle("com/hsbc/banking/resources/file");
		//read dir name and file name from properties
		String dirName=this.resourceBundle.getString("directoryName");
		String fileName=this.resourceBundle.getString("carFileName");		
		//file instance
		file=new File(dirName);
		//create directory
		if(!file.exists()) {
			file.mkdir();
		}
		
		file=new File(dirName,fileName);
		if(!file.exists())
			return file.createNewFile();
		else
			return false;		
		
	}

	@Override
	public boolean storeCars(Car[] cars) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedWriter bufferedWriter=new 
				BufferedWriter(new FileWriter(file,true));
		bufferedWriter.append("Model Name\t Seating Capacity\n");
		for(Car car : cars) {
			bufferedWriter.append(car.getModelName()
					+"\t"+car.getSeatingCapacity()+"\n");
			
		}
		bufferedWriter.close();
		
		return true;
	}

	@Override
	public Car[] retrieveCars() throws IOException {
		// TODO Auto-generated method stub

		BufferedReader reader=new BufferedReader(new 
				FileReader(file));		
		Car[] cars=new Car[3];
		String line=null;
	    StringTokenizer tokenizer;
	    int i=0;
	    reader.readLine();
		while((line=reader.readLine())!=null) {
			cars[i]=new Car();
			tokenizer=new StringTokenizer(line,"\t");
			while(tokenizer.hasMoreElements()) {
				cars[i].setModelName(tokenizer.nextElement().toString());
				cars[i].setSeatingCapacity(Byte.parseByte(tokenizer.nextElement().toString()));
				}
			i++;
			}
		reader.close();
		return cars;
	}

	@Override
	public boolean duplicateCarFileContent() throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin=new FileInputStream(file);
		this.resourceBundle=ResourceBundle.
				getBundle("com/hsbc/banking/resources/file");
		File outFile=new 
				File(this.resourceBundle.
						getString("duplicateFileName"));
		if(!outFile.exists()) {
			outFile.createNewFile();
		}
		FileOutputStream fout=new FileOutputStream(outFile);
		byte[] content= new byte[(int) (file.length())];
		fin.read(content);
		fout.write(content);
		fin.close();
		fout.close();		
		return true;
	}

}
