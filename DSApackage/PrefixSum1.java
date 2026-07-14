package DSApackage;

public class PrefixSum1 {

	public static void main(String[] args) {
		int arr1[] = {6,1,1,8,2,9};
		
		int sum = 0;
		for(int i=0;i<arr1.length;i++) {
			sum = sum+arr1[i];
			arr1[i] = sum;
		}
		for(int ss:arr1) {
			System.out.print(ss+" ");
		}

	}

}
