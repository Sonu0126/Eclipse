
public class innerclassjuly23rd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 Mercdz = new Car1("cz12", "Sedan");
		Car1 BMW = new Car1("B21", "SUV");
		Car1.Engine m = Mercdz.new Engine();
		Car1.Engine b = BMW.new Engine();
	}

}

class Car1 {
	String CarName;
	String CarType;

	public Car1(String Cnm, String Ctyp) {
		this.CarName = Cnm;
		this.CarType = Ctyp;
	}

	public void CongrazMessage() {
		System.out.println("Congraz on the car".concat(this.CarName));

	}

	// Creating an inner class
	class Engine {
		String engineSize;

		public void engineSize() {
			if (Car1.this.CarType.equals("Sedan")) {
				this.engineSize = "Smaller";
			} else if (Car1.this.CarType.equals("SUV")) {
				this.engineSize = "Bigger";
			}

		}

	}

}