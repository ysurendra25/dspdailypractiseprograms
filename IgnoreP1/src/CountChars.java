
public class CountChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "aaabbccc";
		
		char c1[] = s1.toCharArray();
		boolean visited[] = new boolean[c1.length];
		char c2[] = new char[c1.length];
		int c2Len = 0;
		
		for(int i=0;i<c1.length;i++) {
		    if(visited[i]) {
		        continue;
		    } else {
		        int count = 0;
		        for(int j=0;j<c1.length;j++) {
		            if(c1[i]==c1[j]) {
		                count++;
		                visited[j] = true;
		            }
		        }
		        c2[c2Len] = c1[i];
		        c2Len++;
		        c2[c2Len] = (char)(count+'0');
		        c2Len++;
		    }
		}
		
		
		System.out.println(c2);
	}

}
