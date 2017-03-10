import java.util.*;	
public class RemovedNumbers {	
		public static void removNb(long n) {
			// your code
			 List<long[]> result= new ArrayList<long[]>();
			    long totalSum=(n*(n+1))/2;
			    int divider=0;
			    for(int k=2;k<=9;k++)
			    {
			      if(totalSum%k==0)
			      {
			        divider=k;
			        break;
			      }
			    }
			    
			    for(int i=(int)(n-(n%divider));i>1;i=i-divider)
			    {
			      for(int j=i-divider;j>1;j=j-divider)
			      {
			        if((i*j)==(totalSum-i-j))
			        {
			          result.add(new long[] {j,i});
			          result.add(new long[] {i,j});
			          
			        }
			      }
			    }
			    System.out.print(result.get(0));
					//return result;
				}
	}


