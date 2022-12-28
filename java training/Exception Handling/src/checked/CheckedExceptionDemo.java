package checked;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckedExceptionDemo {
 public static void main(String[] args) {
	 Scanner sc=null;    // reference var point to null object;
	 sc=new Scanner(System.in);
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 String india="";
	 try {
	 System.out.println("Enter string for further operations");
		india=br.readLine();
	 }
	 catch (NullPointerException e) {
	System.out.println("Object is null");
	System.out.println(e);
	india="India is my country";
	} 
	 catch (IOException e) {
		 System.out.println("Checked exception");
			System.out.println(e);
	}
	 System.out.println("String :"+india);
	 System.out.println("Length:"+india.length());
	 int ch=0;
	 do {
		 System.out.println(ch);
		 System.out.println("Which operation u want? 1: substring 2: char at 3: Back");
		try {
			
		    ch=sc.nextInt();	// if exception occurs here further code in try gets skipped
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
				finally {
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
		}// try ended
		catch (Exception e) {
		System.out.println(e);
		sc=new Scanner(System.in); // bcz scnner had a isssue while scanning
		}
		finally {
		}
	 }
	 while(ch!=3);
	 System.out.println("The further logic after do while");
	sc.close();
}
}