
public class Car {
	private String model;
	private String[][] features;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(String model,String[]...features) {
		this.model=model;
		this.features=features;
	}
	public void specs() {
		System.out.println("Specs of"+model);
		for(String[] f: features)
			System.out.println(f);
	}
	public static void main(String[] args) {
		
		Car alto=new Car("Suzuki alto","keyless","AC","power window");
		Car mini=new Car("Mini cooper","ABS","Traction control","airbags","Climate control");
		alto.specs();
		mini.specs();

	}
}
