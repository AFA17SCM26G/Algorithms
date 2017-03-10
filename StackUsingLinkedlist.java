
public class StackUsingLinkedlist {
	Node head;
	public boolean isEmpty(Node node)
	{
		if(head == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void push(Node node,int data)
	{
			Node newData=new Node(data);
			newData.next=node.next;
			head=newData;
	}
	public void pop(Node node)
	{
		if(isEmpty(node)==true)
		{
			return;
		}
		else
		{
			head=head.next;
		}
	}
	public void peek()
	{
		System.out.print(head.data);
	}
	public void print()
	{
		Node pnode= head;
		while(pnode !=null)
		{
			System.out.print(pnode.data +" ");
			pnode=pnode.next;
		}
	}


}
