
public class examjuly23rd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Program on inheritance Multilevel
		Daughter1 Sonu = new Daughter1("Khagendra", "Subedi", "Sanjay", "Sonika");
		System.out.println(Sonu.Dfirstname);
		System.out.println(Sonu.Lastname);
		System.out.println(Sonu.GFirstname);
		System.out.println(Sonu.Ffirstname);
		Sonu.displaymessage();

	}

}

class GrandDad {
	String GFirstname;
	String Lastname;

	public GrandDad(String Gfn, String ln) {
		this.GFirstname = Gfn;
		this.Lastname = ln;
	}

	public void displaymessage() {
		System.out.println(this.GFirstname + this.Lastname);
	}

}

class Dad extends GrandDad {
	String GFirstname;
	String Lastname;
	String Ffirstname;

	public Dad(String Gfn, String ln, String Ffn) {
		super(Gfn, ln);
		this.Ffirstname = Ffn;

	}

	public void displaymessage() {
		System.out.println(this.Ffirstname + this.Lastname);
	}

}

class Daughter1 extends Dad {
	String GFirstname;
	String Lastname;
	String Ffirstname;
	String Dfirstname;

	public Daughter1(String Gfn, String ln, String Ffn, String Dfn) {
		super(Gfn, ln, Ffn);
		this.Dfirstname = Dfn;

	}

	public void displaymessage() {
		System.out.println(this.Dfirstname + this.Lastname);
	}

}
