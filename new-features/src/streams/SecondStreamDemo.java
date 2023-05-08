package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SecondStreamDemo {
public static void main(String[] args) {
	List<String> basket = Arrays.asList("cherry","mango","papaya","guava","apple","kiwi");
	
	//basket.stream().sorted().forEach(System.out::println);
	
	//basket.stream().map(s->s.toUpperCase()).forEach(System.out::println);
	
	//basket.stream().filter(s->s.contains("a")).forEach(System.out::println);
	
	//System.out.println(basket.stream().filter(s->s.contains("a")).count());
	
	Stream.of("jim","anna","mat","brad").sorted().forEach(System.out::println);
	
}
}
