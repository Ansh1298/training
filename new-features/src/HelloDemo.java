
public class HelloDemo {
	public static void main(String[] args) {
		Hello h = ()->"hello world";
		System.out.println(h.sayHello());
		Hello h2=()->{
			String msgString ="Hola monde";
			return msgString;
		};
		System.out.println(h2.sayHello());
		System.out.println(h2.sayBye());
		Hello.greeting();
	}
}
