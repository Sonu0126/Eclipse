
public class Day27A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPU C = new CPU();
		System.out.println(C.price);
		int priceD = C.displayPrice();
		System.out.println(priceD);

		CPU.Processor P = C.new Processor();
		System.out.println(P.Manufacturer);
		String Pro = P.speed();
		System.out.println(Pro);

	}

}

class CPU {
	int price = 1500;

	class Processor {
		String Manufacturer = "intel";

		public String speed() {
			return "fast";
		}

	}

	public int displayPrice() {
		return this.price;
	}

}