package DSApackage;

public class ThirdhighestElement {

	public static void main(String[] args) {
		int arr1[] = {9,9,4,7,2,8,1,1,4,4,4};
		int first = 9999;
		int second = 9998;
		boolean visited[] = new boolean[arr1.length];
		int arr2[] = new int[arr1.length];
		int increment = 0;
	
		for(int i=0;i<arr1.length;i++) {
			if(visited[i]) {
				continue;
			} else {
				arr2[increment] = arr1[i];
				increment++;
				for(int j=0;j<arr1.length;j++) {
					if(arr1[i]==arr1[j]) {
						visited[j] = true;
					}
				}
			}
		}
		
		for(int ss:arr2) {
			if(ss==0) {
				continue;
			}
			System.out.print(ss+" ");
		}

	}

}
