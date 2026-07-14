package DSApackage;

import java.util.Scanner;

public class StringInputtoArrray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string input");
		String s1 = sc.nextLine();
		String[] line = s1.split(" ");
		int arr1[] = new int[line.length];
		
		for(int i=0;i<line.length;i++) {
			arr1[i] = Integer.parseInt(line[i]);
		}
		for(int ss:arr1) {
			System.out.println(ss);
		}
		
		

	}

}
