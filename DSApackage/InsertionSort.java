package DSApackage;

public class InsertionSort {

	public static void main(String[] args) {
		int arr1[] = {86,42,23,18,25};
		for(int i=1;i<arr1.length;i++) {
			int j = i-1;
			int item = arr1[i];
			while(j>=0 && arr1[j]>item) {
				arr1[j+1] = arr1[j];
				j--;
			}
			arr1[j+1] = item;
		}
		
		for(int ss:arr1) {
			System.out.println(ss);
		}
	}

}
