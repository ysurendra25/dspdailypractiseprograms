package DSApackage;

public class SlidingWindowBasic {

	public static void main(String[] args) {
		int arr1[] = {1,3,4,6,8,10};
		
		int start = 0;
		int end = arr1.length-1;
		int target = 100;
		boolean findNums = false;
		while(start<end) {
			int addnum = arr1[start]+arr1[end];
			if(addnum==target) {
				System.out.println(start+", "+end+"are the locations to the target");
				findNums = true;
				break;
			} else if(target>addnum){
				start++;
			} else if(target<addnum) {
				end--;
			} 
		}
		if(!findNums) {
			System.out.println("no elements there to match");
		}
		

	}

}
