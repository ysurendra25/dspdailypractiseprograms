package DSApackage;

import java.util.Scanner;

public class MaxDiff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr1[][] = new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		int maxDiff = 0;
		int posijValue = arr1[0][0];
		for(int i=0;i<arr1.length;i++) {
			for(int j=1;j<arr1[0].length;j++) {
				if(i==0 || j==arr1[0].length-1) {
					int diff = (arr1[i][j])-posijValue;
					if(diff>maxDiff) {
						maxDiff = diff;
					}
					posijValue = arr1[i][j];
				}
			}
		}
		
		System.out.println(maxDiff);

	}

}
