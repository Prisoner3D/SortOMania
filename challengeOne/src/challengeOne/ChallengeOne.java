package challengeOne;

import sorts.Sorts;

public class ChallengeOne {

	public static void main(String[] args)
	{
		//Add removing two lowest times
		//Add median
		long time = 0;
		for (int i = 0; i < 10; i++)
		{
			int[] challengeOne = new int[10000];
			for (int j = 0; j < challengeOne.length; j++)
			{
				challengeOne[j] = (int) (Math.random() * 10001);
			}
			
			
			long startTime = System.nanoTime();
					
			//Sorts.Bsort(challengeOne, 10000);
			challengeOne = Sorts.countingSort(challengeOne, 10000); 
			
			long endTime = System.nanoTime(); //record stopTime
			long totalTime = endTime - startTime; //calculate totalTime
			System.out.println("Time Taken in milliseconds: " + totalTime / 1000000.0000000);

			for (int num : challengeOne)
			{
				//System.out.println(num);
			}
			
			time += totalTime;
		}
		System.out.println(time / 10);
	}
}
