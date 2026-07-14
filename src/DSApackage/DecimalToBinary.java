package DSApackage;

public class DecimalToBinary {

	public static void main(String[] args) {
		int number = 10;
		while(number>=1) {
			if(number%2==1) {
				System.out.print(1);
			} else if(number%2==0) {
				System.out.print(0);
			}
			number = number/2;
		}

	}

}
