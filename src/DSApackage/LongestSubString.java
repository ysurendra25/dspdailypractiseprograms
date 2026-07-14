package DSApackage;

public class LongestSubString {

	public static void main(String[] args) {
		int arr1[] = {1,1,2,2,2,3};
		
		boolean visited[] = new boolean[arr1.length];
		
		int ran = 0;
		for(int i=0;i<arr1.length;i++) {
			if(visited[i]==true) continue;
			
			int count = 1;
			for(int j=0;j<arr1.length;j++) {
				if(arr1[i]==arr1[j]) {
					count++;
					visited[j]=true;
				}
			}
            	System.out.println(arr1[i]+" repeated "+count+" times");
		}

	}

}
