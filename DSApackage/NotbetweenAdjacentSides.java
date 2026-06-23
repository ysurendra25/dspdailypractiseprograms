package DSApackage;

public class NotbetweenAdjacentSides {

	public static void main(String[] args) {
		
		
		String str = "aaabb";
		char c1[] = str.toCharArray();
		boolean visited[] = new boolean[c1.length];
		int maxCount = 0;
		char maxChar = ' ';
		int freq[] = new int[256];
		for(char cc:c1) {
			freq[cc]++;
		}
		
		for(int i=0;i<freq.length;i++) {
			
			if(freq[i]>maxCount) {
				maxCount = freq[i];
				maxChar = (char)i;
			}
		}
		char c2[] = new char[c1.length];
		int count = 0;
		for(int i=0;count<maxCount;i+=2) {
			c2[i] = maxChar;
			count++;
		}
		int pos = 0;
		for(int i=0;i<c2.length;i++) {
			if(c2[i]=='a') {
				continue;
			} else {
				for(int j=pos;j<c1.length;j++) {
					if(c1[j]!='a') {
						c2[i] = c1[j];
						pos = j;
					}
				}
			}
		}
		for(char cc:c2) {
			System.out.println(cc);
		}

	}

}
