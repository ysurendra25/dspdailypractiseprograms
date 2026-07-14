package DSApackage;

public class RandomPgm {

	public static void main(String[] args) {
	    String s1 = "a2b3c1";
	    char c1[] = s1.toCharArray();
	    int l1 = c1.length/2;
	    int arr1[] = new int[l1];
	    String str1[] = new String[l1];
	    int arr1_start=0;
	    int str1_start = 0;
	    for(int i=0;i<c1.length;i++) {
	    	if(c1[i]>='0' && c1[i]<'9') {
	    		arr1[arr1_start] = Character.getNumericValue(c1[i]);
	    		arr1_start++;
	    	} else {
	    		str1[str1_start] = String.valueOf(c1[i]);
	    		str1_start++;
	    	}
	    }
	    
	    for(int i=0;i<str1.length;i++) {
	    	int limit = arr1[i];
	    	while(limit>0) {
	    		System.out.print(str1[i]);
	    		limit--;
	    	}
	    }

	}

}
