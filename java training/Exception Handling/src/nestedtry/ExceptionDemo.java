package nestedtry;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
 public static void main(String[] args) {
	 Scanner sc=null;    // reference var point to null object;
	 sc=new Scanner(System.in);
	 String india="";
	 try {
	 System.out.println("Enter string for further operations");
	 india=sc.next();
	 }
	 catch (NullPointerException e) {
	System.out.println("Object is null");
	System.out.println(e);
	india="India is my country";
	}
	 System.out.println("String :"+india);
	 System.out.println("Length:"+india.length());
	 int ch=0;
	 do {
		 System.out.println(ch);
		 System.out.println("Which operation u want? 1: substring 2: char at 3: Back");
		try {
			System.out.println("---------outer try started------------");
		    ch=sc.nextInt();	// if exception occurs here further code in try gets skipped
			 switch (ch) {
			 case 1:	
				try {
					System.out.println("---------inner try started------------");
				System.out.println("Enter source index and destination index");
				int si=sc.nextInt();
				int di=sc.nextInt();
				String subs=india.substring(si, di);
				System.out.println(subs);
				System.out.println("---------inner  try ended------------");
				}
				catch (InputMismatchException e) {
				System.out.println(e); // details are not getting displayed
				e.printStackTrace(); // all details : callee name line number, caller name line number // thread works here
				}
				finally {
					System.out.println("inner finally");
				}
				System.out.println("Application continues from here");
				break;
			case 2:	
				System.out.println("Enter  index to extract character");
				int in=sc.nextInt();
				char c=india.charAt(in);
				System.out.println(c);
				break;
			case 3:	
			//	System.exit(0); // exit from application
				break;
			default:
				break;
			}// switch ended
			 System.out.println("---------outer try ended------------");
		}// try ended
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("in outer catch");
			System.out.println(e);
		}
		catch (Exception e) {
		System.out.println("in outer catch");
		System.out.println(e);
		sc=new Scanner(System.in); // bcz scnner had a isssue while scanning
		}
		finally {
			System.out.println("outer finally");
		}
		System.out.println("execution continues from here");
	 }
	 while(ch!=3);
	 System.out.println("The further logic after do while");
	 
}
}