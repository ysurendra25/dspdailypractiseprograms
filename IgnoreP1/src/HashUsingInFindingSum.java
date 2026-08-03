import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class HashUsingInFindingSum {
    public static void main(String[] args) {
    	int arr[] = {3,2,7,5,3,8,9,9};
    	int target = 18;
    	
    	HashMap<Integer, Integer> h1 = new HashMap<Integer, Integer>();
    	for(int i=0;i<arr.length;i++) {
    		int need = target-arr[i];
    		
    		if(h1.containsKey(need)) {
    			int value = h1.get(need);
    			System.out.println(arr[i]+" ,"+arr[value]);
    			break;
    		}
    		h1.put(arr[i], i);
    	}
    	
  
    	
    }
}
