interface Two {
	public void methodTwo();
}

interface Three {
	public void methodThree();
}

interface Four {
	public void methodFour();
}

public class Day26D {

	public static void main(String[] args) {
		Six objSix = new Six();
		objSix.FiveA();
		objSix.FiveB();
		objSix.methodTwo();
		objSix.methodFour();
	}

}

class Five {
	public void FiveA() {
		System.out.println("This is the first method from class FiveA");
	}

	public void FiveB() {
		System.out.println("This is the second method from class FiveB");
	}
}

class Six extends Five implements Two, Four {
	public void FiveA() {
		System.out.println("This is the first method from class FiveA");
	}

	public void FiveB() {
		System.out.println("This is the second method from class FiveB");
	}

	public void methodTwo() {
		System.out.println("This is method Two");
	}

	public void methodFour() {
		System.out.println("This is method Four");
	}
}
