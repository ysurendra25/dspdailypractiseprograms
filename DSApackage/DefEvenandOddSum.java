package DSApackage;

public class DefEvenandOddSum {

	public static int sum_even(int[] arr1) {
		int count = 0;
		for(int i=0;i<arr1.length;i++) {
		if(arr1[i]%2==0) {
			count += arr1[i];
		}
		}
		return count;
	}
	
	public static int sum_Odd(int[] arr1) {
		int count = 0;
		for(int i=0;i<arr1.length;i++) {
		if(arr1[i]%2!=0) {
			count += arr1[i];
		}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("the even sum is: "+sum_even(arr1));
		System.out.println("the even sum is: "+sum_Odd(arr1));
		

	}

}
