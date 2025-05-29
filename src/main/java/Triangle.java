public class Triangle { //notice that it starts with a capital letter
	
	//Instance variables - attributes
	private double side1;
	private double side2;
	private double side3;
	private double angle1;
	private double angle2;
	private double angle3;

	//Constructor - runs when the object is created
	public Triangle(double side1, double s2, double s3, double a1, double a2, double a3) {
		this.side1 = side1;
		side2 = s2;
		this.side3 = s3;
		this.angle1 = a1;
		this.angle2 = a2;
		this.angle3 = a3;
	}

	//Methods

	//getters

	public double getSide1() {
		return this.side1;
	}

	public double getSide2() {
		return this.side2;
	}

	public double getSide3() {
		return this.side3;
	}

	//This is not a getter, so don't write get
	public double perimeter() {
		return this.side1 + this.side2 + this.side3;
	}
}