

public class MainSyntaxInfo{
	 
	 
	 public static void main(String[] ar) {
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]+" "+i);
		}
		double sum=0;
		for(int i=0;i<ar.length;i++) {
			sum=sum+Double.parseDouble(ar[i]);
		}
		System.out.println(sum);
		MainSyntaxInfo.main();
		main("Welcome");
		int ages[]={45,67,89};
		main(ages);
	}
	 public static void main(int[] ar) {
		 System.out.println(ar);
	 }
	 public static void main() {
			// display message here
		}
		public static void main(String s) {
			// display string here
		}
 }