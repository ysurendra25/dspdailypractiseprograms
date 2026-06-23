package DSApackage;

public class MergeArrays {

	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {5,6,7,8,9};
		
		int length = arr1.length+arr2.length;
		int merge_array[] = new int[length];
		
		
		for(int i=0;i<arr1.length;i++) {
			merge_array[i] = arr1[i];
		}
		int start = arr1.length;
		for(int i=0;i<arr2.length;i++) {
			merge_array[arr1.length+i] = arr2[i];
		}
		
		for(int ss:merge_array) {
			System.out.print(ss+", ");
		}

	}

}
