package DSApackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import com.sun.source.tree.Tree;

public class SlidingWindowApproach3 {

	public static void main(String[] args) {
		Integer arr[] = {5,2,6,9,5,3,2};
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		
		for(int ss:arr) {
			t1.add(ss);
		}
		System.out.println(t1);
		
		Set<Integer> t2 = new TreeSet<Integer>(Arrays.asList(arr));
		

	}

}
