import java.util.ArrayDeque;
import java.util.Queue;
public class StackUsingSingleQueue {
	Queue<Integer> q=new ArrayDeque<>();
	public void push(int data)
	{
		q.add(data);
	}
	public void pop()
	{
		if(q.isEmpty())
		{
			System.out.println("There is no element to pop");
		}
		else
		{
			for(int i=0;i<q.size()-1;i++)
			{
				q.add(q.remove());
			}
			q.remove();
		}
	}
	public void print()
	{
		System.out.println(q.toString());
	}

}
