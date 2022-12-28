package strings;

public class StringDemo{
	public static void main(String[] args) {
		char charArray[] = {'w','e','l','c','o','m','e'};
		String s1="welcome";
		String s2=new String(charArray);
		String s3=new String("Hello");
		String s4=new String(s1);
		String s5=s1;
		String s6=new String();
		
		String cname="Neosoft";
		String newname=cname+" Technology";
		System.out.println(cname);
		System.out.println(newname);
		cname=cname.toUpperCase();
		System.out.println(cname);
		
		
		String location=new String("Rabale");
		String complocation=new String("Rabale");
		String loc="Rabale";
		
		
	}
	
}