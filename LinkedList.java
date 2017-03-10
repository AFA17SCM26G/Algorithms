/*
 * Author: Anvesh Gangasani
 * Date:Jan-7-2017
 * Complexity: Insert Time O(1)
 * Implementation of LinkedList
 */
public class LinkedList {
	
	class Node {
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	Node head;
	public void push(int new_data)
	{
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	public void insertAfter(Node previous_node,int new_data)
	{
		if(previous_node == null)
		{
			System.out.println("previous_node should not be a null");
			return;
		}
		
		Node new_node=new Node(new_data);
		new_node.next=previous_node.next;
		previous_node.next=new_node;
	}
	public void append(int new_data)
	{
		Node new_node=new Node(new_data);
		if(head == null)
		{
			head=new_node;
			return;
		}
		new_node.next=null;
		Node last=head;
		while(last.next !=null )
		{
			last= last.next;
		}
		last.next=new_node;
		return;
	}
	public void deletelist(int key)
	{
		Node tmp= head,prev=null;
		if(tmp !=null && tmp.data==key)
		{
			head=tmp.next;
			return;
		}
		while(tmp != null && tmp.data != key)
		{
			prev=tmp;
			tmp= tmp.next;
		}
		if(tmp == null)
		{
			return;
		}
		prev.next=tmp.next;
		
	}
	public void deleteLiistAtPosition(int position)
	{
		Node tmp= head,prev=null;
		int count=0;
		if(tmp !=null && position==0)
		{
			head=tmp.next;
			return;
		}
		while(tmp != null && count != position)
		{
			prev=tmp;
			tmp= tmp.next;
			count++;
		}
		if(tmp == null)
		{
			return;
		}
		prev.next=tmp.next;
		
	}
	public void getCount()
	{
		int count=0;
		Node tmp=head;
		while(tmp != null)
		{
			count++;
			tmp=tmp.next;
		}
		System.out.println("the length of Linkedlist is : "+count);
	}
	public void swapNodes(int key1,int key2)
	{
		if(key1==key2 || head == null)
		{
			return;
		}
		Node prev_key1=null,prev_key2=null,current_key1=head,current_key2=head;
		while(current_key1 != null && current_key1.data!=key1 )
		{
			prev_key1=current_key1;
			current_key1=current_key1.next;
		}
		while(current_key2 != null && current_key2.data!=key2 )
		{
			prev_key2=current_key2;
			current_key2=current_key2.next;
		}
		if(current_key1==null ||current_key2 == null )
		{
			return;
		}
		if(prev_key1!= null)
		{
			prev_key1.next=current_key2;
		}
		else
		{
			head=current_key2;
		}
		if(prev_key2!= null)
		{
			prev_key2.next=current_key1;
		}
		else
		{
			head=current_key1;
		}
		Node temp=current_key1.next;
		current_key1.next=current_key2.next;
		current_key2.next=temp;
			
	}
	public Node reverseList(Node node)
	{
		Node next=null;
		Node prev=null;
		Node current=node;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		node=prev;
		return node;
	}
	public Node recursiveReverse(Node current,Node prev)
	{
		if(current.next == null)
		{
			head=current;
			current.next=prev;
			return null;
		}
		Node next=current.next;
		current.next=prev;
		recursiveReverse(next,current);
		return head;
	}
	
	public void printList()
	{
		Node pnode=head;
		while(pnode !=null)
		{
			System.out.print(pnode.data +" ");
			pnode=pnode.next;
		}
	}

}
