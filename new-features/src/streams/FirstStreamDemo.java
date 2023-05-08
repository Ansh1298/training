package streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstStreamDemo {
	public static void print(Object obj) {
		System.out.println(obj);
	}

public static void main(String[] args) {
	Integer[] ar = {2,5,3,8,9,2,6};
	List<Integer> numbers= Arrays.asList(ar);
	
	//numbers.forEach(System.out::println);
	//numbers.forEach(FirstStreamDemo::print);
	
	//Stream<Integer> str1=numbers.stream();
	//str1.forEach(System.out::println); //for each is a terminal operration
	//numbers.stream().distinct().forEach(System.out::println); // distinct is intermediate operation
	
	//System.out.println(numbers.stream().distinct().count());
	//System.out.println(numbers.stream().filter(n -> n>5).count());
	
	//numbers.stream().distinct().sorted().forEach(System.out::println);
	//System.out.println(numbers.stream().mapToInt(i->i).sum());
	//System.out.println(numbers.stream().reduce(0, (n,m) ->n+m));
	//System.out.println(numbers.stream().reduce(0, Integer::sum));
	
	//numbers.stream().limit(5).forEach(System.out::println);
	
	IntStream iStream=IntStream.range(1, 99);
	//System.out.println(iStream.count());
	//System.out.println(iStream.sum());
	//System.out.println(iStream.skip(50).sum());
	
	//IntStream istr2=IntStream.of(5,4,6,2,3,4);
	//System.out.println(istr2.count());
	//System.out.println(istr2.sum());
	IntSummaryStatistics statics=iStream.summaryStatistics();
	System.out.println(statics);
}
}
