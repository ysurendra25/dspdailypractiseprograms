package DSApackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LettCode128OptimalApproach {
    public static void main(String []args) {
    	
    	int arr[] = {100, 4, 200, 1, 3, 2};
    	
    	int maxLnegth = 0;
    	HashSet<Integer> h1 = new HashSet<Integer>();
    	for(int ss:arr) {
    		h1.add(ss);
    	}
    	for(int ss:h1) {
    		if(h1.contains(ss-1)) {
    			continue;
    		} else {
    		int length = 1;
    		int next = ss+1;
    		while(h1.contains(next)) {
    			length++;
    			next++;
    		}
    		maxLnegth = Math.max(length, maxLnegth);
    	}
    	}
    	System.out.println(maxLnegth);
    	
    }
}
