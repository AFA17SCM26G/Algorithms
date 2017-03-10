import java.util.Stack;

public class BalanceParenthesis {
	public boolean balExpression(String str)
	{
		Stack<Character> stack1= new Stack<Character>();
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
			
		return stack1.empty();
	}

}



