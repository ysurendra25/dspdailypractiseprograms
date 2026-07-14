package DSApackage;

public class BubbleSort {
    public static void main(String[] args) {
    	int arr1[] = {24,18,73,89,23,9};
    	
    	String res = BubbleSort(arr1);
    	System.out.println(res);
    }
    
    public static String BubbleSort(int arr1[]) {
    	int count=0;
    	
    	while(count>0) {
    		count = 0;
    	for(int i=0;i<arr1.length-1;i++) {
    		int next_element = i+1;
    		if(arr1[i]>arr1[next_element]) {
    			int temp = arr1[i];
    			arr1[i] = arr1[next_element];
    			arr1[next_element]=temp;
    			count++;
    		}
    		
    	}
    }
    	for(int ss:arr1) {
    		System.out.println(ss);
    	}
    	return "done successfully";
    }
    
    
}


