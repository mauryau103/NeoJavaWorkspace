package ReaderWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppendDemo {
public static void main(String[] args) {
	File file=new File("India.txt");
	System.out.println(file.exists());
	
	// if file not available then java will automatically create a file and open that in appendmode
	try(FileWriter filewriter=new FileWriter(file,true)){
		System.out.println("File opened in append mode.. file pointer points after last character of file");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter contents to write in file");
		String contents=br.readLine();
		filewriter.write(contents);
		System.out.println("Contents appened successfully...");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("file auto closed");
}
}