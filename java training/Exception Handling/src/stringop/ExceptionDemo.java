package stringop;

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
		 System.out.println("Which operation u want? 1: substring 2: char at 3: Back");
		try {
		 ch=sc.nextInt();	
		}// try ended
		catch (Exception e) {
		System.out.println(e);
		ch=0;
		}
		 switch (ch) {
		case 1:	
			try {
			System.out.println("Enter source index and destination index");
			int si=sc.nextInt();
			int di=sc.nextInt();
			String subs=india.substring(si, di);
			System.out.println(subs);
			}
			catch (InputMismatchException e) {
			System.out.println(e); // details are not getting displayed
			e.printStackTrace(); // all details : callee name line number, caller name line number // thread works here
			}
			catch (StringIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("Application continues from here");
			break;
		case 2:	
			try {
				System.out.println("Enter  index to extract character");
				int in=sc.nextInt();
				char c=india.charAt(in);
				System.out.println(c);
			} catch (IndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println(e);
				e.printStackTrace();
			}
			catch (NegativeArraySizeException e) {
				// TODO: handle exception
				System.out.println(e);
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
			System.out.println();
			break;
		case 3:	
		//	System.exit(0); // exit from application
			break;
		default:
			break;
		}// switch ended
		
	 }
	 while(ch!=3);
	 System.out.println("The further logic after do while");
	 
}
}