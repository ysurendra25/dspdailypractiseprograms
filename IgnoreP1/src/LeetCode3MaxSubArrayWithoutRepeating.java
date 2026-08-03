import java.util.HashSet;

public class LeetCode3MaxSubArrayWithoutRepeating {
    public static void main(String[] args) {
   	    char arr1[] = {'a','b','c','b','d','a','c'};
//    	
   	    boolean visited[] = new boolean[256];
    	int left = 0;
    	int maxLength = 0;
    	int minPos = 0;
    	int maxPos = 0;
    	
    	for(int i=0;i<arr1.length;i++) {
    		int ch = arr1[i];
    		if(!visited[ch]) {
    			visited[ch] = true;
    		} else if(visited[ch]) {
    			while(visited[ch]) {
    				visited[arr1[left]] = false;
    				left++;
    			}
    		}
    		int length = i-left+1;
    		maxLength = Math.max(maxLength, length);
    	}
    	
    	System.out.println(maxLength);
   	    
    	
    	//method2 using hashset
    	char c2[] = {'a','b','c','a','c','d','c','a','c','b','b','c','d','a','d','c'};
    	
    	HashSet<Character> set = new HashSet<Character>();
    	int left2 = 0;
    	for(char ss:c2) {
    		if(!set.contains(ss)) {
    			set.add(ss);
    		} else if(set.contains(ss)) {
    			while(set.contains(ss)) {
    				set.remove(c2[left]);
    				left++;
    			}
    			set.add(ss);
    		}
    	}
    	
   	    
   	    
   	    
    }
}
