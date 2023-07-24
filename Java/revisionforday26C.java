interface StudentD {
	public void displayGrades();

	public void displayStudentName();

}

interface DoctorD {
	public void Department();

	public void NumofPatients();
}

public class revisionforday26C {

	public static void main(String[] args) {

	}

}

class NurseD implements StudentD, DoctorD {

	public void Department() {
		System.out.println("Dermatology Department");
	}

	public void NumofPatients() {
		System.out.println("20 patients a Day");
	}

	public void displayStudentName() {
		System.out.println("Sakshyam Subedi");
	}

	public void displayGrades() {
		System.out.println("I got Grade A");
	}

}