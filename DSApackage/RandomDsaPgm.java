package DSApackage;

public class RandomDsaPgm {

	public static void main(String[] args) {
		String s1 = "hi how are you";
		char c1[] = s1.toCharArray();
		char c2[] = new char[c1.length];
		for(int i=0;i<c1.length;i++) {
			if(c1[i]==' ') {
				c2[i] = c1[i];
			}
		}
		
		int j = c1.length-1;
		for(int i=0;i<c1.length;i++) {
			if(c1[i]==' ') {
				continue;
			} 
			if(c2[j]==' ') {
				c2[j-1] = c1[i];
				j--;
			}
				c2[j]=c1[i];
				j--;
			
		}
		
		for(char cc:c2) {
			System.out.print(cc);
		}
		
	}

}
