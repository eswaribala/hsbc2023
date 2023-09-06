package com.continental.utility;

import java.util.Optional;

public class OptionalIfExample {
   public static void main(String[] args) {

      Optional<String> string = Optional.empty();
      if(string.isPresent()){
         System.out.println(string.get());
      }
      
      Optional<String> string2 = Optional.of("Optinal class example");
      if(string2.isPresent()){
         System.out.println(string2.get());
      }

      Optional<String> string3 = Optional.ofNullable(null);
      if(string3.isPresent()){
         System.out.println(string3.get());
      }
      
      Optional<String> optional1 = Optional.empty();
      optional1.ifPresent(System.out::println);

      Optional<String> optional2 = Optional.of("Java Optional example");
      optional2.ifPresent(System.out::println);
   }
}