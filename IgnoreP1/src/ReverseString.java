
public class ReverseString {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		
		int target = 55;
		int sum = a+b;
		int count = 2;
		while(count<10) {
			int tsum = sum + b;
			b = sum;
			sum = tsum;
			count++;
		}
		
		System.out.println(sum);
		
		String s1 = "1010101";
		int a1 = Integer.parseInt(s1);
		System.out.println(a1);
		
		String s2 = "how are you";
		String c2[] = s2.split(" ");
		
		for(String ss:c2) {
			System.out.print(ss+" ");
		}

	}

}
