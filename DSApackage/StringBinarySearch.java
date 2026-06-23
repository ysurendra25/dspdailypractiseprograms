package DSApackage;

public class StringBinarySearch {
     public static void main(String[] args) {
    	 String arr1[] = {"ram","bheem","somu","geetha","seetha","meena"};
    	 String key = "ram";
  
    	 String res = BinarySearch(arr1, key);
    	 System.out.println(res);
     }
     
     public static String BinarySearch(String arr1[],String key) {
    	 
    	 int low = 0;
    	 int high = arr1.length-1;
    	 String success = "false";
    	 while(low<=high) {
    		 int mid = (low+high)/2;
    		 if(arr1[mid].equals(key)) {
    			 System.out.println(key+" founded in the array");
    			 success = "true";
    			 return "element found in the array";
    		 } else if(key.compareTo(arr1[mid])<0) {
    			 high = mid-1;
    		 } else if(key.compareTo(arr1[mid])>0) {
    			 low = mid+1;
    		 }
     }
    	 return "element not found in the array";
}
     
     
}
