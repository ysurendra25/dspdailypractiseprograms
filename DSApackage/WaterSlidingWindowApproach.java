package DSApackage;

public class WaterSlidingWindowApproach {

	public static void main(String[] args) {
	    int arr1[] = {1,8,6,2,5,4,8,3,7};
        
	    int low = 0;
	    int high = arr1.length-1;
	    int maxArea = 0;
	    int bestLow = 0;
	    int bestHigh = 0;
	    while(low<high) {
	    	int currWidth = high-low;
	    	int currHeight = Math.min(arr1[low], arr1[high]);
	    	int currArea = currHeight*currWidth;
	    	if(currArea>maxArea) {
	    		maxArea = currArea;
	    		bestHigh = high;
	    		bestLow = low;
	    	}
	    	if(arr1[low]<arr1[high]) {
	    		low++;
	    	} else {
	    		high--;
	    	}
	    }
	    
	    System.out.println("locations are "+bestLow+", "+bestHigh+"area is: "+maxArea);
	    
	    
	    
	
	}

}
