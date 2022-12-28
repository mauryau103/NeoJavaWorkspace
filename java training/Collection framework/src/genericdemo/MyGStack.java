package genericdemo;

public class MyGStack<T> {
	private int size;
	T myArray[];
	private int top=-1;
	public MyGStack(int size) {
		this.size = size;
		myArray=(T[]) new Object[size];
	}
	public int currentsize() {
		return top+1;
	}
	public void push(T o) {
		try {
		top++;
		myArray[top]=o;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
	public T pop() {
		try {
			if(top==-1)
				throw new StackUnderFlowException();
			else {
				T e=myArray[top];
				myArray[top]=null;
				top--;
				return e;
			}
		}
		catch(StackUnderFlowException e) {
			System.out.println(e);
			return null;
		}
		
	}
	@Override
	public String toString() {
				String contents="";
			for(T ob:myArray) {
				contents=contents+", "+ob;
			}
			return contents;
	}
	
}