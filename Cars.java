package CBCLASS;

public class Cars // implements Comparable<Cars>
{
	int price;
	int speed;
	String color;

	public Cars() {
		// TODO Auto-generated constructor stub
	}

	public Cars(int price, int speed, String color) {
		// TODO Auto-generated constructor stub
		this.price = price;
		this.speed = speed;
		this.color = color;
	}

	@Override
	public String toString() {
		return "P " + price + ", S " + speed + ", C " + color;
	}

	// public int CompareTo(Cars s) {
	// //
	// // return this.price - s.price;
	// // return this.speed - s.speed;
	// return this.color.compareTo(s.color);
	// }
}
