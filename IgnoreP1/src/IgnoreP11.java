
public class IgnoreP11 {
  public static void main(String[] args) {
	  int arr1[] = {5,7,2,3,9};
	  
	  for(int i=0;i<arr1.length-1;i++) {
		  for(int j=i+1;j<arr1.length;j++) {
			  if(arr1[i]>arr1[j]) {
				  int temp = arr1[i];
				  arr1[i] = arr1[j];
				  arr1[j] = temp;
			  }
		  }
	  }
	  
	  for(int ss:arr1) {
		  System.out.print(ss+" ");
	  }
	  
  }
}
