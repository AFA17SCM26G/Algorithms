import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class StackUsingQueue {
	Queue<Integer> q1= new ArrayDeque<>();
	Queue<Integer> q2= new ArrayDeque<>();
	public void push(int data)
	{
		if((q1.isEmpty()&& q2.isEmpty())||(q2.isEmpty()))
		{
			q1.add(data);
		}
		else if(q1.isEmpty())
		{
			q2.add(data);
		}
	}
	public void pop()
	{
		if(!q1.isEmpty())
		{
			while(q1.size()!=1)
			{
				q2.add(q1.remove());
			}
			q1.remove();
		}
		else if(!q2.isEmpty())
		{
			while(q2.size()!=1)
			{
				q1.add(q2.remove());
			}
			q2.remove();
		}
	}

	public void print()
	{
		if(!q1.isEmpty())
		{
			System.out.println(q1);
		}
		else
		{
			System.out.println(q2);
		}
	}
	

}
