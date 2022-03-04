public class Int {

	private int value;
	Int() { value = 0;}

	public void increment () {
		value++;
	}

	public void decrement () {
		value--;
	}

	public void add (Int a) {
		value+=a.value;
	}

	public void substract (Int a) {
		value-=a.value;
	}

	public String toString () {
		return "" + value;
	}
}