package DSApackage;

public class MaxSubarrayCountInBitwiseInput {

	public static void main(String[] args) {
		int arr1[] = {0,1,1,0,0,1,1,1};
		
		int maxCount=0;
		int oneCount=0;
		int zeroCount=0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==1) {
				oneCount++;
				continue;
			}
			if(arr1[i]==0 && zeroCount<=0) {
				zeroCount++;
				oneCount++;
			} else {
			    maxCount = Math.max(maxCount, oneCount);
			    oneCount=0;
			    zeroCount=0;
			}
		}
		
		
		System.out.println(maxCount);

	}

}
