package just;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Streams {
	
	
	public static void main(String[] args) {
		
		
		List<String> names = Arrays.asList("apple","zoo","aeetroot","king");
		
		
//		Predicate<String> startA = name -> name.startsWith("a");
//		
//		Function<String,String> add = name ->name.concat("Z");
//		
//		Consumer<String> printthat = name ->System.out.println(name);
		
		//lamda is a tool
		
		//stream is machine 
		
		//tools ahh machine la pottu work pannalam
		
		
		
		
		names.stream()
		.filter(name ->name.startsWith("a"))
		.map(name ->name.concat("V"))
		.forEach(name ->System.out.println(name));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		List<Integer> numbers = Arrays.asList(5,9,3,2,7,8);
//		
//		Predicate<Integer> checkCondotion = n -> n > 5 ;
//		
//		
//		
//		
//		Function<Integer, Integer> addthatcondition = n -> n*2;
//		
//		Supplier<Integer> random = ()->(int) (Math.random()*100);
//		
//		
//		
//		
//		Consumer<Integer> printthat = n -> System.out.println(n);
//		
//		//use stream
//		
//		numbers.stream()
//		
//		.filter(checkCondotion)
//		.map(addthatcondition)
//		.forEach(printthat);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
