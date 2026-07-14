package DSApackage;

public class RandomSlidingWindowApproach {

	public static void main(String[] args) {
		int arr1[] = {0,1,0,2,3,1,2};
		int right = arr1.length-1;
		
		for(int i=0;i<right;i++) {
			if(arr1[i]==0) {
				for(int j=i;j<right;j++) {
					int temp = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = temp;
				}
			}
		}
		
		for(int ss:arr1) {
			System.out.print(ss+" ");
		}

	}

}
