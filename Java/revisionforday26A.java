interface UniversityA {
	public void tutionfee(int x);

	public void Sports(int y);
}

public class revisionforday26A {

	public static void main(String[] args) {
		 HighschoolA HS = new  HighschoolA();
		 HS.tutionfee(100);
		 HS.Sports(2);
	}

}

class CollegeA implements UniversityA {

	public void tutionfee(int x) {
		System.out.println("Tutionfee Should be payed on time");

	}

	public void Sports(int y) {
		System.out.println("Being good at sports can get you a scholarship");

	}

}

class HighschoolA implements UniversityA {

	public void tutionfee(int x) {
		System.out.println("Payment of tutionfee is done");

	}

	public void Sports(int y) {
		System.out.println("You can choose the sports you want to play");

	}

}