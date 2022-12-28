package ReaderWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDemo1 {
	public static void main(String[] args) {
		File file=new File("India.txt");
		try(FileReader filereader=new FileReader(file); ){
			System.out.println("File opened in read mode. File pointer points to 1st character of file");
			// we can read file here
			int i=0;
			String contents="";
			while(true) {
					 i=filereader.read();
					 if(i==-1)
						 break;
					contents=contents+(char)i;
					// filewriter.write(i) // one by one
			}
			System.out.println(contents);
	      // filewriter.write(contents) // direct string
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		System.out.println("File auto closed");
		
		
	}
}