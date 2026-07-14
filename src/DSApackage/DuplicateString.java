package DSApackage;

import java.util.Scanner;

public class DuplicateString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.next();
		}
		
		boolean visited[] = new boolean[n];
		for(int i=0;i<arr.length;i++) {
			if(visited[i]) {
				continue;
			} else {
				System.out.println(arr[i]);
				for(int j=0;j<arr.length;j++) {
					if(arr[i].equals(arr[j])) {
						visited[j] = true;
					}
				}
			}
		}

	}

}
