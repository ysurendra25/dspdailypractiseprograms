package DSApackage;

public class SlidingWindowApproach3 {

	public static void main(String[] args) {
		int arr1[] = {2,3,1,2,4,3};
		int windowSize = arr1.length;
		int windowSum = 0;
		
		int low = 0;
		int right = arr1.length;
		int currWindowSum = 0;
		int currSize = 0;
		while(low<arr1.length-1) {
			currWindowSum = currWindowSum+arr1[low];
			currSize = right+1-low;
			if(windowSum>=7) {
				low++;
			} else {
				right++;
			}
			
			if(currSize<windowSize && currWindowSum>=7) {
				windowSum = currWindowSum;
				windowSize = currSize;
			}
		}
		
		System.out.println(windowSize);
		System.out.println(windowSum);
		

	}

}
