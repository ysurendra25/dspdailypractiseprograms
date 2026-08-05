
public class ValidAnagrams {
    public static void main(String[] args) {
    	
//    	String arr[] = {"eat","ate"};
//    	char c1[][] = new char[arr.length][];
//    	for(int i=0;i<arr.length;i++) {
//    		c1[i] = arr[i].toCharArray();
//    	}
//    	
//    	for(int i=1;i<arr.length;i++) {
//    		System.out.println(c1[i]);
//    	}
    	
    	
        String s1 = "abcdswq";
        String s2 = "wsdcaba";
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        
        boolean visited[] = new boolean[c1.length];
        if(c1.length!=c2.length) {
        	System.out.println("Not anagrams");
        } else {
        	int count = 0;
        	for(int i=0;i<c1.length;i++) {
        			
        			for(int j=0;j<c2.length;j++) {
        				if(c1[i]==c2[j] && !visited[j]) {
        					count++;
        					visited[j] = true;
        					break;
        				}
        			}
        			
        		}
        	if(c1.length==count) {
				System.out.println("valid anagrams");
			} else {
				System.out.println("not anagrams");
			}
        }
        
    }
}
