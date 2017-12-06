package challengeTwo;

import java.util.Random;

public class ChallengeTwo {
	public static void main(String[] args)
	{
		String[] challenge2Test = new String[10000];
		for(int i = 0; i < challenge2Test.length; i++)
		{
			String random2 = new String();
			final String alphabet2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			final int N1 = alphabet2.length();
			Random r1 = new Random();
			random2 = random2 + alphabet2.charAt(r1.nextInt(N1));
			challenge2Test[i] = random2;
			System.out.println(random2);
		}
	}
	
	public static int challengeTwo(String[] dataSet)
	{
		String random = new String();
		final String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		final int N = alphabet.length();
		Random r = new Random();
		random = random + alphabet.charAt(r.nextInt(N));
		
		//bubbleSort(dataSet); //1000 MS
		//selectionSort(dataSet); //550 MS
		//insertionSort(dataSet); //500 MS
		quickSort(dataSet,0,dataSet.length); //17 MS
		for(int i = 0; i< dataSet.length; i++)
		{
			if(random.equals(dataSet[i]))
			{
				return i;
			}
		}
		return -1;
	}
}
