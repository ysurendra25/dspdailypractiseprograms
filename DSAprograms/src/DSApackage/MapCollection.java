package DSApackage;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCollection {

	public static void main(String[] args) {
		Map<Integer,String> m1 = new HashMap<>();
		//add data
		m1.put(111, "ram");
		m1.put(112, "bheem");
		m1.put(113, "abhi");
		m1.put(114, "uday");
		//update data
		m1.put(111, "somu");
		System.out.println(m1);
		//delete data
		m1.remove(111);
		//check keys
		System.out.println(m1.containsKey(114));
		//check values
		System.out.println(m1.containsValue("abhi"));
		//get data
		System.out.println(m1.get(114));
		
		
		TreeMap<Integer, String> t1 = new TreeMap<Integer, String>();
		t1.put(111, "seetha");
		t1.put(112, "hero");
		t1.put(113, "ram");
		
		System.out.println(t1.firstEntry());
		System.out.println(t1.lastEntry());
		System.out.println(t1.pollFirstEntry());
		
		System.out.println("-------------------------------------------");
		for(Map.Entry<Integer, String> entry:t1.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		//
		

	}

}
