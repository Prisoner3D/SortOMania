package challengeFour;

import sorts.Sorts;

public class ChallengeFour {
	public static void main(String[] args)
	{
		//Add removing two lowest times
		//Add median
		//Copied from challengeOne and alex
		long time = 0;
		for (int i = 0; i < 10; i++)
		{
			int[][] challengeFour = new int[10000][10000]; // SHOULD BE 1000 need to modify ct to bk
			for(int j = 0; j < challengeFour.length; j++)
			{
				for(int k = 0; k < challengeFour[i].length; k++)
				{
					challengeFour[j][k] = (int) (Math.random()*10001);
				}
			}
			
			long startTime = System.nanoTime();
					
			//Sorts.Bsort(challengeOne, 10000);
			//challengeFour = Sorts.countingSort(challengeFour, 10000); 
			
			long endTime = System.nanoTime(); //record stopTime
			long totalTime = endTime - startTime; //calculate totalTime
			System.out.println("Time Taken in milliseconds: " + totalTime / 1000000.0000000);
			
			time += totalTime;
		}
		System.out.println(time / 10);
	}
}
