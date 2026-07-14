package DSApackage;

public class SlidingWindowNonRepeating {

	public static void main(String[] args) {
		char arr1[] = {'a','b','c','a','b','c','b'};
        
		int charCount[] = new int[256];
		int left=0;
		int right = 0;
		int maxLength = 0;
		while(right<arr1.length-1) {
			if(charCount[arr1[right]]==0) {
				charCount[arr1[right]]++;
				maxLength = Math.max(maxLength, right-left+1);
				right++;
			} else {
				charCount[arr1[left]]--;
				left++;
			}
		}
		
		System.out.println(maxLength);
		
	}
}
