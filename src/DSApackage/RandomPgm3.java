package DSApackage;

public class RandomPgm3 {
   public static void main(String[] args) {
	   String s1 = "abcde";
	   String s2 = "stuvwxyz";
	   char c1[] = s1.toCharArray();
	   char c2[] = s2.toCharArray();
	   int length = c1.length+c2.length;
	   char c3[] = new char[length];
	   
	   int x=0;
	   
	   int diff = Math.abs(c1.length-c2.length);
	   
	   for(int i=0;i<diff;i++) {
		   c3[x] = c1[i];
		   x++;
		   c3[x] = c2[i];
		   x++;
	   }
	   if(c1.length>c2.length) {
		   for(int i=diff;i<c1.length;i++) {
			   c3[x] = c1[i];
			   x++;
		   }
	   } 
	   if(c2.length>c1.length) {
		   for(int i=diff;i<c2.length;i++) {
			   c3[x] = c2[i];
			   x++;
		   }
	   }
	   
	   for(char cc:c3) {
		   System.out.print(cc);
	   }
	   
	   
   }
}
