package DSApackage;

public class BinarySearch {

	public static void main(String[] args) {
		int arr1[] = {10,20,30,40,50,60,70};
		int key = 6;
		
		int low = 0;
		int high = arr1.length-1;
		String success = "false";
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr1[mid]==key) {
				System.out.println("number "+key+"found in the array");
				success = "true";
				break;
			} else if(key>arr1[mid]){
				low = mid+1;
			} else if(key<arr1[mid]) {
				high = mid - 1;
			}
			
			
		}
		if(success=="false") {
			System.out.println("not found");
		}
		
		
		

	}

}
