package DSApackage;

//subarray sum equals to k....
public class LeetCode560 {

	public static void main(String[] args) {
		int arr[] = {1,-1,0};
		
		int k = 0;
		int kCount = 0;
		for(int i=0;i<arr.length;i++) {
			int sum = 0;
			for(int j=i;j<arr.length;j++) {
				sum = sum+arr[j];
				if(sum==k) {
					kCount++;
				}
			}
		}
		
		System.out.println(kCount);
	}

}
