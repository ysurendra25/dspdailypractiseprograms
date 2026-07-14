package DSApackage;

import java.util.Scanner;

public class array2d {
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 int arr1[][] = new int[4][6];
    	 
    	 for(int i=0;i<arr1.length;i++) {
    		 for(int j=0;j<arr1[i].length;j++) {
    			 arr1[i][j] = sc.nextInt();
    		 }
    	 }
    	 
    	 for(int i=0;i<arr1.length;i++) {
    		 for(int j=0;j<arr1[i].length;j++) {
    			 System.out.print(arr1[i][j]);
    		 }
    		 System.out.println();
    	 }
    	 //access a particular element in the array
    	 System.out.println("next");
    	 
    	 for(int i=0;i<arr1.length;i++) {
    		 for(int j=0;j<arr1[i].length;j++) {
    			 if(i==3 & j==3) {
    				 System.out.println(arr1[i][j]);
    			 }
    		 }
    	 }
    	 
    	 System.out.println(arr1.length);
    	 System.out.println(arr1[0].length);
     }
}
