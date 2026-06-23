package DSApackage;

public class TwoPointerInSlidingWindow {

	public static void main(String[] args) {
		int arr1[] = {100,50,150,25,75,125,15,45};
		
		int target = 750;
		int low = 0;
		int high = arr1.length-1;
		boolean isFind = false;
		for(int i=0;i<arr1.length/2;i++) {
			if(arr1[low]==target) {
				System.out.println("key found at "+low);
				isFind = true;
				return;
			} else if(arr1[high]==target) {
				System.out.println("key found at "+ high);
				isFind = false;
				return;
			}else {
				low++;
				high--;
			}
		}

		
		if(!isFind) {
			System.out.println("not present in the array");
		}
	}

}
