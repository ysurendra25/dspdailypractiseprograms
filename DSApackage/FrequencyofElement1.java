package DSApackage;
import java.util.Scanner;

public class FrequencyofElement1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l1 = sc.nextInt();
		int arr1[] = new int[l1];
		for(int i=0;i<l1;i++) {
			arr1[i] = sc.nextInt();
		}
		
		boolean visited[] = new boolean[arr1.length];
		
		for(int i=0;i<arr1.length;i++) {
			if(visited[i]==true) {
				continue;
			} 
			if(visited[i]==false) {
				int count = 0;
				for(int j=0;j<arr1.length;j++) {
					if(arr1[i]==arr1[j]) {
						count++;
						visited[j]=true;
					}
				}
				
				
				System.out.println(arr1[i]+" is repeated "+count+"times.");
			}
		}
		

	}

}
