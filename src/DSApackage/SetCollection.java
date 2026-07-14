package DSApackage;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {

	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(100);
		s1.add(200);
		s1.add(100);
		System.out.println(s1);
		s1.remove(200);
		System.out.println(s1);
		System.out.println(s1.contains(100));
		
		//treeset
	    TreeSet<Integer> s2 = new TreeSet<Integer>();
	    s2.add(24);
	    s2.add(89);
	    s2.add(45);
	    s2.add(34);
	    s2.add(67);
	    System.out.println(s2);
	    System.out.println(s2.contains(33));
	    System.out.println(s2.ceiling(80));
	    System.out.println(s2.pollLast());
	    System.out.println(s2.removeFirst());
	    
	    
		

	}

}
