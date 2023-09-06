package com.continental.utility;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Files.lines(Paths.get("src/com/continental/utility/App.java")).
		forEach(System.out::println);
	}
	
	

}
