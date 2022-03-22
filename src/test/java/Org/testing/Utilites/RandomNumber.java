package Org.testing.Utilites;

import java.util.Random;

public class RandomNumber
{
	public static String GenerateRandomNumber()
	{
		Random r = new Random();
		Integer i =r.nextInt();
		return i.toString();
		
	}

}
