import java.util.*;

/*
 * Deletion Procedure in java 
 * 
 * 
 
              1 |1000 -> 23|1020 -> 25|1040 -> 30|1060 -> 55|null
Node pos          1         2          3          4          5
Array index       0         1          2          3          4

here to delete node 3 (i.e 25|1040), we should unlink this node, 
to do that
i. we should traverse upto previous node
ii. copy the address of the node to temp Node
iii. now assign the address part of temp node to 2nd node address 

after deletion

              1 |1000 -> 23|1040 -> 30|1060 -> 55|null
 */

public class LinkedListNodeDeletion {
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
		Node new_node= new Node(data);
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
		new_node.next=null;
		return;
		
	}
	
	private Node listDelete(int pos, LinkedListNodeDeletion ll) {
		Node p=ll.head;
		Node temp =null;
		if(pos==1)
		{
			ll.head=p.next;
			return ll.head;
		}
		for(int i=0;i<pos-2;i++)
		{
			p=p.next;
		}
		temp=p.next;
		p.next=temp.next;
		return ll.head;
		
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
		Scanner sc= new Scanner(System.in);
		LinkedListNodeDeletion ll=new LinkedListNodeDeletion();
		for(int i=0;i<5;i++)
		{
			ll.append(sc.nextInt());
		}
		ll.printLL();
		int num=sc.nextInt();
	    ll.listDelete(num,ll);
	    System.out.println();
	    ll.printLL();
	    

	}

	


	




}
