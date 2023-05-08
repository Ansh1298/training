@FunctionalInterface
public interface Hello {
	String sayHello();
	 default String sayBye() {
		return "Goodbye";
	}
	 static void greeting() {
		 System.out.println("hola");
	 }
}
