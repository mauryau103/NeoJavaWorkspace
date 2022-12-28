package trywithresources;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo{
	public static void main(String[] args) {
		File file = new File("index.txt");
		Scanner scanner=null;
		
		try {
			scanner=new Scanner(file);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			scanner.close();
		}
		
		try(Scanner sc1=new Scanner(file)) {
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}