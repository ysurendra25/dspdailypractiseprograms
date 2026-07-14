package DSApackage;

import java.util.Scanner;

public class mergetwoarrays3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter array1 row size");
		int n1 = sc.nextInt();
		System.out.println("enter array1 col size");
		int m1 = sc.nextInt();
		
		int arr1[][] = new int[n1][m1];
		for(int i=0;i<n1;i++) {
			for(int j=0;j<m1;j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("enter array2 row size");
		int n2 = sc.nextInt();
		System.out.println("enter array2 col size");
		int m2 = sc.nextInt();

		int arr2[][] = new int[n2][m2];
		for(int i=0;i<n2;i++) {
			for(int j=0;j<m2;j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		System.out.println("col wise merging");
		///doing column wise merging
		int row_length = arr1.length;
		int col_length = arr1[0].length+arr2[0].length;
		int mergedArray[][] = new int[row_length][col_length];
		
		for(int i=0;i<row_length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				mergedArray[i][j] = arr1[i][j];
			}
			
			for(int k=0;k<arr2[i].length;k++) {
				mergedArray[i][arr1[i].length+k] = arr2[i][k];
			}
		}
		
		for(int i=0;i<mergedArray.length;i++) {
			for(int j=0;j<mergedArray[i].length;j++) {
				System.out.print(mergedArray[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("col wise merging");
		///doing row wise merging 
		int row_length2 = arr1.length+arr2.length;
		int col_length2 = arr1[0].length;
		
		int mergeArray2[][] = new int[row_length2][col_length2];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				mergeArray2[i][j]=arr1[i][j];
			}
		}
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				mergeArray2[arr1.length+i][j]=arr2[i][j];
			}
		}
		
		for(int i=0;i<mergeArray2.length;i++) {
			for(int j=0;j<mergeArray2[i].length;j++) {
				System.out.print(mergeArray2[i][j]);;
			}
			System.out.println();
		}
		
		
		
	}

}
