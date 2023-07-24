class BirdS {
	public void makeSound() {
		System.out.println("Caw caw");
	}
}

class Cat {
	public void makeSound() {
		System.out.println("Meow meow");
	}
}

class Crow extends BirdS {

}

public class revisionforDay26B {

	public static void main(String[] args) {
		Crow C = new Crow();
		C.makeSound();
	}

}
