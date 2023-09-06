package com.continental.utility;
import java.util.Optional;

public class OptionalExample {
   public static void main(String[] args) {

      // Creating empty Optional object
      Optional<String> string = Optional.empty();
      Optional<Double> decimal = Optional.empty();

      // Creating Optional object
      Optional<String> string2 = Optional.of("Optinal class example");
      Optional<Double> decimal2 = Optional.of(45.51);

      // Creating nullable Optional object
      Optional<String> string3 = Optional.ofNullable(null);
      Optional<Double> decimal3 = Optional.ofNullable(null);
   }
}