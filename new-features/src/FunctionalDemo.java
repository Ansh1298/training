@FunctionalInterface
interface Greeting{
	String greet(String name);
}
@FunctionalInterface
interface Arithmetic{
	int sum(int a,int b);
}
public class FunctionalDemo {
	public static void main(String[] args) {
		Greeting greeting=(name) -> "Hello,"+name;
		System.out.println(greeting.greet("zubair"));
	}

}
