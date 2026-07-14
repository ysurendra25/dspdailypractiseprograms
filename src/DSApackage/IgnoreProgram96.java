package DSApackage;

public class IgnoreProgram96 {

	public static void main(String[] args) {
		int arr[] = {-2,-1,2,3,-2,-2,1,-1};
		
		int lonegestStreak =  0;
		int sum = 0;
		int length = 0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
			if(sum>0) {
				length++;
			} else if(sum<=0) {
				length = 0;
				sum = 0;
			}
			if(length>lonegestStreak) {
				lonegestStreak = length;
			}
		}
		
		System.out.println(lonegestStreak);

	}

}
