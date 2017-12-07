package challengeOne;

import sorts.Sorts;

public class ChallengeOne {

	public static void main(String[] args)
	{
		//Add removing two lowest times
		//Add median
		long time = 0;
		for (int i = 0; i < 100; i++)
		{
			int[] challengeOne = new int[10000];
			for (int j = 0; j < challengeOne.length; j++)
			{
				challengeOne[j] = (int) (Math.random() * 10000);
			}
			
			long startTime = System.nanoTime();
					
			//Sorts.Bsort(challengeOne, 10000);
			System.out.println(challengeOne(challengeOne));
			
			long endTime = System.nanoTime(); //record stopTime
			long totalTime = endTime - startTime; //calculate totalTime
			System.out.println("Time Taken in milliseconds: " + totalTime / 1000000.0000000);
			//System.out.println(challengeOne.length);
			for (int num : challengeOne)
			{
				//System.out.println(num);
			}
			
			time += totalTime;
		}
		System.out.println(time / 100);
	}
	
	public static int challengeOne(int[] dataSet)
	{
		int[] copy = dataSet;
		int[] count = new int[dataSet.length]; // Should only work for challengeOne
		for (int i = 0; i < dataSet.length; i++)
		{
			count[copy[i]]++;
		}
		for (int i = 1; i < count.length; i++)
		{
			count[i] = count[i] + count[i-1];
		}
		int[] sorted = new int[dataSet.length];
		for (int i = 0; i < dataSet.length; i++)
		{
			sorted[count[copy[i]] - 1] = copy[i];
			count[copy[i]]--;
		}
		for (int i = 0; i < dataSet.length; i++)
		{
			dataSet[i] = sorted[i];
		}
		return ((dataSet[dataSet.length/2])+(dataSet[(dataSet.length/2)-1]))/2;
	}
	
	public static int median(int[] list1)
	{
		if(list1.length % 2 == 1)
		{
			return (list1[(int)(list1.length/2) + 1]);
		}
		return ((list1[list1.length/2])+(list1[(list1.length/2)-1]))/2;
	}
}
