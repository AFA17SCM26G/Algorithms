
public class ArrayMultiplication {
	void arrayMultiplication(int [] array)
	{
		int product=1;
		for(int i=0;i<array.length;i++)
		{

			product=product*array[i];
		}
		for(int j=0;j<array.length;j++)
		{
			array[j]=product/array[j];
		}
		for(int k=0;k<array.length;k++)
		{
			System.out.print(array[k]+" ");
		}
	}

}
