
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearSearch search=new LinearSearch();
		BinarySearch BS=new BinarySearch();
		int[] find = {1,7,9,16,18,25,27,34,36,70,72,81};
		int[] A = {-1, 2, 3, 5, 6, 8, 9, 10};
		/*System.out.println(search.linearSearch(find, 100));
		System.out.println(BS.binarySearchRecursive(find, 100, 0, find.length-1));
		System.out.println(BS.binarySearchIterative(find, 100, 0, find.length-1));
		System.out.println(BS.binarySearch(find, 100, 0, find.length));
		System.out.println(BS.Floor(A,A.length,40));*/
		//System.out.println(BS.binarySearchFloor(A,100,0,A.length));
		
		//int[] Dup={1,2,3,3,3,3,3,3,3,3,5,5,6,6,6,6,6,7,7,7};
		//System.out.println(BS.duplicateCounts(Dup,7,Dup.length));
		//int[] rotate={2,1};
		//System.out.println(BS.rotatedArray(rotate));
		//System.out.println(BS.binarySearchCeil(A,8,0,A.length-1));
		
		/*int arr1[] =  {5, 6, 1, 2, 3, 4};
        int n1 = arr1.length;
        System.out.println("The minimum element is "+ BS.rotatedArray(arr1));
 
        int arr2[] =  {1, 2, 3, 4};
        int n2 = arr2.length;
        System.out.println("The minimum element is "+ BS.rotatedArray(arr2));
 
        int arr3[] =  {1};
        int n3 = arr3.length;
        System.out.println("The minimum element is "+ BS.rotatedArray(arr3));
 
        int arr4[] =  {1, 2};
        int n4 = arr4.length;
        System.out.println("The minimum element is "+ BS.rotatedArray(arr4));
 
        int arr5[] =  {2, 1};
        int n5 = arr5.length;
        System.out.println("The minimum element is "+ BS.rotatedArray(arr5));
 
        int arr6[] =  {5, 6, 7, 1, 2, 3, 4};
        int n6 = arr6.length;
        System.out.println("The minimum element is "+ BS.rotatedArray(arr6));
 
        int arr7[] =  {1, 2, 3, 4, 5, 6, 7};
        int n7 = arr7.length;
        System.out.println("The minimum element is "+ BS.rotatedArray(arr7));
 
        int arr8[] =  {2, 3, 4, 5, 6, 7, 8, 1};
        int n8 = arr8.length;
        System.out.println("The minimum element is "+ BS.rotatedArray(arr8));
 
        int arr9[] =  {3, 4, 5, 1, 2};
        int n9 = arr9.length;
        System.out.println("The minimum element is "+ BS.rotatedArray(arr9));
        int arr10[] ={2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 1, 2};
        System.out.println("The minimum element is "+ BS.rotatedArray(arr10));
        int arr11[] ={2, 2, 2, 0, 2, 2, 2, 2, 2, 2, 2, 2};
        System.out.println("The minimum element is "+ BS.rotatedArray(arr11));
        
		int arr[] = {8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1};
		System.out.println("The maximum element is "+ BS.maxRotatedArray(arr));
		int arr1[] = {1, 3, 50, 10, 9, 7, 6};
		System.out.println("The maximum element is "+ BS.maxRotatedArray(arr1));
		int arr2[] = {10, 20, 30, 40, 50};
		System.out.println("The maximum element is "+ BS.maxRotatedArray(arr2));
		int arr3[] = {120, 100, 80, 20, 0};
		System.out.println("The maximum element is "+ BS.maxRotatedArray(arr3));
		*/
		//int ar1[] = {1, 12, 15, 26, 38};
		//int ar2[] = {2, 13, 17, 30, 45};
		//int ar1[] = {1, 2, 3, 6};
	    //int ar2[] = {4, 6, 8, 10};
		//System.out.println("The Median element is "+ BS.getMedian(ar1,0,ar1.length-1,ar2,0,ar2.length-1));
		//JumpSearch JS= new JumpSearch();
		//int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21,34, 55, 89, 144, 233, 377, 610};
		//System.out.println("The element has found at "+ JS.jumpSearch(arr,610));
		//InterpolationSearch IS= new InterpolationSearch();
		//int arr[] =  {10, 12, 13, 16, 18, 19, 20, 21, 22, 23,24, 33, 35, 42, 47};
		//System.out.println("The element has found at "+ IS.interpolationSearch(arr,18));
		//SelectionSort SS=new SelectionSort();
		//int arr[] = {64,25,12,22,11,115,32,77};
		//System.out.println("Sorted elements using selection sort");
		//SS.selectionSort(arr);
		MaximumSubArray MSA=new MaximumSubArray();
		int array[]={-2,-3,4,-1,-2,1,5,0,-3};
		int array1[]={6,-1,-4,7,5,4,-4,-5,1};
		//int array2[]={-6,-1,-4,-7,-5,-4,-4,-5,-1};
		System.out.println("Maximum Sum is : "+MSA.maxSubArray(array));
		System.out.println("Maximum Sum is : "+MSA.maxSubArray(array1));
		//System.out.println("Maximum Sum is : "+MSA.maxSubArray(array2));
		
		/*BubbleSort BSR=new BubbleSort();
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
		System.out.print("Sorted array using Bubble Sort is : ");
		BSR.bubbleSort(arr);
		*/
		
		

	}

}
