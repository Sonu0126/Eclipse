interface WBA {
	public void displayCountry();

	public void displayCity();
}

interface WBI {
	public void Save();

	public void Loan();
}

public class Day26C {

	public static void main(String[] args) {
		BankS Ktm = new BankS();
		Ktm.displayCountry();
		Ktm.displayCity();
		Ktm.Save();
		Ktm.Loan();
	}

}

class BankS implements WBA, WBI {

	public void Save() {
		System.out.println("Save Method");

	}

	public void Loan() {
		System.out.println("Loan Method");

	}

	public void displayCountry() {
		System.out.println("Nepal");

	}

	public void displayCity() {
		System.out.println("Kathmandu");

	}
}