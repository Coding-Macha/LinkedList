/*
 Say we're having two LL
 ll1 :  3|1020   4|1040   5|null
 ll2 :  3|2020   4|2040   5|null 
 To check whether these are LL are Identical or not
 i. take 2 node, say, a, b;
 ii. a is head lo LL1 and b is head of LL2
 iii. we'll be checking the data part of two LL upto to where they  reach the null node or one of them reach the null node 
 */
public class CompareLL {
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
		}
		Node n=head;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=new_node;
		new_node.next=null;
		
	}
	
	private boolean areIdentical(CompareLL ll1, CompareLL ll2) {
		Node a=ll1.head, b=ll2.head;
		while(a!=null&&b!=null)
		{
			if(a.data!=b.data)
			{
				return false;
			}
			a=a.next;
			b=b.next;
		}
		return true;
	}

	
	public static void main(String[] args) {
		
		CompareLL ll1=new CompareLL();
		CompareLL ll2=new CompareLL();
		ll1.append(3);
		ll1.append(4);
		ll1.append(5);
		ll2.append(6);
		ll2.append(4);
		ll2.append(5);
		
		if(ll1.areIdentical(ll1,ll2)==true)
		{
			System.out.println("ll are identical");
		}
		else
		{
			System.out.println("ll are not identical");
		}
		

	}

	

}
