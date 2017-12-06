package challengeOne;

import sorts.Sorts;

public class ChallengeOne {

	public static void main(String[] args)
	{
		long time = 0;
		for (int i = 0; i < 100; i++)
		{
			int[] challengeOne = new int[10000];
			for (int j = 0; j < challengeOne.length; j++)
			{
				challengeOne[j] = (int) (Math.random() * 10001);
			}
			long startTime = System.nanoTime(); //record the startTime
			//System.out.println("Bucket Runtime Test:");
			//Sorts.Bsort(challengeOne, 10000); //?
			challengeOne = Sorts.countingSort(challengeOne, 0, 10000); //?
			long endTime = System.nanoTime(); //record stopTime
			long totalTime = endTime - startTime; //calculate totalTime
			System.out.println("Time Taken in milliseconds: " + totalTime / 1000000.0000000);
			time += totalTime;
			for (int num : challengeOne)
			{
				//System.out.println(num);
			}
		}
		System.out.println(time / 100);
	}
}
