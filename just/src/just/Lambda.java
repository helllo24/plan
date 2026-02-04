package just;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda {
	
	public static void main(String[] args) {
		
		//predicate
		Predicate<Integer> p = n -> n>10;
		
		System.out.println(p.test(9));
		System.out.println(p.test(13));
		
		
		//consumer
		Consumer<String> c = say->System.out.println(say);
		
		c.accept("saas");
		
		//function
		
		Function<Integer, Integer> f = n -> n+n;
		
		System.out.println(f.apply(5));
		
		//supplier
		
		Supplier<Integer> s = ()-> (int)(Math.random()*100);
		
		System.out.println(s.get());
		
		//unaryOperator 
		
		
		
	}

}
