
public class Overloadadingjuly23rd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math1 calc = new Math1();
		calc.Substraction(7, 4);
		calc.Substraction(12, 5, 3);
		calc.Substraction(30, 15, 5, 2);

	}

}

class Math1 {
	public void Substraction(int x, int y) {
		System.out.println(x - y);
	}

	public void Substraction(int x, int y, int z) {
		System.out.println(x - y - z);
	}

	public void Substraction(int x, int y, int a, int b) {
		System.out.println(x - y - a - b);
	}
}