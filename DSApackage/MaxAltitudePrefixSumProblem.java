package DSApackage;

public class MaxAltitudePrefixSumProblem {

	public static void main(String[] args) {
		int arr1[] = {-5,1,5,0,-7};
		
		int max = arr1[0];
		int sum = arr1[0];
		for(int i=1;i<arr1.length;i++) {
			sum = sum+arr1[i];
			if(sum>max) {
				max = sum;
			}
		}
		System.out.println(max);

	}

}
