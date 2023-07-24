
public class abstractclassjuly23rd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThriftStore DS = new ThriftStore();
		DS.displaySaleoffer();
		DS.Security();
	}

}

abstract class Zara {
	abstract void Security();

	public void displaySaleoffer() {
		System.out.println("Buy one get one free");
	}
}

class ThriftStore extends Zara {
	public void Security() {
		System.out.println("Lower Security");
	}

}