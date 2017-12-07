package sorts;

public class Sorts {
	public static int[] countingSort(int[] list1, int rangeH)	
	{
		int[] count = new int[rangeH + 1];
		for (int i = 0; i < list1.length; i++)
		{
			count[list1[i]]++;
		}
		for (int i = 1; i < count.length; i++)
		{
			count[i] = count[i] + count[i-1];
		}
		int[] sorted = new int[rangeH + 1];
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
	
	public static void Bsort(int[] a, int maxVal) { //Not actually b
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
	
	public static void quick3Way(String[] a) {
		int lo = 0;				// the initial index
		int hi = a.length - 1;	// the last index
		int d = 0;
		
		quick3Way(a, lo, hi, d);
	}

	private static void quick3Way(String[] a, int lo, int hi, int d) {
		
		if ( hi <= lo ) return;
		
		int i = lo + 1;
		int lt = lo; int gt = hi;
		// partitioning character
		int v = charAt(a[lo], d);
		
		while ( i <= gt ) {
			int t = charAt(a[i], d);
			if ( t < v ) exch( a, lt++, i++ );
			else if ( t > v ) exch( a, i, gt-- );
			else ++i;
		}
		
		quick3Way(a, lo, lt-1, d);
		if ( v >= 0 ) quick3Way(a, lt, gt, d+1);
		quick3Way(a, gt+1, hi, d);
	}

	private static void exch(String[] a, int i, int j) {
		String t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	private static int charAt(String str, int d) {
		if ( d >= str.length()  ) return -1;
		return str.charAt(d);
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
	
	public static void quickSort(String[] list1, int front, int back)
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
	
	public static int partition(String[] list, int front, int back)
	{
		String pivot = list[front];
		int i = front;
		for (int j = front + 1; j < back; j++)
		{
			if (list[j].compareTo(pivot) <= 0)
			{
				i++;
				swap(list, i, j);
			}
		}
		swap(list, i, front);
		return i;
	}
	
	private static void swap(String[] a, int i, int j)
	{
	    String temp = a[i];
	    a[i] = a[j];
	    a[j] = temp;
	}
	
	public static void swap(int[] a, int i, int j)
	{
	    int temp = a[i];
	    a[i] = a[j];
	    a[j] = temp;
	}
}
