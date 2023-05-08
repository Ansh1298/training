class EventImpl implements Event{

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Class level implementation");
		
	}
	
}
public class EventDemo {
	class InnerClassImpl implements Event{

		@Override
		public void perform() {
			// TODO Auto-generated method stub
			System.out.println("Inner clas implementation");
			
		}
		
	}
	public static void main(String[] args) {
			EventImpl e1=new EventImpl();
			e1.perform();
			EventDemo demo=new EventDemo();
			InnerClassImpl ici=demo.new InnerClassImpl();
			ici.perform();
	}
}
