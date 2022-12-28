package interfaces;

public class SemiCircle implements ShapeIntf{
	private double radius;
	  private double diameter=2*radius;
	  
	  public SemiCircle(double radius) {
		this.radius = radius;
	}
	  /*class is following rules given by interface : syntax is provided by interface. Implementation is own*/
	public double area() {
		  return 0.5*pie*radius*radius;
	  }
	  public double  perimeter() {
		  return pie*radius+2*radius;
	  }
	  public double  getDiameter() {
		  diameter= 2*radius;
		  return diameter;
	  }
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "MyCircle [radius=" + radius + ", diameter=" + diameter + "]";
	}

}