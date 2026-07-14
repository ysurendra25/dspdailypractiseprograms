package DSApackage;

public class RandomSlidingWindowApproach3 {

	public static void main(String[] args) {
		int arr1[] = {2,3,1,2,4,3};
		int low = 0;
		int windowSize = arr1.length-1;
		int sum = 0;
		for(int i=0;i<arr1.length;i++) {
			sum = sum+arr1[i];
			if(sum>=8) {
				sum = sum-arr1[low];
				low++;
			}
			int currWindowSize = i-low+1;
			
			if(windowSize>currWindowSize && sum>=7) {
				windowSize = currWindowSize;
			}
		}
		
		System.out.println(windowSize);

	}

}
