
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "madam";
		String s2 = "adamm";
		
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		boolean visited[] = new boolean[c2.length];
		int count = 0;
		
		for(int i=0;i<c1.length;i++) {
		    boolean found = false;
		    for(int j=0;j<c2.length;j++) {
		        if(c1[i]==c1[j] && visited[j]==false) {
		            visited[j] = true;
		            found = true;
		            count++;
		            break;
		        } else {
		            found = false;
		        }
		    }
		    if(!found) {
		        break;
		    }
		}
		if(count==(c2.length)) {
		    System.out.println("anagram it is");
		} else {
		    System.out.println("it is not anagram");
		}
	}

}
