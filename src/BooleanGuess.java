import java.util.Scanner;


public class BooleanGuess 
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner (System.in);
		int computerNum;
		int userNum;
		boolean correctGuess;
		correctGuess = true;
		
		computerNum = 0 + (int) (Math.random()*10);
		System.out.println ("Please guess a number");
		userNum = input.nextInt();
		correctGuess = computerNum==userNum;
		System.out.printf("The computer number is %d ",computerNum);
		if (correctGuess) 
		{
			System.out.println (" correct guess");
		}
		else 
		{
			System.out.println ("Your number is wrong");
		}
	}
}