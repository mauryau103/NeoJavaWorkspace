package wrappers;

import javax.sound.midi.Soundbank;

public class WrapDemo1{
	public static void main(String[] args) {
		
		int num=78; // primitive
		System.out.println(num);
		Integer wrapnum=new Integer(num);  // boxing , wrapping
		Integer wrapnum1=num;  // auto boxing, this is used, no need to use  new keyword
		System.out.println(wrapnum1);
		double num2=wrapnum1.doubleValue(); // unboxing to double primitive
		System.out.println(num2);
		Double wrapnum3=wrapnum1.doubleValue(); // unboxing and then autoboxing
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE +" bits");
		int maxnum=Integer.max(45, 67);
		System.out.println(maxnum);
		Integer no=Integer.parseInt("67889");
		System.out.println(no);
		
		Integer myNum=new Integer("78999");
		
	 /*convert integer to binary, hex, octal*/
		
		int num3=5;
		String bins=Integer.toBinaryString(num3);
	}
}