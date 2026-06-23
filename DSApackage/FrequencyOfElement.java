package DSApackage;

import java.util.Scanner;

public class FrequencyOfElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr1[] = {1,2,2,3,1,2,2,2,2,6,0,6,6,6};
		
		boolean visited[] = new boolean[arr1.length];
		
		for(int i=0;i<arr1.length;i++) {
			if(visited[i]==true) {
				continue;
			} 
			if(visited[i]==false) {
				int count = 0;
				for(int j=0;j<arr1.length;j++) {
					if(arr1[j]==arr1[i]) {
						count = count+1;
						visited[j]=true;
					}
					
				}
				System.out.println("the count of"+arr1[i]+" is "+count);
				
			}
		}

	}

}
