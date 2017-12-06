package sorts;

public class Sorts {
	public static int[] countingSort(int[] list1, int rangeL, int rangeH)	
	{
		int[] count = new int[rangeH - rangeL + 1];
		for (int i = 0; i < list1.length; i++)
		{
			count[list1[i] - rangeL]++;
			//System.out.println(list1[i]);
		}
		//int tempSum = 0;
		for (int i = 1; i < count.length; i++)
		{
			count[i] = count[i] + count[i-1];
			//tempSum = count[i];count[i]
			//System.out.println(list1[i]);
		}
		int[] sorted = new int[rangeH - rangeL + 1];
		for (int i = 0; i < list1.length; i++)
		{
			sorted[count[list1[i]]] = list1[i];
			count[list1[i]]--;
		}
		return sorted;
	}
	
	public static int partition(int[] list, int front, int back)
	{
		int pivot = list[front];
		int i = front;
		//System.out.println(front);
		for (int j = front + 1; j < back; j++)
		{
			if (list[j] <= pivot)
			{
				i++;
				swap(list, i, j);
			}
		}
		//System.out.println(i);
		swap(list, i, front);
		return i;
	}
	
	public static void insertionSort(int[] list1) {
		int j = 0;
		for (int i = 0; i <= list1.length; i++)
		{
			for (int k = j-1; k >= 0; k--)
			{
				if (list1[k] > list1[j])
				{
					swap(list1, k, j);
					j--;
				}
			}
			j = i;
		}
	}
	
	public static void Bsort(int[] a, int maxVal) {
	      int [] bucket=new int[maxVal+1];
	 
	      for (int i=0; i<bucket.length; i++) {
	         bucket[i]=0;
	      }
	 
	      for (int i=0; i<a.length; i++) {
	         bucket[a[i]]++;
	      }
	 
	      int outPos=0;
	      for (int i=0; i<bucket.length; i++) {
	         for (int j=0; j<bucket[i]; j++) {
	            a[outPos++]=i;
	         }
	      }
	   }
	
	public static void bucketSort(int a[], int n) {
	    int i, j, k, SIZE = 10001;
	    
	    int buckets[] = new int[SIZE];
	    
	    for(i = 0; i < SIZE; ++i)
	        buckets[i] = 0;
	    
	    for(i = 0; i < n; ++i)
	        ++buckets[a[i]];
	        
	    for(i = 0, j = 0; j < SIZE; ++j)
	        for(k = buckets[j]; k > 0; --k)
	            a[i++] = j;
	}
	
	public static void quickSort(int[] list1, int front, int back)
	{
		if (front >= back)
		{
			return;
		}
		else
		{
			int PIVOTindex = partition(list1, front, back);
			quickSort(list1, front, PIVOTindex);
			quickSort(list1, PIVOTindex + 1, back);
		}
	}
	
	private static void swap(int[] a, int i, int j)
	{
	    int temp = a[i];
	    a[i] = a[j];
	    a[j] = temp;
	}
}
