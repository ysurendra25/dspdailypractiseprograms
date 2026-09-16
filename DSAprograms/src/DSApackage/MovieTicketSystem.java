package DSApackage;

public class MovieTicketSystem {

	public static void main(String[] args) {
		//user needs n number of seats in a row with no 1s together
		int arr1[][] = {{0,0,1,0,0,0},
				         {1,1,0,0,1,0},
				         {0,0,0,0,0,0}};
		
		int num_seats = 0;
		int N = 2;
		
		for(int i=0;i<arr1.length;i++) {
			int count = 0;
			for(int j=0;j<arr1[i].length;j++) {
				if(arr1[i][j]==0) {
					count++;
				} else {
					count = 0;
				}
				
				if(count>=N) {
					num_seats++;
				}
			}
		}
		
		System.out.println(num_seats);

	}

}
