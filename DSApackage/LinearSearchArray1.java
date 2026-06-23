package DSApackage;

public class LinearSearchArray1 {

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5,6};
		int key = 3;
		for(int i=key;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
        boolean res = linearSearch(arr1, key);
        System.out.println(res);
		
	}
	public static boolean linearSearch(int arr1[],int key) {
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==key) {
				System.out.println(key+" founded in the array");
				return true;
			}
		}
		return false;
		
	}

}
