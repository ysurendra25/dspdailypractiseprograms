package DSApackage;

import java.util.Scanner;

public class Arrayinput {
	public static void main(String[] args) {
		System.out.println("Program started...");
		Scanner sc = new Scanner(System.in);

		int arr1[] = new int[5];
		System.out.println("Enter 5 integers:");

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt(); // waits for input
		}

		System.out.println("You entered (using for-each):");
		for (int ss : arr1) {
			System.out.println(ss);
		}

		System.out.println("You entered (using index loop):");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		System.out.println("Program finished.");
		sc.close();
	}
}
