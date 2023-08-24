package com.hsbc.banking.views;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;
import java.util.ResourceBundle;

public class Java11IOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceBundle resourceBundle=ResourceBundle.
				getBundle("com/hsbc/banking/resources/file");
		//read dir name and file name from properties
		String dirName=resourceBundle.getString("directoryName");
		String fileName=resourceBundle.getString("carFileName");		
		Path path=Paths.get(dirName, fileName);
		System.out.println(path.getFileName());
		//read the contents of the file
	    try {
	    	Files.writeString(path,"XUV 700\t7",StandardOpenOption.APPEND);
			//String content=Files.readString(path);
			//System.out.println(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
