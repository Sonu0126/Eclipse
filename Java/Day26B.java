class A {
	public void GreetA() {
		System.out.println("Hello");
	}
}

class B {
	public void GreetB() {
		System.out.println("Bye");
	}
}

class C extends A {

}

public class Day26B {

	public static void main(String[] args) {
		C Camera = new C();
		Camera.GreetA();

	}

}
