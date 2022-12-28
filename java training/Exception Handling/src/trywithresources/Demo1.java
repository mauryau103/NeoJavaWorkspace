package trywithresources;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo1 {
public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);
	try{
	int num=sc1.nextInt();
	}
	catch(NullPointerException e) {
		e.printStackTrace();
	}
	// do not close console stream

	int num2=sc1.nextInt(); //IllegalStateException Scanner is closed
}
}