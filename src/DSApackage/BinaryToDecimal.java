package DSApackage;

public class BinaryToDecimal {

	public static void main(String[] args) {
		String s1 = "10010100";
		
		int square_value = 1;
		int decimalValue = 0;
		int pos = s1.length()-1;
		while(pos>=0) {
			char curr = s1.charAt(pos);
			if(curr=='1') {
				decimalValue = decimalValue + square_value;
			}
			pos--;
			square_value = square_value*2;
		}
		
		System.out.println(decimalValue);
		
	}

}
