
public class Day27B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car audi = new Car("q4", "sedane");
		Car CRV = new Car("XL", "SUV");

		Car.Engine i = audi.new Engine();
		Car.Engine k = CRV.new Engine();

		i.engineSize();
		k.engineSize();
	}

}

class Car {
	String CarName;
	String CarType;

	public Car(String CName, String CType) {
		this.CarName = CName;
		this.CarType = CType;
	}

	public void CongratulatoryMessage() {
		System.out.println("Congraz for new car".concat(CarName));
	}

	// Creating a child class
	class Engine {
		String engineSize;

		public void engineSize() {
			if (Car.this.CarType.equals("sedean")) {
				this.engineSize = "smaller";
				System.out.println(this.engineSize);
			} else if (Car.this.CarType.equals("SUV")) {
				this.engineSize = "Bigger";
				System.out.println(this.engineSize);
			}
		}

	}

}