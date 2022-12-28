package kunal;

import java.util.StringTokenizer;

public class ThisDemo2 {
	String nameString="Umesh";
	public void m(ThisDemo2 thisDemo2) {
		System.out.println("I am in m method");
	}
	public void n() {
		System.out.println("I am in n method");
		m(this);
	}
public static void main(String[] args) {
	ThisDemo2 thisDemo2 = new ThisDemo2();
	String string= thisDemo2.nameString;
	System.out.println(string);
	thisDemo2.m(thisDemo2);
	thisDemo2.n();
	
	
}
}
