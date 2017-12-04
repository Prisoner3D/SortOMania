package challengeOne;

public class alexpls {

	public static void main(String[] args)
	{
		int[] challengeOne = new int[10000];
		for (int i = 0; i < challengeOne.length; i++)
		{
			challengeOne[i] = (int) (Math.random() * 10001);
			if (challengeOne[i] >= 10000)
			{
				//System.out.println(challengeOne[i]);
			}
		}
		long startTime = System.nanoTime(); //record the startTime
		System.out.println("Quick Sort Runtime Test:");
		bucket.sort(challengeOne);(challengeOne, 0, 10000);
		long endTime = System.nanoTime(); //record stopTime
		long totalTime = endTime - startTime; //calculate totalTime
		System.out.println("Time Taken in milliseconds: " + totalTime / 1000000.0000000);
		
	}
	
	public static void countingSort(int[] list1, int rangeL, int rangeH)	
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
		list1 = sorted;
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
