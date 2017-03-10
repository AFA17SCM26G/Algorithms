
public class Stack {
	int top;
	int [] array;
	int capacity;
	public Stack(int capacity)
	{
		this.capacity=capacity;
		array=new int [capacity];
		top=-1;
	}
	public boolean isFull()
	{
		if (top==capacity-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isEmpty()
	{
		if(top==-1){
			return true;
		}
		else
		{
			return false;
		}
	}
	public void push(int data)
	{
		if(isFull()==true)
		{
			return;
		}
		else
		{
			array[top+1]=data;
			top=top+1;
		}
		
	}
	public void pop()
	{
		if(isEmpty()==true)
		{
			return;
		}
		else
		{
			top=top-1;
		}
	}
	public void peek()
	{
		System.out.print(array[top]);
	}
	public void print()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.print(array[i]+ " ");
		}
	}

}
