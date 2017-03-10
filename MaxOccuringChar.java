
public class MaxOccuringChar {
	public void getMaxOccuringChar(String str)
	{
		char[] array = str.toCharArray();
		int [] count=new int[256];
		int len=array.length;
		for(int i=0;i<len;i++)
		{
			count[array[i]]++;
			System.out.println(count[array[i]]);
		}
		 char result =0;
		 for (int i = 0; i < len; i++) 
		  {
		        if (count[array[i]]>1) 
		        {
		            
		            result = array[i];
		        }
		    }
		 
		    System.out.println(result); 
	}

}
