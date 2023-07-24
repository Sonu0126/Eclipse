
public class revisionforDay27A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchoolB Scl = new SchoolB();
		System.out.println(Scl.NumofStaff);
		int ScL = Scl.displayNumofStaff();
		System.out.println(ScL);

		SchoolB.KinderGarden kg = Scl.new KinderGarden();
		System.out.println(kg.Numofclass);
		// kg.Teach();
		System.out.println(kg.Teach());
	}

}

class SchoolB {
	int NumofStaff = 30;

	class KinderGarden {
		int Numofclass = 5;

		public String Teach() {
			return "Discipline";
		}

	}

	public int displayNumofStaff() {
		return this.NumofStaff;
	}

}
