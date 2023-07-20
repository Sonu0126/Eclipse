interface WorldBankS {
	public void Save(int x);

	public void Loan(int y);

}

public class day26A {

	public static void main(String[] args) {
		NRBS Nepal = new NRBS();
		Nepal.Save(1);
		Nepal.Loan(1);
	}

}

class NRBS implements WorldBankS {
	public void Save(int x) {
		System.out.println("Save is here");
	}

	public void Loan(int y) {
		System.out.println("Loan is from here ");
	}
}

class NBLS implements WorldBankS {

	public void Save(int x) {
		System.out.println(" This Save is here");
	}

	public void Loan(int y) {
		System.out.println("This Loan is from here");
	}

}