package challengeTwo;

import java.util.Random;

import sorts.Sorts;

public class ChallengeTwo {
	public static void main(String[] args)
	{
		//Add removing two lowest times
		//Add contains in burst
		long test = 0;
		for (int k = 0; k < 1000; k++)
		{
			String[] challenge2Test = new String[10000];
			for(int i = 0; i < challenge2Test.length; i++)
			{
				String random2 = new String();
				final String alphabet2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
				final int N1 = alphabet2.length();
				Random r1 = new Random();
				for (int j = 0; j < 5; j++)
				{
					random2 = random2 + alphabet2.charAt(r1.nextInt(N1));
				}
				challenge2Test[i] = random2;
			}
			long startTime = System.nanoTime(); //record the startTime
			
			System.out.println("ChallengeTwo Sort Runtime Test:");
			int index = challengeTwo(challenge2Test); 
			long endTime = System.nanoTime(); //record stopTime
			long totalTime = endTime - startTime; //calculate totalTime
			System.out.println(totalTime/1000000.000000 + " milliseconds");
			System.out.println(index + "\n");
			test += totalTime/1000000.000000;
		}
		System.out.println(test/1000.00000000);
	}
	
	public static int challengeTwo(String[] dataSet)
	{
		String random = new String();
		final String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		final int N = alphabet.length();
		Random r = new Random();
		random = random + alphabet.charAt(r.nextInt(N));
		
		
		//Sorts.quickSort(dataSet,0,dataSet.length); //1.59
		Sorts.quick3Way(dataSet); //1.56
		//Burst.sort(dataSet); //1.138

		return -1;
	}
}
