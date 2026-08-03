import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int arr1[] = {11,22,33,44,55,66,77,88,99};
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		for(int ss:arr1) {
			a1.add(ss);
		}
		int insert_value = 40;
		int min = -1;
		int max = -1;int left = 0;int right = arr1.length-1;
		while(left<=right) {
			int middle = (left+right)/2;
			int middle_value = a1.get(middle);
			if(insert_value==middle_value) {
				System.out.println("already exists");
				break;
			} else if(insert_value>middle_value) {
				min = middle;
				left = middle+1;
			} else {
				max = middle;
				right = middle-1;
			}
		}
		
		System.out.println(min);
		System.out.println(max);
		a1.add(min+1,insert_value);
		System.out.println(a1);
		
	}

}
