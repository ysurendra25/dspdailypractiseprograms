package DSApackage;

import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import com.sun.jdi.Value;

public class PractiseCollections {

	public static void main(String[] args) {
		HashMap< String, Integer> h1 = new HashMap<>();
		
		h1.put("alice", 8);
		h1.put("bob", 9);
		h1.put("alice", 77);
		System.out.println(h1);
		h1.remove("bob");
		System.out.println(h1);
		System.out.println(h1.containsKey("alice"));
		System.out.println(h1.get("alice"));
		
		//right now we have duplicates
		ArrayList<String> itemList = new ArrayList<String>();
		itemList.add("apple");
		itemList.add("banana");
		itemList.add("apple");
		System.out.println(itemList);
		//by converting set we can remove duplicats
		Set<String> itemSet = new HashSet<String>();
		for(String ss:itemList) {
			itemSet.add(ss);
		}
		
		System.out.println(itemSet);
		
		
		
	}

}
