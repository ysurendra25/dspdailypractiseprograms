package DSApackage;

import java.util.Scanner;

public class isVowelWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1= sc.nextLine();
		s1 = s1.replace(":", "").replace(",", "").replace(" ", "");
		
		int low = 0;
		int high = s1.length()-1;
		int count = 0;
		while(low<high) {
			if(s1.charAt(low)==s1.charAt(high)) {
				count++;
				low++;
				high--;
			} else {
				System.out.println("not an palindrome");
				break;
			}
		}
		if(count==(s1.length()/2)) {
			System.out.println("palindrome");
		}
		
		
		
		

	}

}
