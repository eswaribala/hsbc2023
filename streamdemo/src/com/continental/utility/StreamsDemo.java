package com.continental.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Stack;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
		
		Stack stack =new Stack();
	
		// TODO Auto-generated method stub
		 Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
         stream.forEach(p -> System.out.println(p));
         //Array
         stream = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
         stream.forEach(p -> System.out.println(p));
         //list
         
         List<Integer> list = new ArrayList<Integer>();
         for(int i = 1; i< 10; i++){
             list.add(i);
         }
         stream = list.stream();
         stream.forEach(p -> System.out.println(p));
         //stream iterate
         
         Stream<Date> dstream = Stream.generate(() -> { return new Date();});
        // dstream.forEach(p -> System.out.println(p));
         
         
         //OR
          
         Stream<String> sstream = Stream.of("A$B$C".split("\\$"));
         sstream.forEach(p -> System.out.println(p));
         
       //tokens
         IntStream istream = "12345_abcdefg".chars();
         istream.forEach(p -> System.out.println(p));
          
         //Stream to List
         
         List<Integer> slist = new ArrayList<Integer>();
         for(int i = 1; i< 10; i++){
             slist.add(i);
         }
         Stream<Integer> lstream = slist.stream();
         List<Integer> evenNumbersList = lstream.filter(i -> i%2 == 0).collect(Collectors.toList());
         System.out.print(evenNumbersList);
         
         //stream to array
         
         Stream<Integer> astream = slist.stream();
         Integer[] evenNumbersArr = astream.filter(i -> i%2 == 0).toArray(Integer[]::new);
         System.out.print(evenNumbersArr);
         
         //core stream operations
         
         List<String> memberNames = new ArrayList<>();
         memberNames.add("Amitabh");
         memberNames.add("Shekhar");
         memberNames.add("Aman");
         memberNames.add("Rahul");
         memberNames.add("Shahrukh");
         memberNames.add("Salman");
         memberNames.add("Yana");
         memberNames.add("Lokesh");
         
         //filter
         memberNames.stream().filter((s) -> s.startsWith("A"))
         .forEach(System.out::println);
         
         //map
         
         memberNames.stream().filter((s) -> s.startsWith("A"))
         .map(String::toUpperCase)
         .forEach(System.out::println);
         
         //sort
         memberNames.stream().sorted()
         .map(String::toUpperCase)
         .forEach(System.out::println);
         
         //Terminal operators
         
         //forEach()
         
         memberNames.forEach(System.out::println);
         
         //collect
         
         List<String> memNamesInUppercase = memberNames.stream().sorted()
                 .map(String::toUpperCase)
                 .collect(Collectors.toList());

         System.out.print(memNamesInUppercase);
         
         //match
         
         boolean matchedResult = memberNames.stream()
                 .anyMatch((s) -> s.startsWith("L"));

       System.out.println(matchedResult);

matchedResult = memberNames.stream()
                 .allMatch((s) -> s.startsWith("L"));

System.out.println(matchedResult);

matchedResult = memberNames.stream()
                 .noneMatch((s) -> s.startsWith("L"));

System.out.println(matchedResult);

//count
long totalMatched = memberNames.stream()
.filter((s) -> s.startsWith("A"))
.count();

//Optional

Arrays.asList("a1", "a2", "a3")
.stream()
.findFirst()
.ifPresent(System.out::println);  // a1

//without collection
Stream.of("a1", "a2", "a3")
.findFirst()
.ifPresent(System.out::println);  // a1

Arrays.stream(new int[] {1, 2, 3})
.map(n -> 2 * n + 1)
.average()
.ifPresent(System.out::println);

Stream.of("a1", "a2", "a3")
.map(s -> s.substring(1))
.mapToInt(Integer::parseInt)
.max()
.ifPresent(System.out::println);



System.out.println(totalMatched);
Optional<String> reduced = memberNames.stream()
.reduce((s1,s2) -> s1 + "#" + s2);

reduced.ifPresent(System.out::println);

IntStream.range(1, 4)
.mapToObj(i -> "a" + i)
.forEach(System.out::println);








//parallel stream
ForkJoinPool commonPool = ForkJoinPool.commonPool();
System.out.println("Parallel"+commonPool.getParallelism());    // 3

//-Djava.util.concurrent.ForkJoinPool.common.parallelism=5

Arrays.asList("a1", "a2", "b1", "c2", "c1")
.parallelStream()
.filter(s -> {
    System.out.format("filter: %s [%s]\n",
        s, Thread.currentThread().getName());
    return true;
})
.map(s -> {
    System.out.format("map: %s [%s]\n",
        s, Thread.currentThread().getName());
    return s.toUpperCase();
})
.forEach(s -> System.out.format("forEach: %s [%s]\n",
    s, Thread.currentThread().getName()));

List<Integer> plist = new ArrayList<Integer>();
for(int i = 1; i< 10; i++){
    plist.add(i);
}
//Here creating a parallel stream
Stream<Integer> pstream = plist.parallelStream(); 
Integer[] pevenNumbersArr = pstream.filter(i -> i%2 == 0).toArray(Integer[]::new);
System.out.print(pevenNumbersArr);
         

Stream.of("d2", "a2", "b1", "b3", "c")
.sorted((s1, s2) -> {
    System.out.printf("sort: %s; %s\n", s1, s2);
    return s1.compareTo(s2);
})
.filter(s -> {
    System.out.println("filter: " + s);
    return s.startsWith("a");
})
.map(s -> {
    System.out.println("map: " + s);
    return s.toUpperCase();
})
.forEach(s -> System.out.println("forEach: " + s));
	}

}
