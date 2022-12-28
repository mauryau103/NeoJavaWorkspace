package customexceptions;

public class Voter {
    
	public void checkAge(int age){
		try {
			if(age<0) {
					throw new NegativeAgeException("negative age entered : "+age); // explicit throw, need a catch to handle
			}
			else if (age<18 && age >=0) {
			      	throw new InvalidAgeException();
			}
			else {
				System.out.println(age + " is valid.. u can go with further steps");
			}
		}//end try
		catch(NegativeAgeException | InvalidAgeException ne) {
			System.out.println("Custom Exception handled");
			System.out.println(ne);
			ne.printStackTrace();
		}
	}
	// ArithmeticException, ArrayIndexOutOfException
	//NegativeAgeException, InvalidAgeException : Custom Exception classes
}