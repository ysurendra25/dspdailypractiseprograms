package DSApackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class LeetCode347 {

	public static void main(String[] args) {
		
		int arr[] ={4,4,4,4,5,5,6,6,6,7};
		
		Map<Integer, Integer> h1 = new HashMap<Integer, Integer>();
		for(int ss:arr) {
			if(!h1.containsKey(ss)) {
				h1.put(ss, 0);
			}
			h1.put(ss, h1.get(ss)+1);
		}
		
		PriorityQueue<Map.Entry<Integer, Integer>> p1 = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
		
		for(Map.Entry<Integer, Integer> entry:h1.entrySet()) {
			p1.add(entry);
		}
		
		//practising all topics about collection
		
		for(Map.Entry<Integer, Integer> hh:h1.entrySet()) {
			
		}
		
		for (Map.Entry<Integer, Integer> entry : p1) {
		    System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		
		
		
		
	}

}
