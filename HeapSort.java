public class HeapSort {
	void heapSort(int [] array)
	{
		int n=array.length;
		for(int i=n/2-1;i>=0;i--)
		{
			heapify(array,n,i);
		}
		for(int i=n-1;i>=0;i--)
		{
			int temp=array[i];
			array[i]=array[0];
			array[0]=temp;
			heapify(array,i,0);
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	void heapify(int [] array,int n,int i)
	{
		int parent=i;
		int leftChaild=2*i+1;
		int rightChaild=2*i+2;
		if(leftChaild<n && array[leftChaild]>array[parent])
		{
			parent=leftChaild;
		}
		if(rightChaild<n && array[rightChaild]>array[parent] )
		{
			parent=rightChaild;
		}
		if(parent !=i)
		{
			int temp=array[i];
			array[i]=array[parent];
			array[parent]=temp;
			heapify(array,n,parent);
		}
	}


}
