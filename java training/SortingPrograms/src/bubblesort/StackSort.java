package bubblesort;

import java.util.Scanner;
import java.util.Stack;

public class StackSort {
	static void SortingStack(Stack<Integer> arr) {
		int temp = 0;
		for (int i = 1; i < arr.size(); i++) {
			for (int j = 0; j < (arr.size() - i); j++) {
				if (arr.get(j).compareTo(arr.get(j + 1)) > 0) {
					temp = arr.get(j);
					arr.set(j, arr.get(j + 1));
					arr.set(j + 1, temp);
				}
			}

		}
	}
	public static void main(String[] args) {
		Stack<Integer> arr = new Stack<Integer>();
		System.out.println("1.Enter values\n2.Press for sorting the Stack.");
		do {
			
			Scanner scanner = new Scanner(System.in);
			int count=scanner.nextInt();
			switch (count) {
			case 1:
				while (scanner.hasNextInt()) {
					int input=scanner.nextInt();
					arr.push(input);
				}
				System.out.println(arr);
				break;
			case 2:
				SortingStack(arr);
				System.out.println(arr);
				break;
			default:
				break;
			}
		}
		while(true);
	}

}
