package DSApackage;

public class UniqueElements {

	public static void main(String[] args) {
		String str = "aaabbccc";
		char arr1[] = str.toCharArray();
        boolean visited[] = new boolean[arr1.length];
        int count = 0;
        
        for(int i=0;i<arr1.length;i++) {
        	if(visited[i]) {
        		continue;
        	} else {
        		for(int j=i;j<arr1.length;j++) {
        			if(arr1[i]==arr1[j]) {
        				visited[j] = true;
        			}
        		}
        		count++;
        	}
        }
        
        System.out.println(count);
        
	}

}
