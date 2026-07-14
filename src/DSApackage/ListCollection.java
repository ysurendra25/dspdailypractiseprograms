package DSApackage;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListCollection {

	public static void main(String[] args) {
		//uses continue memory,dynamic
		ArrayList<String> items = new ArrayList<String>();
        items.add("apple");
        items.add("banana");
        items.add("apple");
        items.add("cat");
        items.add("apple");
        //allows dulicates
        System.out.println(items);
        //if you are inserting an element anywhere like in the 0th index so you need to change all the position after that t.c=0(n)
        //but if we use linkedlist t.c=0(1) when you insert in the beginning and last but if you insert in other positions 0(n) because you need to go the position 
        items.add(0, "zoo");
        System.out.println(items);
        
        
        
        //linked list is not contiguous but it is dynamic and stores next element address
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("apple");
        l1.add("banana");
        System.out.println(l1);
        l1.addFirst("cat");
        l1.addLast("zoo");
        System.out.println(l1);
        System.out.println(l1.peek());
        System.out.println(l1.peekFirst());
        System.out.println(l1.peekLast());
        //accessing certain index
        System.out.println(l1.get(2));
        l1.removeFirst();
        l1.removeLast();
        //removing particular value
        l1.remove("apple");
        System.out.println(l1);
        //removing by index
        l1.remove(0);
        System.out.println(l1);
        
        
	}

}
