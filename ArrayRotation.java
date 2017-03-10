
public class ArrayRotation {
	void rotatedArray(int [] array,int numofelements)
	{
		int count=0;
		numofelements= numofelements%array.length;
		for(int start=0;count<array.length;start++)
		{
			int current=start;
			int prev=array[start];
			while(start!=current)
			{
				int next=(current+numofelements)%array.length;
				int temp= array[next];
				array[next]=prev;
				prev=temp;
				current=next;
				count++;
			}
			
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
		
		
}
