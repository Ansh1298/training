import java.util.Scanner;

public class ConsoleDemo {
public static void main(String[] args) {
	Scanner console= new Scanner(System.in);
	System.out.print("Enter name:");
	String name=console.next();
	
	String nameRegex="[A-Z][a-z]{4,}";
	System.out.println(name.matches(nameRegex));
	System.out.println("name:"+name);
	String mobileRegex="[7-9]{1}[0-9]{9}";
}
}
