package DSApackage;

public class SelectionSort {

	public static void main(String[] args) {
		int arr1[] = {21,71,34,89,54,8};
		for(int i=0;i<arr1.length;i++) {
			int max = arr1[i];
			int pos = i;
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[j]>max) {
					max = arr1[j];
					pos = j;
				}
			}
			int temp = arr1[i];
			arr1[i] = arr1[pos];
			arr1[pos] = temp;
			
			
		}
		
		for(int ss:arr1) {
			System.out.print(ss+" ");
		}

	}

}
