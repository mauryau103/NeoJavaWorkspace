package interfaces;

public class MyCircle implements ShapeIntf{
  private double radius;
  private double diameter=2*radius;

 
  public MyCircle(double radius) {
	this.radius = radius;
}
  /*class is following rules given by interface : syntax is provided by interface. Implementation is own*/
public double area() {
	  return pie*radius*radius;
  }
  public double  perimeter() {
	  return 2*pie*radius;
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