package wrappers;

public class WrapDemo2 {
public static void main(String[] args) {
	boolean b1=true;
	boolean b2=false;
	
	Boolean wrapb1=new Boolean(b1);
	Boolean autowrapb1=b1;
 boolean b3=autowrapb1;  // auto unboxing
 boolean b4=autowrapb1.booleanValue(); // unboxing
}
}