package DSApackage;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;

public class IgnoreProgram95 {

	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(0,9);
		v1.add(1,100);
		v1.add(2,200);
		v1.add(3,200);
		
		System.out.println(v1);
		
		java.util.List<String> l1 = new ArrayList<>();
        l1.add("amar");
        l1.add("geetha");
        System.out.println(l1);
		
        Map<Integer, String> h1 = new HashMap<Integer, String>();
        h1.put(1, "geetha");
        h1.put(2, "seetha");
        for(Entry<Integer, String> entry : h1.entrySet()) {       
        	System.out.println(entry.getKey()+" "+entry.getValue());
        }
		
	}

}
