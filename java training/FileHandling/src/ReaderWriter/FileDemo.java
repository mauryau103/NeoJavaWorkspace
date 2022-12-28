package ReaderWriter;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDemo {
		public static void main(String[] args) {
			
			//File file =new File("D:\\CoreJavaWorkspace\\FileHandling\\India.txt");
			File file =new File("India.txt");
			System.out.println("File object created");
			boolean b=file.exists();
			System.out.println(b);
			String path=file.getAbsolutePath();
			System.out.println(path);
			file.setReadOnly();
			System.out.println(file.canWrite());
			file.setWritable(true);
			System.out.println(file.canWrite());
			System.out.println(file.canRead());
			System.out.println("length:"+file.length());
			System.out.println();
			long ms=file.lastModified();
			System.out.println(ms);
			Date date=new Date(ms);
			System.out.println(date);
			/*
			 * boolean b1=file.delete(); System.out.println(b1);
			 */
			File file2=new File("Kerala.txt");
			System.out.println("File exists? "+file2.exists());
			try {
				if(file2.exists()==false)
						file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("File exists?"+file2.exists());
			
		    File dir=new File("D://MyNation");
		    System.out.println(dir.exists());
		    System.out.println(dir.getAbsolutePath());
		    System.out.println(dir.getParent());
			System.out.println(dir.getTotalSpace());
			System.out.println("Is it file ? "+dir.isFile());
			System.out.println("Is it directory ? "+dir.isDirectory());
			
			//File class not used to open the file in read / write mode
	
		}
}