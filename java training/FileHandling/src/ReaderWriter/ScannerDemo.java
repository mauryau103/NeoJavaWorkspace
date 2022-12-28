package ReaderWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {
public static void main(String[] args) {
	File file=new File("India.txt");
	try(Scanner sc=new Scanner(file)){
	System.out.println("file opened in read mode. File pointer poiting to first character of file");
  //delimiter : bydefault space( )
		while(sc.hasNext()) {
			String token=sc.next();
		      System.out.println(token);
		}
	}
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	System.out.println("File autoclosed");
	
	File file2=new File("Kerala.txt");
	System.out.println(file2.exists());
	try(Scanner sc=new Scanner(file2)){
		System.out.println("file opened in read mode. File pointer poiting to first character of file");
			while(sc.hasNext()) {
				if(sc.hasNextInt()) {
						int r=sc.nextInt();
						System.out.println(r);
				}
				else if(sc.hasNextDouble()) {
				double d=sc.nextDouble();
					System.out.println(d);
			   }
				else
					sc.next();  // to move file pointer ahead
			}
	}
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	System.out.println("File autoclosed");
	
	
	
	try(Scanner sc=new Scanner(file2)){
	System.out.println("file opened in read mode. File pointer poiting to first character of file");
  //delimiter : bydefault new line (\n)
		while(sc.hasNextLine()) {
			String token=sc.nextLine();
		      System.out.println(token);
		}
	}
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	System.out.println("File autoclosed");
	
	
}
}