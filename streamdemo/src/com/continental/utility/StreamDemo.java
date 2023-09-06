package com.continental.utility;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<String> lines
		= Files.readAllLines(Paths.get("data.txt"), Charset.defaultCharset());
		Map<Integer, List<String>> wordGroups
		= lines.stream()
		.map(line -> line.replaceAll("\\W", "\n").split("\n"))
		.flatMap(Arrays::stream)
		.sorted()
		.distinct()
		.collect(Collectors.groupingBy(String::length));
		wordGroups.forEach( (count, words) -> {
		words.forEach(word -> System.out.printf("%d %s %n", count, word));
		});// count is word length
	}

}
