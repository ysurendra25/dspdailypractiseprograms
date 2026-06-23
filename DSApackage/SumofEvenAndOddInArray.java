package DSApackage;

public class SumofEvenAndOddInArray {

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5,6,7,8};
		
		int Even_sum = 0;
		int Odd_Sum = 0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]%2==0) {
				Even_sum = Even_sum+arr1[i];
			} else if(arr1[i]%2!=0) {
				Odd_Sum = Odd_Sum+arr1[i];
			}
		}
		System.out.println("the even sum is: "+Even_sum);
		System.out.println("the odd sum is: "+Odd_Sum);

	}

}
