package kunal;

 class Bike{  
	   void run(){System.out.println("running");}  
	}  
	     
	class FinalDemo extends Bike{  
	   void run(){System.out.println("running safely with 100kmph");}  
	     
	   public static void main(String args[]){  
		   FinalDemo finalDemo = new FinalDemo();
		   finalDemo.run();
	   FinalDemo honda= new FinalDemo();  
	   honda.run();  
	   }  
	}  