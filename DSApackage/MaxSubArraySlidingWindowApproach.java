package DSApackage;

public class MaxSubArraySlidingWindowApproach {

	public static void main(String[] args) {
		int arr1[] = {0,0,0,1,1,1};
		int k = 2;
		
		int left=0;
		int maxLength = 0;
		int zeroCount = 0;
		for(int right=0;right<arr1.length;right++) {
			if(arr1[right]==0) {
				zeroCount++;
			}
			while(zeroCount>k) {
				if(arr1[left]==0) {
					zeroCount--;
				}
				left++;
			}
			int length = right-left+1;
			maxLength = Math.max(maxLength, length);
		}
		
		System.out.println(maxLength);

	}

}
