interface As {
	public void methodofAs();
}

interface Bs {
	public void methodofBs();
}

interface Cs {
	public void methodofCs();
}

public class RevisionforDay26D {

	public static void main(String[] args) {
		Es e = new Es();
		e.Ds1();
		e.Ds2();
		e.methodofAs();
		e.methodofCs();

	}

}

class Ds {
	public void Ds1() {
		System.out.println("This is the method of Ds1");
	}

	public void Ds2() {
		System.out.println("This is the method of Ds2");
	}
}

class Es extends Ds implements As, Cs {
	public void Ds1() {
		System.out.println("This is the method of Ds1");
	}

	public void Ds2() {
		System.out.println("This is the method of Ds2");
	}

	public void methodofCs() {
		System.out.println("Method of Cs");

	}

	public void methodofAs() {
		System.out.println("Method of As");

	}

}