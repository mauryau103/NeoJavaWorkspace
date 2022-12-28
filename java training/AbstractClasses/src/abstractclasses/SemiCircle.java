package abstractclasses;

public class SemiCircle extends Circle{  //Circle is parent.
	
	@Override
		public double area() {
		System.out.println("in subclass method");
			return 0.5*pie*getRadius()*getRadius();
		
	}

	@Override
	double perimeter() {
		
		// TODO Auto-generated method stub
		return pie*getRadius()+2*getRadius();
	}
	
	@Override
	public void calculateDiameter() {
		// TODO Auto-generated method stub
		diameter=2*getRadius();
		
	}
	
}
