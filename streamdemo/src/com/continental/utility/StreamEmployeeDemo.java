package com.continental.utility;

import static com.continental.enums.Gender.FEMALE;
import static com.continental.enums.Gender.MALE;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Map;
import java.util.StringJoiner;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.continental.model.Employee;
import com.continental.model.Person;
import com.continental.model.PersonDTO;


public class StreamEmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Core Stream Operations
		        
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
        System.out.println("\nAny Match....");   
        boolean matchedResult = memberNames.stream()
                .anyMatch((s) -> s.startsWith("L"));

      System.out.println(matchedResult);
      System.out.println("\nAll Match....");
		matchedResult = memberNames.stream()
		                .allMatch((s) -> s.startsWith("L"));

	System.out.println(matchedResult);
	
	matchedResult = memberNames.stream()
                .noneMatch((s) -> s.startsWith("L"));

	System.out.println(matchedResult);
	
	//<R> R collect(Supplier<R> supplier,  BiConsumer<R,? super T> accumulator,  BiConsumer<R,R> combiner)
	Stream<Employee> empStreamData = Stream.of(arrayOfEmps);
    
    List<Employee> empNames = empStreamData
        .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

    System.out.println(empNames);
	
	//count
	System.out.println("\n count....");
	long totalMatched = memberNames.stream()
	.filter((s) -> s.startsWith("A"))
	.count();
		
		
		
		
		
		
		
		//Stream creation
		Stream<Employee> employeeStream=Stream.of(arrayOfEmps);
		//Stream Builder
		Stream.Builder<Employee> empStreamBuilder = Stream.builder();

		empStreamBuilder.accept(arrayOfEmps[0]);
		empStreamBuilder.accept(arrayOfEmps[1]);
		empStreamBuilder.accept(arrayOfEmps[2]);

		Stream<Employee> empStream = empStreamBuilder.build();
		
		//instance of
		List<Employee> empList = Arrays.asList(arrayOfEmps);
		System.out.println(empList.stream() instanceof Stream<?>);
		
		//filter
		List<Employee> filtered =
			    empList
			        .stream()
			        .filter(e -> e.getFirstName().startsWith("D"))
			        .collect(Collectors.toList());

			System.out.println(filtered);
			
        //grouping
			Map<String, List<Employee>> employeesByGender = empList
				    .stream()
				    .collect(Collectors.groupingBy(e -> e.getGender().toString()));

			employeesByGender
				    .forEach((gender, e) -> System.out.format("Gender %s: %s\n", gender, e));
		//Aggregations
			//averaging
			Double averageExperience = empList
				    .stream()
				    .collect(Collectors.averagingLong(e -> (ChronoUnit.YEARS.between(e.getDoj(),
				    		LocalDate.now()))));

				System.out.println(averageExperience);   
				//summary statistics
				LongSummaryStatistics  summaryExperience = empList
					    .stream()
					    .collect(Collectors.summarizingLong(e -> (ChronoUnit.YEARS.between(e.getDoj(),
					    		LocalDate.now()))));

					System.out.println(summaryExperience); 
					
			   //map and join
			//partial response		
			String phrase = empList
				    .stream()
				    .filter(e ->(ChronoUnit.YEARS.between(e.getDoj(),
				    		LocalDate.now())) >= 18)
				    .map(e -> e.getFirstName())
				    //(CharSequence delimiter, CharSequence prefix, CharSequence suffix)
				    .collect(Collectors.joining(" and ", "In India ", " are of legal age."));

				System.out.println(phrase);		
				
				
				//mapping exp and name
				Map<Long, String> map = empList
					    .stream()
					    //keymapper,valuemapper, merge function
					    .collect(Collectors.toMap(
					        e -> (ChronoUnit.YEARS.between(e.getDoj(),
						    		LocalDate.now())),
					        e -> e.getFirstName().toString(),
					        (name1, name2) -> name1 + ";" + name2));

					System.out.println(map);
				
				
				//merging names
				Collector<Employee, StringJoiner, String> employeeNameCollector =
					    Collector.of(
					        () -> new StringJoiner(" | "),          // supplier
					        (j, e) -> j.add(e.getFirstName().toUpperCase()),  // accumulator
					        (j1, j2) -> j1.merge(j2),               // combiner
					        StringJoiner::toString);                // finisher

					String names = empList
					    .stream()
					    .collect(employeeNameCollector);

					System.out.println(names);
		//flat map
					
					List<Developer> team = new ArrayList<>();
			        Developer polyglot = new Developer("esoteric");
			        polyglot.add("clojure");
			        polyglot.add("scala");
			        polyglot.add("groovy");
			        polyglot.add("go");

			        Developer busy = new Developer("pragmatic");
			        busy.add("java");
			        busy.add("javascript");

			        team.add(polyglot);
			        team.add(busy);

			        team.stream()
				    .flatMap(t -> t.getLanguages().stream())
				    .forEach(l -> System.out.println(l));
			        
			        List<String> teamLanguages = team.stream().
			                map(d -> d.getLanguages()).
			                flatMap(l -> l.stream()).
			                collect(Collectors.toList());
			        System.out.println(teamLanguages);
					
					
	//Reducer 1
     System.out.println("Reducer.....");	        
    empList
    .stream()
    .reduce((e1, e2) -> (ChronoUnit.YEARS.between(e1.getDoj(),
    		LocalDate.now())) > (ChronoUnit.YEARS.between(e2.getDoj(),
    	    		LocalDate.now()))  ? e1 : e2)
    .ifPresent(System.out::println);    // david
    
    
    //Reducer 2
    //Accumulator
    Integer expSum = empList
    	    .stream()
    	    .reduce(0,
    	        (sum, e) -> {
    	            System.out.format("accumulator: sum=%s; employee=%s\n", sum, e);
    	            return sum += (int) (ChronoUnit.YEARS.between(e.getDoj(),
    	    	    		LocalDate.now()));
    	        },
    	        (sum1, sum2) -> {
    	            System.out.format("combiner: sum1=%s; sum2=%s\n", sum1, sum2);
    	            return sum1 + sum2;
    	        });
    
    
    ForkJoinPool commonPool = ForkJoinPool.commonPool();
    System.out.println(commonPool.getParallelism());    // 7
	//-Djava.util.concurrent.ForkJoinPool.common.parallelism=10
    List<PersonDTO> persons = Arrays.asList(
    	    new PersonDTO("Max", 18),
    	    new PersonDTO("Peter", 23),
    	    new PersonDTO("Pamela", 23),
    	    new PersonDTO("David", 12));

    	persons
    	    .parallelStream()
    	    .reduce(0,
    	        (sum, p) -> {
    	            System.out.format("accumulator: sum=%s; person=%s [%s]\n",
    	                sum, p, Thread.currentThread().getName());
    	            return sum += p.getAge();
    	        },
    	        (sum1, sum2) -> {
    	            System.out.format("combiner: sum1=%s; sum2=%s [%s]\n",
    	                sum1, sum2, Thread.currentThread().getName());
    	            return sum1 + sum2;
    	        });
	}

	private static Employee[] arrayOfEmps = {
			new Employee("Kavitha", "Kumar", LocalDate.of(2017, 1, 20), FEMALE), 
			new Employee("David", "Johnson", LocalDate.of(1965, 9, 12), MALE), 
			new Employee("Geetha", "Priya", LocalDate.of(1974, 3, 21), FEMALE),
			new Employee("Dharam", "Singh", LocalDate.of(1974, 3, 21), MALE)
		};

}
