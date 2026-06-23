package DSApackage;

public class SlidingWindow1 {

	public static void main(String[] args) {
		int arr1[] = {10,20,30,40,50,60};
		int low = 0;
		int windowSum = arr1[low]+arr1[low+1]+arr1[low+2];
		
		for(int i=0;i<arr1.length-2;i++) {
			int sum = arr1[i]+arr1[i+1]+arr1[i+2];
			System.out.println(sum);
		   	
		}
		while(low<arr1.length-2) {
			System.out.println(windowSum);
			low++;
		}
		
		
	}

}
