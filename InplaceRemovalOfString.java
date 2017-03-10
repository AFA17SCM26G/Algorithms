/*
 * Author: Anvesh Gangasani
 * Date:Jan-5-2017
 * Complexity: Time O(n) and Space O(1)
 * Inplace remove all occurrences of ‘AB’ and ‘C’ from the string
 */
public class InplaceRemovalOfString {
	void inplaceStringRemoval(char [] str)
	{
		if(str.length ==0)
		{
			System.out.println("");
		}
		int i=0,j=0;
		while(i<str.length)
		{
			if(str[i]=='B' && (j>0 && str[j-1]=='A'))
			{
				j--;
				i++;
			}
			else if(str[i]=='C')
			{
				i++;
			}
			else
			{
				str[j]=str[i];
				i++;
				j++;
			}
		}
		if(j==0)
		{
			System.out.println("String after removal of 'AB' and 'C' is :"+"''");
		}
		else
		{
			System.out.print("String after removal of 'AB' and 'C' is :");
			for(int k=0;k<j;k++)
			{
				System.out.print(str[k]);
			}
		}
	}

}
