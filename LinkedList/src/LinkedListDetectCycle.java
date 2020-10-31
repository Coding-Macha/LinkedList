/*
 * 				head
               1 |1000 -> 2|1020 -> 3|1040 -> 4|null 
   Node num			1       2         3          4
   
   					p	|		  |			|	
           			q	|		  |			|
          here initially i'll create loop
          for that i'll be linking head to last node
      So to detect loop:
      Take 2 nodes p=head, q=head;
      we'll increment p  1 time and q  2 times
      i'll repeat this until p and q are equal, if they are equal there is a loop
 */

public class LinkedListDetectCycle {
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
	
	public void append(int data)
	{
		Node new_node=new Node(data);
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
	
	private boolean detectloop() {
		Node p=head;
		Node q= head;
		while(p!=null&&q!=null&& q.next!=null)
		{
			p=p.next;
			q=q.next.next;
			if(p==q)
			{
				return true;
			}
		}
		return false;
	
	}
	
	public static void main(String[] args) {
		LinkedListDetectCycle ll1=new LinkedListDetectCycle();
		ll1.append(1);
		ll1.append(2);
		ll1.append(3);
		ll1.append(4);
		ll1.head.next.next.next.next=ll1.head;
		System.out.print(ll1.detectloop());
		
		

	}

	

}
