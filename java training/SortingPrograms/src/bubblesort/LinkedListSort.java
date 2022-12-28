package bubblesort;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListSort {
	static void Sorting(LinkedList<Integer> arr) {
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
		
		LinkedList<Integer> arr = new LinkedList<Integer>();
		System.out.println("1.Enter values\n2.Press for sorting the LinkedList.");
	do {
		
		Scanner scanner = new Scanner(System.in);
		int count=scanner.nextInt();
		switch (count) {
		case 1:
			while (scanner.hasNextInt()) {
				int input=scanner.nextInt();
				arr.add(input);
			}
			System.out.println(arr);
			break;
		case 2:
			Sorting(arr);
			System.out.println(arr);
			break;
		default:
			break;
		}
	}
	while(true);
	}
}
