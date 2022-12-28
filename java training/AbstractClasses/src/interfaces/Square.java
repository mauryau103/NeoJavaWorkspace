package interfaces;

public class Square implements ShapeIntf{
		private double side;
		
		public Square(double side) {
			super();
			this.side = side;
		}

		public double area() {
			return side*side;
		}
		public double perimeter() {
			return 4*side;
		}
}
