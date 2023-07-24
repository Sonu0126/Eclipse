interface UniversityS {
	public void Scholarship();
}

interface CollegeS {
	public void MajoringSubject();
}

interface HighSchoolS {
	public void TotalGrades();
}

public class July23examInterface {

	public static void main(String[] args) {
		ElementarySchools obj = new ElementarySchools();
		obj.Sports();
		obj.Scores();
		obj.TotalGrades();
		obj.Scholarship();
	}

}

class MiddleSchools {
	public void Sports() {
		System.out.println("Sports is necessary.");
	}

	public void Scores() {
		System.out.println("High Scores students gets rewards.");
	}

}

class ElementarySchools extends MiddleSchools implements HighSchoolS, UniversityS {
	public void Sports() {
		System.out.println("Sports is necessary.");
	}

	public void Scores() {
		System.out.println("High Scores students gets rewards.");
	}

	public void Scholarship() {
		System.out.println("Free Scholarship for high scorer");

	}

	public void TotalGrades() {
		System.out.println("Grade A");

	}

}
