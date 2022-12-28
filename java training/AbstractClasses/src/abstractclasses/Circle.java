package abstractclasses;

public abstract class Circle{
	private double radius;
	protected double diameter;
	public static final double pie;
	
	static {
		pie=3.142; //single shared  constant copy 
	}
	
	public Circle() {
		
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		System.out.println("in super class method");
		return pie*radius*radius;
	}
	abstract double perimeter();
	public abstract void calculateDiameter();
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
	
	
}