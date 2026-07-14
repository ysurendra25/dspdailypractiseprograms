package DSApackage;

public class SlidingWindowapproach {

	public static void main(String[] args) {
	     
		int arr1[] = {2,1,5,1,3,2};
		int k = 3;
		int windowSum = 0;
		for(int i=0;i<k;i++) {
			windowSum = windowSum+arr1[i];
		}
		int maxSum = windowSum;
		for(int i=k;i<arr1.length;i++) {
			windowSum = windowSum+arr1[i]-arr1[i-k];
			maxSum = Math.max(maxSum, windowSum);
		}
		
		System.out.println(maxSum);
		
		
		
	}

}
