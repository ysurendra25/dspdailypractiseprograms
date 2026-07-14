package DSApackage;

public class IgnoreProgram99 {
    public static void main(String[] args) {
    	String s1 = "today iam not coming";
    	
    	int start = 0;
    	int end = 0;
    	boolean found = false;
    	for(int i=0;i<s1.length();i++) {
    		if(s1.charAt(i)==' ') {
    			end = i-1;
    			found = true;
    		} else 
    		if(i==s1.length()-1) {
    			end = i;
    			found = true;
    		}
    		if(found) {
    			for(int j=end;j>=start;j--) {
    				System.out.print(s1.charAt(j));
    			}
    			if(i<s1.length()-2) {
    				System.out.print("-");
    			}
    			start = i+1;
    			end = i+1;
    			found = false;
    		}
    		
    	}
    }
}
