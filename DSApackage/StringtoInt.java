package DSApackage;

import java.util.Scanner;

public class StringtoInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter inut here");
		String input1 = sc.nextLine();
		
		String take_input[] = input1.split(" ");
		
		int arr1[] = new int[take_input.length];
		for(int i=0;i<take_input.length;i++) {
			arr1[i] = Integer.parseInt(take_input[i]);
		}
		
		for(int ss:arr1) {
			System.out.println(ss);
		}
		

	}

}
