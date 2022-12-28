package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// Arrays and Strings are knons as first class objects
		
		int ar1[]=new int[5];  // fixed size
		int ar2[];
		ar2=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array elements");
        for(int i=0;i<ar1.length;i++) {
        	ar1[i]=sc.nextInt();
        }
        System.out.println("Array elements are:");
        for(int ele:ar1) {
        	System.out.println(ele);
        }
        
        
        String cities[]=new String[5];
        System.out.println("Enter Array elements");
        for(int i=0;i<cities.length;i++) {
        	cities[i]=sc.next();
        }
        System.out.println("Array elements are:");
        for(String ele:cities) {
        	System.out.println(ele);
        }
        
        
        Book book1=new Book(12, "Learn Java", 678.5);
        Book book2=new Book(13, "Basics of PHP",478.5);
        Book book3=new Book(14, "Web Basics", 278.5);
        Book book4=new Book(15, "Learn Python", 878.5);
        
        Book bookArray[]= {book1,book2,book3,book4};
        System.out.println("Array elements are:");
        for(Book bk:bookArray) {
        	System.out.println(bk); // toString 
        }
        
      String joined1=String.join("-", "India","is","My","Country" );
      String joined2=String.join("$", cities);
      System.out.println(joined1);
      System.out.println(joined2);
  	 int index=Arrays.binarySearch(cities, "mumbai");
  	 System.out.println(index);
  	 Arrays.sort(cities);
  	 for(String city:cities)
  		 System.out.println(city);
	}


	
}