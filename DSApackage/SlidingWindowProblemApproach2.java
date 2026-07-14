package DSApackage;

public class SlidingWindowProblemApproach2 {

	public static void main(String[] args) {
		int arr1[] = {10,20,30,40,50,60};
		int k = 2;
		int windowSum = 0;
		for(int i=0;i<k;i++) {
			windowSum = windowSum+arr1[i];
		}
		System.out.println(windowSum);
		
		for(int i=k;i<arr1.length;i++) {
			windowSum = windowSum+arr1[i]-arr1[i-k];
			System.out.println(windowSum);
		}

	}

}
