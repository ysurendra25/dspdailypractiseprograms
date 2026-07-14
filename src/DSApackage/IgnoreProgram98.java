package DSApackage;

public class IgnoreProgram98 {

	public static void main(String[] args) {
	    String s1 = "this is not good";
	    
	    char c1[] = s1.toCharArray();
	    char c2[] = new char[c1.length];
	    for(int i=0;i<s1.length();i++) {
	    	if(c1[i]==' ') {
	    		c2[i] = c1[i];
	    	}
	    }
	    
	    int j = c1.length-1;
	    for(int i=0;i<c2.length;i++) {
	    	if(c1[j]==' ') {
	    		c2[i] = c2[j-1];
	    	} else 
	    		if(c2[i] == ' ') {
	    			c2[i+1] = c1[j];
	    		}
	    	 else {
	    	c2[i] = c1[j];
	    	}
	    	j--;
	    }
	    
	    for(char cc:c2) {
	    	System.out.print(cc);
	    }

	}

}
