package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightStreamDemo {
public static void main(String[] args) throws IOException {
	List<Flight> flights=null;
	Stream<String> lines=Files.lines(Paths.get("src/flights.txt"));
	
	flights =lines.map(line -> {
		String[] record = line.split(",");
		return new Flight(Integer.parseInt(record[0]),record[1],record[2],record[3]);
	}).toList();
	
	flights.forEach(System.out::println);
	
	System.out.println(flights.stream().filter(f->f.getCode()==123).findFirst().get());
	
	flights.stream().filter(f->f.getCarrier().equals("jet")).toList().forEach(System.out::println);
	
	flights.stream().filter(f->f.getSource().equals("pune")&& f.getDestination().equals("delhi")).toList().forEach(System.out::println);
}
}

