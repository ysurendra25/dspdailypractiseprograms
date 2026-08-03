
public class ReverseString1 {

	public static void main(String[] args) {
		
String s1 = "who are you";
		
		char c1[] = s1.toCharArray();
		
		int j = c1.length-1;
		for(int i=0;i<(c1.length)/2;i++) {
		    char temp = c1[i];
		    c1[i] = c1[j];
		    c1[j] = temp;
		    j--;
		}
		
		System.out.println(c1);
		//converting again into String
		String s2 = new String(c1);
		System.out.println(s2);

	}

}
