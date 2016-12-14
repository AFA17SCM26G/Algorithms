
public class SelectionSort {
	void selectionSort(int array [])
	{
		for(int i=0;i<array.length-1;i++)
		{
			int min_index=i;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j]<array[min_index])
				{
					min_index=j;
				}
			}
			int temp=array[min_index];
			array[min_index]=array[i];
			array[i]=temp;
		}
		for (int k=0;k<array.length;k++)
		{
			System.out.print(array[k]+" ");
		}
	}

}
