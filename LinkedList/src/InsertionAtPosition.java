/*
data|address

1 |1000 -> 23|1020 -> 25|1040 -> 30|1060 -> 55|1080

ok now if we want to insert a new Node Say 89 at postion 3

we'll create a new node and pass data to it
89|null
this Node Should be inserted at postion 3

                              89|null |
                                      v

              1 |1000 -> 23|1020 -> 25|1040 -> 30|1060 -> 55|null
Node pos          1         2          3          4          5
Array index       0         1          2          3          4
     
After Insertion 
 1 |1000 -> 23|1100 -> 89|1020 -> 25|1040 -> 30|1060 -> 55|null
*/
public class InsertionAtPosition {
	
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
	
	private void append(int data) {
		Node new_node = new Node(data);
		if(head==null)
		{
			head=new_node;
			new_node.next=null;
			return;
		}
		Node n=head;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=new_node;
		return;
		
		
	}
	
	
	private void insertatpos(int pos, int data) {
		
		Node new_node=new Node(data);
		if(head==null)
		{
			head=new_node;
			new_node.next=null;
			return;
		}
		Node n=head;
		for(int i=0;i<pos-2;i++)
		{
			n=n.next;
		}
		new_node.next=n.next;
	    n.next=new_node;
	}
	
	private void printLL() {
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		
	}

	public static void main(String[] args) {
		InsertionAtPosition ll=new InsertionAtPosition();
		ll.append(1);
		ll.append(23);
		ll.append(25);
		ll.append(30);
		ll.append(55);
		ll.printLL();
		ll.insertatpos(3,89);
		
	System.out.println();
	ll.printLL();
	ll.insertatpos(5, 99);
	System.out.println();
	ll.printLL();
	
		
	}

	

	

	

}
