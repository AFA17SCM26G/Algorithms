
public class RemoveDuplicatesInSortedArray {
	void removeDuplicates(int [] array)
	{
		int [] uniqueArray=new int[array.length];
		int i=0,j=1,k=1;
		uniqueArray[0]=array[0];
		while(j<array.length)
		{
			if(array[i]==array[j])
			{
				j++;
			}
			else
			{
				uniqueArray[k]=array[j];
				i=j;
				k++;
				j++;
			}
		}
		//System.out.print(i);
		for(int l=0;l<k;l++)
		{
			System.out.print(uniqueArray[l]+" ");
		}
		
	}
	//Using two pointers
	void alternativeMethod(int [] array)
	{
		int i=0,j=1;
		while(j<array.length)
		{
			if(array[i]==array[j])
			{
				j++;
			}
			else
			{
				array[i+1]=array[j];
				i++;
				j++;
			}
		}
		System.out.print('\n');
		for(int k=0;k<=i;k++)
		{ 
			
			System.out.print(array[k]+" ");
		}
	}

}
