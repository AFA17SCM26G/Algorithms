
public class BubbleSort {
	void bubbleSort(int [] array)
	{
		int count=0;
		for(int i=0;i<array.length-1;i++)
		{
			for (int j=0;j<array.length-1-i;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
					count++;
				}
				if(count==0)
				{
					break;
				}
			}
			
		}		
		for(int k=0;k<=array.length-1;k++)
		{
			System.out.print(array[k]+" ");
		}
	}

}
