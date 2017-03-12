import java.util.Stack;
public class NextGreaterElement {
	public void printNextGreaterElement(int[] array)
	{
		Stack<Integer> st=new Stack<>();
		int element=0,next=0;
		st.push(array[0]);
		for(int i=1;i<array.length;i++)
		{
			next=array[i];
			if(!(st.empty()))
			{
				element=st.pop();
				while(element<next)
				{
					System.out.println(element+" -----------> "+next);
					if(st.empty())
					{
						break;
					}
					element=st.pop();
				}
				if(element>next)
				{
					st.push(element);
				}
			}
			
			st.push(next);
			
		}
		while(!(st.empty()))
		{
			System.out.println(st.pop()+" -----------> "+-1);
		}
	}

}
