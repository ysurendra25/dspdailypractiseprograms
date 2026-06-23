package DSApackage;

import java.util.HashSet;

public class LongestSubStringWithoutRepeating {

	public static void main(String[] args) {
		char arr1[] = {'a','b','c','a','b','c'};
		
		char ch1 = arr1[0];
		int length = 1;
		System.out.print(arr1[0]+" ");
		HashSet<Character> h1 = new HashSet<Character>();
		
		for(int i=1;i<arr1.length;i++) {
			if(!h1.contains(arr1[i])) {
			h1.add(arr1[i]);
			if(arr1[i]==ch1) {
				continue;
			} else {
				System.out.print(arr1[i]+" ");
				ch1 = arr1[i];
				length++;
			}
			}
		}
		
		System.out.println(length);

	}

}
