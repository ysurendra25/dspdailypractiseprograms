package DSApackage;

import java.util.Scanner;

public class MaxElementInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size here: ");
		int n1 = sc.nextInt();
		
		int arr1[] = new int[n1];
		System.out.println(" enter the "+n1+" elements now:");
		for(int i=0;i<n1;i++) {
			arr1[i] = sc.nextInt();
		}
		
		int max_element = arr1[1];
		for(int i=1;i<n1;i++) {
			if(arr1[i]>max_element) {
				max_element = arr1[i];
			} else {
				continue;
			}
		}
		
		System.out.println("the max element in the array is: "+ max_element);
		

	}

}
