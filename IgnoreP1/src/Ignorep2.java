
public class Ignorep2 {

	public static void main(String[] args) {
		int arr1[] = {3,5,6,2,7,4};
		
		int maxArea = 0;
		String minValues = " ";
		for(int i=0;i<arr1.length;i++) {
			int min = arr1[i];
			int area = i;
			for(int j = i+1;j<arr1.length;j++) {
				if(arr1[j]<min) {
					min = arr1[j];
				}
				//min = Math.min(min, j);
				int length = j-i+1;
				area = length*min;
				if(area>maxArea) {
					maxArea = area;
					minValues = i+" "+j;
				}
			}
		}
		
		System.out.println(maxArea);
		System.out.println(minValues);

	}

}
