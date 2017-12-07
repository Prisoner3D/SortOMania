package challengeOne;

import sorts.Sorts;

public class ChallengeOne {

	public static void main(String[] args)
	{
		//Add removing two lowest times
		//Add median
		long time = 0;
		for (int i = 0; i < 1; i++)
		{
			int[] challengeOne = new int[100];
			for (int j = 0; j < challengeOne.length; j++)
			{
				challengeOne[j] = (int) (Math.random() * 100);
			}
			
			
			long startTime = System.nanoTime();
					
			//Sorts.Bsort(challengeOne, 10000);
			challengeOne(challengeOne);
			
			long endTime = System.nanoTime(); //record stopTime
			long totalTime = endTime - startTime; //calculate totalTime
			System.out.println("Time Taken in milliseconds: " + totalTime / 1000000.0000000);
			System.out.println(challengeOne.length);
			for (int num : challengeOne)
			{
				System.out.println(num);
			}
			
			time += totalTime;
		}
		System.out.println(time / 1);
	}
	
	public static int challengeOne(int[] dataSet)
	{
		int[] copy = dataSet;
		int[] count = new int[dataSet.length];
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
			sorted[count[copy[i]]] = copy[i];
			count[copy[i]]--;
		}

		for (int i = 0; i < dataSet.length; i++)
		{
			dataSet[i] = sorted[i];
		}
		return median(dataSet); //Shorten maybe

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
