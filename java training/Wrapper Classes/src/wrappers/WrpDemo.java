package wrappers;

public class WrpDemo {
	public static void main(String[] args) {
		Student stud= new Student(3333,"Hari",89.9);
		// 3333 will be autoboxed to Integer, 
		//"Hari" : literals are also string object
		//89.9 will be autoboxed to Double
		/*code below is not used above is better than that*/
		Integer studId=new Integer(333);
		String name=new String ("Hari");
		Double percent=new Double(89.9);
		Student stud2=new Student(studId, name, percent);
	}
}