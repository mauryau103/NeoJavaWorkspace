package interfaces;


public class InterfaceDemo {

	public static void main(String[] args) {

			MyCircle circle=new MyCircle(2);
			circle.area();

			SemiCircle semicircle=new SemiCircle(2);
			semicircle.area();

			Square square=new Square(2);
			square.area();
			
			/*interface object never gets created, we can create reference variable*/
			ShapeIntf shape;
			
			shape=new MyCircle(3);
			double ac=shape.area();
			double pc=shape.perimeter();
			System.out.println("Area of circle is :"+ac);
			System.out.println("Perimeter of circle is :"+pc);
			shape=new SemiCircle(3);
			double asc=shape.area();
			double psc=shape.perimeter();
			System.out.println("Area of semicircle is :"+asc);
			System.out.println("Perimeter of semicircle is :"+psc);
			shape=new Square(3);
			double asq=shape.area();
			double psq=shape.perimeter();
			System.out.println("Area of square is :"+asq);
			System.out.println("Perimeter of square is :"+psq);
			System.out.println(ShapeIntf.pie);
			
			
			
	}

}