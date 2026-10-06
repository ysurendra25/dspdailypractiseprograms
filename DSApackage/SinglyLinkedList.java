package DSApackage;

class Node {
	String data;
	Node next;

	Node(String data) {
		this.data = data;
		this.next = null;
	}
}

public class SinglyLinkedList {

	public static void main(String[] args) {
		Node n1 = new Node("ram");
		Node n2 = new Node("bheem");
		Node n3 = new Node("somu");
		Node n4 = new Node("hhh");

		Node head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;

		// traverse the linked list
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
}
