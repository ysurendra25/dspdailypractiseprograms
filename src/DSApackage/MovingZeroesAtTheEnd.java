package DSApackage;

public class MovingZeroesAtTheEnd {

	public static void main(String[] args) {
		int arr1[] = {0,1,0,3,12,9};

		int j = 0;
        for(int i=0;i<arr1.length;i++) {
            if(arr1[i]!=0) {
                int temp = arr1[i];
                arr1[i]= arr1[j];
                arr1[j] = temp;
                j++;
            }
        }
		
		for(int ss:arr1) {
			System.out.print(ss+" ");
		}

	}

}
