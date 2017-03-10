import java.util.Stack;
public class InfixToPostfix {
	Stack<Integer> st_int=new Stack<Integer>();
	Stack<Character> st=new Stack<Character>();
	
	public String infix_To_Postfix_Con(String str)
	{
		
		String res="";
		for(int i=0;i<str.length();i++)
		{
			if(isOperand(str.charAt(i)))
			{
				res=res+str.charAt(i);
				
			}
			else if (str.charAt(i) =='{' || str.charAt(i)=='(' || str.charAt(i)=='[')
			{
				st.push(str.charAt(i));
			}
			else if (str.charAt(i) =='}' || str.charAt(i)==')' || str.charAt(i)==']')
			{
				
					while(!(st.empty()) && !(st.peek() =='{' || st.peek()=='(' || st.peek()=='['))
					{
						res=res+st.peek();
						st.pop();
						
					}
					if(!(st.peek()=='{' || st.peek()=='(' || st.peek()=='['))
					{
						return "Expression is un balanced";
						
					}
					else
					{
						st.pop();
					}
				
			}
			else 
			{
				while(!(st.empty()) && (precedence(str.charAt(i)) <= precedence(st.peek())))
				{
				res=res+st.peek();
				st.pop();
				}
				st.push(str.charAt(i));
				
		
			}
			
		}
		while(!(st.empty()))
		{
			res=res+st.peek();
			st.pop();
		}
		return res;
	}

	
	public boolean isOperand(char ch)
	{
		if ((ch >='a' && ch<='z') || (ch>='A' && ch<='Z'))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int precedence(char op)
	{
		if(op=='+' || op=='-')
		{
			return 1;
		}
		else if (op=='*' || op=='/')
		{
			return 2;
		}
		else if(op=='^')
		{
			return 3;
		}
		return -1;	
	}
	/*Evaluation of Postfix Expression*/

	public void evaluationOfPostfixNotation(String str)
	{
		
		for(int i=0;i<str.length();i++)
		{
			
			
			if(Character.isDigit(str.charAt(i)))
			{
				st_int.push((int) str.charAt(i)-48);
			}
			else 
			{
				int a1=st_int.pop();
				int a2=st_int.pop();
				int res=0;
				if(str.charAt(i)=='*')
				{
					res=a2 * a1;
				}
				else if (str.charAt(i)=='/')
				{
					res=a2 / a1;
				}
				else if (str.charAt(i)=='+')
				{
					res= a2+a1;
				}
				else if (str.charAt(i)=='-')
				{
					res=a2-a1;
				}
				else if (str.charAt(i)=='^')
				{
					res= a2^a1;
				}
				st_int.push(res);
				
					
			}
		}
		int result=st_int.peek();
		System.out.println(result);
		
		
	}

}
