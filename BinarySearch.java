/*
 * Author: Anvesh Gangasani
 * Date:Dec-7-2016
 * Complexity: Time O(logn) and Space O(n)
 * Implementing the Binary Search functionality using both Recursive and Iterative
 */

public class BinarySearch {
	int binarySearchRecursive(int array[],int x,int l,int r)
	{
		if(r>=l)
		{
			int mid=(l+r)/2;
			if(array[mid]==x)
			{
				return mid;
			}
			else if(array[mid] < x)
			{
				return binarySearchRecursive(array, x,  mid+1, r);
			}
			else 
			{
				return binarySearchRecursive( array, x, l, mid-1);
			}
			
		}
		return -1;
		
			
	}
	int binarySearchIterative(int array[],int x,int l,int r)
	{
		while (r>=l )
		{
			int mid=(l+r)/2;
			if(array[mid]==x)
			{
				return mid;
			}
			else if(array[mid] < x)
			{
				l=mid+1;
				
			}
			else 
			{
				r=mid-1;
			}
		}
		return -1;
	}
	//Simple binary search to reduce comparisons
	int binarySearch(int array[],int x,int l,int r)
	{
		
		while(r-l>1)
		{
			int mid=l+(r-l)/2;
			if (array[mid]<=x)
			{
				l=mid;
			}
			if (array[mid]>x)
			{
				r=mid;
			}
		}
		if (array[l]== x)
		{
			return l;
		}
		return -1;
	}
	//Given an array of N distinct integers, find floor value of input ‘key’
	int binarySearchFloor(int array[],int x,int l,int r)
	{
		if(array[l]> x)
		{
			return -1;
		}
		while(r-l>1)
		{
			int mid=l+(r-l)/2;
			if (array[mid]<=x)
			{
				l=mid;
			}
			else
			{
				r=mid;
			}
	    }
		return array[l];
	}
	
	// largest value <= key
	// Invariant: A[l] <= key and A[r] > key
	// Boundary: |r - l| = 1
	// Input: A[l .... r-1]
	// Precondition: A[l] <= key <= A[r]
	int Floor(int A[], int l, int r, int key)
	{
		int m;

		while( r - l > 1 )
		{
			m = l + (r - l)/2;

			if( A[m] <= key )
				l = m;
			else
				r = m;
		}

		return A[l];
	}

	// Initial call
	int Floor(int A[], int size, int key)
	{
		// Add error checking if key < A[0]
		if( key < A[0] )
			return -1;

		// Observe boundaries
		return Floor(A, 0, size, key);
	}
	//Given a sorted array with possible duplicate elements. Find number of occurrences of input ‘key’ in log N time.
	int left_count(int array[],int key,int l,int r)
	{
		int mid;
		while(r-l >1)
		{
			mid=l+(r-l)/2;
			if (array[mid]>=key)
			{
				r=mid;
			}
			else
				l=mid;
		}
	
		if(array[r]==key)
		{
			//int i=l;
			
			/*while (array[i]==key)
			{
				count++;
				i--;
			}
			return count;*/
			return r;
		}
		return -1;
	}
	int right_count(int array[],int key,int l,int r)
	{
		int mid;
		while(r-l >1)
		{
			mid=l+(r-l)/2;
			if (array[mid]<=key)
			{
				l=mid;
			}
			else
				r=mid;
		}
	
		if(array[l]==key)
		{
			//int i=l;
			
			/*while (array[i]==key)
			{
				count++;
				i--;
			}
			return count;*/
			return l;
		}
		return -1;
	}
	int duplicateCounts(int array[],int key,int size)
	{
		int rightindex=right_count(array,key,0,size);
		int leftindex=left_count(array,key,-1,size-1);
		if(rightindex ==-1 || leftindex==-1){
			return 0;
		}
		return rightindex-leftindex+1;
	}
	//Given a sorted array of distinct elements, and the array is rotated at an unknown position. Find minimum element in the array.
	int rotatedArray(int array[])
	{
		
		int l=0,r=array.length-1,mid;
		if(array[l]<array[r])
		{
			return array[l];
		}
		while(r-l>1)
		{
			mid=l+(r-l)/2;
			if(array[mid]<=array[r])
			{
				r=mid;
			}
			else
				l=mid;
			
		}
		return array[r];
		
	}
	//Implement ceil function replica of floor function
	int binarySearchCeil(int array[],int x,int l,int r)
	{
		if(array[r]< x)
		{
			return -1;
		}
		while(r-l>1)
		{
			int mid=l+(r-l)/2;
			if (array[mid]<=x)
			{
				l=mid;
			}
			else
			{
				r=mid;
			}
	    }
		return array[r];
	}
	//Given an array of integers which is initially increasing and then decreasing, find the maximum value in the array.
	int maxRotatedArray(int array[])
	{
		
		int l=0,r=array.length-1,mid;
		while(r-l>1)
		{
			mid=l+(r-l)/2;
			if(array[mid]>=array[mid-1] && array[mid]<=array[mid+1])
			{
				l=mid;
			}
			else if (array[mid]<=array[mid-1] && array[mid]>=array[mid+1])
				r=mid;
			else 
			{
				l=mid;
				r=mid+1;
			}
			
		}
		if(array[l]>array[r])
		{
			return array[l];
		}
		else
		{
			return array[r];
		}
	
	}
	//There are 2 sorted arrays A and B of size n each. Write an algorithm to find the median of the array obtained after merging the above 2 arrays(i.e. array of length 2n). The complexity should be O(log(n))
	int median(int [] array,int a,int b)
	{
		if(((b-a)+1)%2==0)
		{
			return ((a+(b-a)/2)+((a+(b-a)/2))+1)/2;
		}
		else
		{
			return a+(b-a)/2;
		}
	}
	int getMedian(int array1[],int a,int b,int array2[],int c,int d)
	{
		if ((b-a)+1 ==2 && (d-c)+1 ==2)
		{
			//System.out.println(array1[a] +" "+array1[b]+" "+array2[c]+" "+array2[d]);
			return (Math.max(array1[a],array2[c])+(Math.min(array1[b],array2[d])))/2;
		}
		int m1=median(array1,a,b);
		int m2=median(array2,c,d);
		//System.out.println(m1+" "+m2+" "+a+" "+b+" "+c+" "+d);
		if(array1[m1]>array2[m2])
		{
			return getMedian(array1,a,m1,array2,m2,d);
		}
		else
		{
			return getMedian(array1,m1,b,array2,c,m2);
		}
		
	}

}
