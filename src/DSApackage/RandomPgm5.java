package DSApackage;

public class RandomPgm5 {

	public static void main(String[] args) {
		String s1 = "abcde";
		String s2 = "stuvwxyz";
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		int length = c1.length+c2.length;
		char c3[] = new char[length];
		
		int i = 0;
		int j=0;
		int k =0;
		while(i<c1.length && j<c2.length) {
			c3[k]=c1[i];
			k++;
			i++;
			c3[k]=c2[j];
			k++;
			j++;
		}
		
		if(c1.length>c2.length) {
			while(i<c1.length) {
				c3[k++] = c1[i++];
			}
		}
		if(c2.length>c1.length) {
			while(j<c2.length) {
				c3[k++] = c2[j++];
			}
		}
		
		for(char cc:c3) {
			System.out.print(cc);
		}
		
		

	}

}
