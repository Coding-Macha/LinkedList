import java.util.*;

public class LinkedListInsertionAtBeginning {
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

	private void push(int data) {
		Node new_node = new Node(data);
		new_node.next=head;
		head=new_node;	
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
		LinkedListInsertionAtBeginning ll= new LinkedListInsertionAtBeginning();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<6;i++)
		{
			ll.push(sc.nextInt());
		}
		ll.printLL();
		
		
	}

	

	

}
//https://youtu.be/-O0jcbUk9v8