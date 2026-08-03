import java.util.HashMap;

public class valueFreq {

	public static void main(String[] args) {
		
		int arr[] = {1,2,2,2,2,3,22,};
		
		HashMap< Integer, Integer> h1 = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(h1.containsKey(arr[i])) {
				h1.put(arr[i], h1.get(arr[i])+1);
			} else {
				h1.put(arr[i], 1);
			}
			
			int value = h1.get(arr[i]);
			if(value>(arr.length)/2) System.out.println("finded value"+arr[i]);
		}
		
		System.out.println(h1);

	}

}
