import java.util.Stack;
public class CheckExpression {
	public boolean checkBalExpression(String str)
	{
		Stack<Character> stack1= new Stack<Character>();
		System.out.println(stack1.empty());
		//System.out.println(stack1);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) =='{' || str.charAt(i)=='(' || str.charAt(i)=='[')
			{
				stack1.push(str.charAt(i));
			}
			else if(str.charAt(i)== '}' || str.charAt(i)==')' || str.charAt(i)==']')
			{
				if(stack1.empty())
				{
					return false;
				}
				if((stack1.peek()=='(' && str.charAt(i) !=')') ||(stack1.peek()=='{' && str.charAt(i) !='}') ||(stack1.peek()=='[' && str.charAt(i) !=']'))
				{
					
					return false;
				}
				else
				{
					stack1.pop();
				}	
			}
				
		}
			//System.out.println(st.toString());
		return stack1.empty();
	}

}
