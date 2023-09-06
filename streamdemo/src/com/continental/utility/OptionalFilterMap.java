package com.continental.utility;
import java.util.Optional;

public class OptionalFilterMap {
   public static void main(String[] args) {

      Optional<String> optional = Optional
    		  .of("Java Optional example");

      // Using filter() method
      Optional<String> optional1 = optional
    		  .filter(s -> s.contains("Optional"));
      optional1.ifPresent(System.out::println);

      // Using map() method
      Optional<String> optional2 = optional
    		  .map(String::toUpperCase);
      optional2.ifPresent(System.out::println);

      // Using flatMap() method
      Optional<String> optional3 = optional
    		  .flatMap(s -> Optional.of(s + " - flatMap() method"));
      optional3.ifPresent(System.out::println);
   }
}