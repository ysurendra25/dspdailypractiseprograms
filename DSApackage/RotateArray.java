package DSApackage;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5,6,7};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter key to rotate");
		int key = sc.nextInt();
		
		for(int i=key;i<arr1.length;i++) {
			System.out.print(arr1[i]+", ");
		}
		for(int i=0;i<key;i++) {
			System.out.print(arr1[i]+", ");
		}

	}

}
