package DSApackage;

public class VowelsReversing {

	public static void main(String[] args) {
		String s1 = "aeroplane";
		s1 = s1.toLowerCase();
		char c1[] = s1.toCharArray();
		
		int pos = 0;
		int count = 0;
		for(int i=0;i<c1.length;i++) {
			if(c1[i]=='a'||c1[i]=='e'||c1[i]=='o'||c1[i]=='u'||c1[i]=='u') {
				if(count<=1) {
					count++;
					pos = i;
					
				}else if(count>1) {
				char temp = c1[i];
				c1[i] = c1[pos];
				c1[pos] = temp;
				pos=i;
				count++;
				}
				
			}
		}
		
		for(char cc:c1) {
			System.out.print(cc);
		}
		
		

	}

}
