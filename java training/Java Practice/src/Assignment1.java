class Training{
	String trainer;
	
	void learn() {
		System.out.println("Today we Learn Dynamic Polymorphism");
	}
	
}
class Java extends Training{
	
	int hour;
	
	void learn() {
		System.out.println("our meeting get ended early.");
	}
	
}

public class Assignment1{
	
	
	public static void main(String[] args) {
//		Create any other Inheritance of your choice and show the demo of method overrding and upcasting in that
		
		Training train = new Java();
		
		System.out.println(train.trainer="Vina mam");
		train.learn();
	}
}