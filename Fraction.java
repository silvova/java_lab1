public class Fraction {

	private int numerator;
	private int denominator;

	Fraction() {
		numerator = 0;
		denominator = 0;
	}

	Fraction(int a, int b) {
		numerator = a;
		denominator = b;
	}

	public String toString () {
		return numerator + "\n-\n" + denominator;
	}

	static Fraction div (Fraction A, Fraction B) {
		Fraction divresult = new Fraction();
		divresult.numerator = A.numerator * B.denominator;
		divresult.denominator = A.denominator * B.numerator;
		return divresult;
	}

	static Fraction sub (Fraction A, Fraction B) {
		Fraction subresult = new Fraction();
		if (A.denominator!=B.denominator) {
			A.numerator *= B.denominator;
			B.numerator *= A.denominator;
			subresult.denominator = A.denominator*B.denominator;
		}
		else {
			subresult.denominator = A.denominator;
		}
		subresult. numerator = A.numerator-B.numerator;
		return subresult;
	} 
}