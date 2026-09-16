package DSApackage;

public class ArmStrong {

	public static void main(String[] args) {
		int num = 153;
		String str = Integer.toString(num);
		
		int sqr = str.length();
		int sum = 0;
		while(num>0) {
			int preNum = num%10;
			int presum = (int)Math.pow(preNum,sqr);
			sum = sum + presum;
			num = num/10;
		}
		
		System.out.println(sum);
		

	}

}
