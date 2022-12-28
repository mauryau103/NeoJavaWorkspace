package genericdemo;

public class MyStackDemo {
	public static void main(String[] args) {
		/*
		 * MyStack stack=new MyStack(10); // not typesafe stack.push(10);
		 * stack.push("hi"); stack.push(10); stack.push("hello");
		 * System.out.println(stack); System.out.println(stack.currentsize()); Object
		 * o=stack.pop(); //"hello" System.out.println(o); Integer i=(Integer)o; //
		 * ClassCastException may occur System.out.println(i.doubleValue());
		 */
		MyGStack<String> stack2=new MyGStack<String>(5);
		stack2.push("hi");
		//stack2.push(45);
		stack2.push("welcome");
		stack2.push("Bye");
		stack2.push("hello");
		stack2.push("fine");
		System.out.println(stack2);
		//stack2.push("fine");
		System.out.println(stack2.pop());

		MyGStack<Integer> stack3=new MyGStack<Integer>(5);
	//	stack2.push("hi");
		stack3.push(45);
		stack3.push(15);
		stack3.push(45);
		System.out.println(stack3);
		stack3.push(65);
		stack3.push(47);
		System.out.println(stack3);
		System.out.println("Popped:"+stack3.pop()); 
		System.out.println("Popped:"+stack3.pop()); 
		System.out.println(stack3);
		System.out.println("Popped:"+stack3.pop()); 
		System.out.println("Popped:"+stack3.pop()); 
		System.out.println("Popped:"+stack3.pop()); 
		System.out.println(stack3);
		System.out.println("Popped:"+stack3.pop()); 
		// no need of downcasting
	}
}