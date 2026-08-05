import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

	public static void main(String[] args) {
		
		String arr[] = {"eat","tea","tan","ate","nat","bat"};
		
		HashMap<String , List<String>> h1 = new HashMap<String, List<String>>();
		for(int i=0;i<arr.length;i++) {
			char[] c1 = arr[i].toCharArray();
			Arrays.sort(c1);
			String s1 = new String(c1);
			if(!h1.containsKey(s1)) {
				h1.put(s1, new ArrayList<String>());
			}
			
			h1.get(s1).add(arr[i]);
			
		}
		
		System.out.println(h1);
		
		
		
	}

}
