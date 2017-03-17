import java.util.Stack;
public class StockSpanProblem {
	public void calculateSpan(int[] price,int n,int[] s)
	{
		Stack<Integer> st=new Stack<>();
		st.push(0);
		s[0]=1;
		for(int i=1;i<n;i++)
		{
			while(!st.empty() && price[st.peek()]<=price[i])
			{
				st.pop();
				
			}
			if(st.empty())
			{
				s[i]=i+1;
			}
			else
			{
				s[i]=i-st.peek();
			}
			st.push(i);
			
		}
		for(int j=0;j<s.length;j++)
		{
			System.out.print(s[j]+" ");
		}
		
	}

}
