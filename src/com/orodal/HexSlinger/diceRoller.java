package com.orodal.HexSlinger;
import java.util.Random;


public class diceRoller
{
	private static Random generator = new Random();

	public static int dieRoll(int hexLevel, int dieType, int bonus)
	{
		int highestRoll = 0;
		for(int i = 0;i<hexLevel;i++)
		{
			System.out.println("Initiating roll.");
			int currentRoll = 0;
			int tempRandom = 0;
			
			do
			{
				tempRandom = (generator.nextInt(dieType))+1;
				currentRoll = currentRoll + tempRandom;
				System.out.print("Rolled a: ");
				System.out.println(currentRoll);
				if(tempRandom == dieType)
				{
					System.out.println("rerolling");
				}
			}while(tempRandom == dieType);
			
			
			if(currentRoll>highestRoll)
			{
				highestRoll = currentRoll;
			}
		}
		return highestRoll + bonus;
	}

}
