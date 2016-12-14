/*
 * Author: Anvesh Gangasani
 * Date:Dec-7-2016
 * Complexity: Time O(n) and Space O(n)
 * Implementing the Linear Search functionality
 */
public class LinearSearch {
	
	int linearSearch(int array[],int x)
	{
		for (int i=0;i<array.length;i++)
		{
			if(array[i]==x){
				return i;
			}
		}
		return -1;
	}

}
