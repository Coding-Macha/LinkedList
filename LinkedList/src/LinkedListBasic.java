
/*
 * 1. Creation of structure
 * 2. Main method
 * 3. print LL
 */
public class LinkedListBasic {
	Node head;
	
	static class Node{
		int data;
		Node next;
		public Node(int d)
		{
			data=d;
			next=null;
		}
	}

	private void printLL() {
		Node n=head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n=n.next;
					
		}
		
	}
	
	public static void main(String[] args) {
		LinkedListBasic ll=new LinkedListBasic();
		ll.head=new Node(1);
		Node second = new Node(44);
		Node Third= new Node(55);
		ll.head.next=second;
		second.next=Third;
		ll.printLL();
		System.out.println("2nd time: ");
		ll.printLL();
	
	}

	

}
