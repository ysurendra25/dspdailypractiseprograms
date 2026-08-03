
public class SurprisingNumberInBinaryNumbers {

	public static void main(String[] args) {
		int number = 45;
		
		int sum = 0;
		for(int i=0;i<number;i++) {
			int count = 0;
			int currNum = i;
			while(currNum>0) {
				if(currNum%2==1) {
					count++;
				}
				currNum = currNum/2;
			}
			if(count>=3) {
				sum = sum+i;
			}
		}
		
		System.out.println(sum);

	}

}
