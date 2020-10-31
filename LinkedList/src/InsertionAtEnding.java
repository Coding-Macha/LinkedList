import java.util.Scanner;

public class InsertionAtEnding {
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
		Node new_node=new Node(data);
		if(head==null)
		{
			head=new_node;
			new_node.next=null;
			return;
		}
		new_node.next=null;
		Node n=head;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=new_node;
		return;
		
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
	 InsertionAtEnding ll=new InsertionAtEnding();
	 Scanner sc=new Scanner(System.in);
	 for(int i=0;i<6;i++)
	 {
		 ll.append(sc.nextInt());
	 }
	 ll.printLL();
		

	}

	

}
