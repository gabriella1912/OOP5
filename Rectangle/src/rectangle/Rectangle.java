package rectangle;

public class Rectangle {
	double a;
	double b;
	
	public Rectangle(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	public Rectangle(double side) {
		super();
		this.a = side;
		this.b = side;
	}

	public double getArea() {
		return a*b;
	}
	@Override
	public String toString() {
		return "Rectangle [a=" + a + ", b=" + b + ", Area=" + getArea() + "]";
	}

	public void setSides(double a,double b) {
		this.a = a ;
		this.b = b;
	}
	public void setSides(double a) {
		this.a = a ;
		this.b = a;
	}
	
	public boolean hasBiggerAreaThan(Rectangle rectangle) {
		if(this.getArea()>rectangle.getArea()) {
			return true;
		}
		else return false;
	}
	
	public boolean hasSameLenghtSidesAs(Rectangle rectangle) {
		if((this.getA()==rectangle.getA()) && (this.getB() == rectangle.getB()) ) {
			return true;
		}
		else return false;
	}
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}

	

}
