package DSApackage;

public class SecondHighest {

	public static void main(String[] args) {
         int arr1[] = {5, 2, 9, 1, 9, 7,9,0,6};
         
         int first_h = -99;
         int second_h = -1;
         for(int i=0;i<arr1.length;i++) {
        	 if(arr1[i]>first_h) {
        		 first_h = arr1[i];
        		 continue;
        	 } else if(arr1[i]>second_h && first_h != arr1[i]) {
        		 second_h = arr1[i];
        		 continue;
        	 } else {
        		 continue;
        	 }
         }
         
         System.out.println(second_h);
         

	}

}
