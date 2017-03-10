
public class Palindrome {
	void isPalindrome(String str)
	{
		if(str.isEmpty())
		{
			System.out.println("Given String is Empty");
		}
		int i=0,j=str.length()-1;
		while(i<j)
		{
			if(Character.isLetter(str.charAt(i)) && Character.isLetter(str.charAt(j)))
			{
				if(Character.toLowerCase(str.charAt(i))==Character.toLowerCase(str.charAt(j)))
				{
					i++;
					j--;
				}
				else
				{
					System.out.println("Given String is not a Palindrome");
					return;
				}
			}
			else if(!Character.isLetter(str.charAt(i)) && Character.isLetter(str.charAt(j)))
			{
				i++;
			}
			else
			{
				j--;
			}
					
		}
		System.out.println("Given String is a palindrome");
	}

}
