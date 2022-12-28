package Assignment3;

/* Difference between abstarct class and interface:
1:Abstract class can have abstract and non-abstract methods.
Interface can have only abstract methods. Since Java 8, it can have default and static methods also.

2: Abstract class can have final, non-final, static and non-static variables.
Interface has only static and final variables.

3:  Abstract class doesn't support multiple inheritance.
Interface supports multiple inheritance.

4: The abstract keyword is used to declare abstract class.	
The interface keyword is used to declare interface. */


/* 1: Instance variables are declared in a class, but outside a method, constructor or any block.	
 * Class variables also known as static variables are declared with the static keyword in a class, but outside a method, constructor or a block.
 * 
 * 2; Instance variables are created when an object is created with the use of the keyword 'new' and destroyed when the object is destroyed.
 * 	Static variables are created when the program starts and destroyed when the program stops.
 * 
 * 
 * 3:Instance variables can be accessed directly by calling the variable name inside the class. However, within static methods (when instance variables are given accessibility), they should be called using the fully qualified name. ObjectReference.VariableName.
 * 	Static variables can be accessed by calling with the class name ClassName.VariableName.
 * 
 * 4: 
 *

 */

class Example {

	public String MyName;
	public int Number;
	public static int id;
	
	public static void Display() {
		System.out.println("HEloo static method");
	}
	
	
	public void Play() {
	    System.out.println("non-static method ");
	}
	
}

 
 public class Assignment3{
	 public static void main(String args[]){
		 Example.Display();
		 Example e1 = new Example();
		 e1.Play();
		 
		 
	 }
 }