import java.util.Stack;
public class ReverseStackUsingRecursion {
	
	public void reverseStackUsingRecursion(Stack<Integer> st)
	{
		if(!(st.empty()))
		{
			int temp=st.pop();
			reverseStackUsingRecursion(st);
			insertAtBottom(st,temp);
		}
	}

	public void insertAtBottom(Stack<Integer> st,int temp) {
		if(st.empty())
		{
			st.push(temp);
		}
		else
		{
			int temp1=st.pop();
			insertAtBottom(st,temp);
			st.push(temp1);
		}
		
		
	}

}
