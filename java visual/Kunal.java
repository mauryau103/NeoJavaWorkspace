import java.io.*;
import java.util.*;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
class MyBook extends Book{
    public void setTitle(String s){
        
    }
    public void run(){
        System.out.println("Run Run");
    }
}

public class Kunal {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        MyBook mb=new MyBook();
         mb.setTitle(str);
         String myTitle=mb.getTitle();
         mb.run();

    }
}
