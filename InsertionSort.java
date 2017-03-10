
public class InsertionSort {
	void insertionSort(int [] array)
	{
		for(int i=1;i<array.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(array[i]>array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
			
		}
		System.out.print("Sorted elements using Inserton Sort : ");
		for(int k=0;k<array.length;k++)
		{
			System.out.print(array[k]+" ");
		}
		
	}

}
