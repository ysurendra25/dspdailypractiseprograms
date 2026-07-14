package DSApackage;

public class SubarrayInSlidingWindow {

	public static void main(String[] args) {
		int arr1[] = {0,0,0,1,1,1};
		int k = 2;
		int zeroCount = 0;
		int maxLength = 0;
	
		for(int right=0;right<arr1.length;right++) {
			int length = 0;
			int left=right;
			if(arr1[right]==0) {
				zeroCount++;
				length++;
			}
			
			while(zeroCount<k || left<arr1.length-1) {
				if(arr1[left]==0) {
					zeroCount++;
					left++;
					length++;
				} else {
					length++;
					left++;
				}
			}
			maxLength = Math.max(maxLength, length);
			
		}
		
		System.out.println(maxLength);
		
		

	}

}
