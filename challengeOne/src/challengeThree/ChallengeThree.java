package challengeThree;

import java.util.Arrays;

import sorts.Sorts;

public class ChallengeThree {
	public static void main(String[] args)
	{
		//Add removing two lowest times
		//need to add median
		long time = 0;
		for (int i = 0; i < 10; i++)
		{
			int[] challengeThree = new int[10000];
			for (int j = 0; j < challengeThree.length; j++)
			{
				challengeThree[j] = (int) (Math.random() * 10001);
			}
			challengeThree = Sorts.countingSort(challengeThree, 10000);
			for (int k = 0; k < challengeThree.length / 4; k++)
			{
				Sorts.swap(challengeThree, (int) (Math.random() * 10001), (int) (Math.random() * 10001));
			}
			
			long startTime = System.nanoTime(); //record the startTime
			
			//Sorts.Bsort(challengeThree, 10000); //?
			challengeThree = Sorts.countingSort(challengeThree, 10000);
			
			long endTime = System.nanoTime(); //record stopTime
			long totalTime = endTime - startTime; //calculate totalTime
			System.out.println("Time Taken in milliseconds: " + totalTime / 1000000.0000000);
			time += totalTime;
		}
		System.out.println(time / 10);
	}
}
