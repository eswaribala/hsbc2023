package com.continental.utility;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionLambda {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<String> genre = new ArrayList<String>(Arrays.asList("rock", "pop", "jazz", "reggae","pop"));
		List<File> filesInFolder = Files.walk(Paths.get("."))
                .filter(Files::isRegularFile)
                .map(Path::toFile)
                .collect(Collectors.toList());
		
		filesInFolder.stream().forEach(
				
						 
					    file -> {
					        try {
								System.out.println(file.getCanonicalPath());
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					    }
			);
		
		
		
		HashSet<String> genreSet = genre.stream().collect(() -> new HashSet<String>(), (b, c) -> b.add(c), (b, c) -> b.addAll(c));
	   genreSet.stream().forEach((String x)->System.out.println(x));
	   System.out.println(genre.stream().filter(s -> s.length() <= 4).count());

Optional<String> combinedgenre = genre.stream().reduce((b, c) -> b.concat(",").concat(c));

Stream streamOfLetters = Stream.of("abc", "cde", "efg", "jkd", "res"); 
ArrayList list = new ArrayList<>(); streamOfLetters.forEach(list::add);
Stream streamOfNumbers = Stream.of("one", "two", "three", "four", "five"); 


Stream<String> streamOfString = Stream.of("Java", "C++", "JavaScript", "Scala", "Python"); 
//converting Stream to List using Collectors.toList() method 
streamOfString = Stream.of("code", "logic", "program", "review", "skill"); 
List<String> listOfStream = streamOfString.collect(Collectors.toList()); 
System.out.println("Java 8 Stream to List, 1st example : " + listOfStream); 
// Java 8 Stream to ArrayList using Collectors.toCollection method 
streamOfString = Stream.of("one", "two", "three", "four", "five"); 
listOfStream = streamOfString.collect(Collectors.toCollection(ArrayList::new));
System.out.println("Java 8 Stream to List, 2nd Way : " + listOfStream);
// 3rd way to convert Stream to List in Java 8 
streamOfString = Stream.of("abc", "cde", "efg", "jkd", "res"); 
ArrayList<String> list1 = new ArrayList<>(); 
streamOfString.forEach(list1::add); 
System.out.println("Java 8 Stream to List, 3rd Way : " + list); 

streamOfString = Stream.of("one", "two", "three", "four", "five"); 
ArrayList<String> myList = new ArrayList<>(); 
streamOfString.parallel().forEachOrdered(myList::add); 
System.out.println("Java 8 Stream to List, 4th Way : " + myList);
Stream<String> streamOfNames = Stream.of("James", "Jarry", "Jasmine", "Janeth"); 
Object[] arrayOfString = streamOfNames.toArray(); 
List<Object> listOfNames = Arrays.asList(arrayOfString); 
System.out.println("5th example of Stream to List in Java 8 : " + listOfNames); 
Stream<String> streamOfShapes = Stream.of("Rectangle", "Square", "Circle", "Oval"); 
String[] arrayOfShapes = streamOfShapes.toArray(String[]::new); 
List<String> listOfShapes = Arrays.asList(arrayOfShapes); 
System.out.println("modified version of last example : " + listOfShapes); 


	}

}
