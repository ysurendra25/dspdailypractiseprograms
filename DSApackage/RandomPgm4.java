package DSApackage;

public class RandomPgm4 {
   public static void main(String[] args) {
	   String s1 = "abcde";
	   String s2 = "stuvwxyz";
	   char c1[] = s1.toCharArray();
	   char c2[] = s2.toCharArray();
	   int length = c1.length+c2.length;
	   char c3[] = new char[length];
	   
	   int count1 =0;
	   int store1 = 0;
	   while(count1>c1.length) {
		   for(int i=0;i<c1.length;i++) {
			   c3[store1] = c1[i];
			   store1 = store1+2;
			   count1++;
		   }
	   }
	   
	   int count2=0;
	   int store2 = 1;
	   while(count2)
	   
	   
	   
   }
}
