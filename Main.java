public class Main{
	
	public static void main (String[] args) {
		
		Fraction number1 = new Fraction(3,5);
		Fraction number2 = new Fraction(1,5);
		System.out.println(Fraction.sub(number1,number2));
		System.out.println(Fraction.div(number1,number2));

		/*Int number = new Int();
		Int s = new Int();

		for (int i = 0; i < 25; i++) {
			s.increment();
		}

		for (int i = 0; i < 40; i++) {
			number.add(s);
		}

		System.out.println(number);*/

	}
}