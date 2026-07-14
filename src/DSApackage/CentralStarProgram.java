package DSApackage;

import java.util.Scanner;

public class CentralStarProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n+1];
		
		for(int i=0;i<=n;i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			arr[u]++;
			arr[v]++;
		}
		
		boolean found = false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n-1) {
				System.out.println(i);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("None");
		}
		
	}

}
