import java.util.Scanner;

public class Change 
{

	public static void main(String[] args)
	{

		Scanner console = new Scanner(System.in);

		System.out.println("Hello, world");

		System.out.println("Number of cents:");
		int cents = console.nextInt();

		int numWays = numberOfWaysToMakeChange(cents);

		System.out.println("There are " + numWays + " to make " + cents);

	}
	// Count the number of ways to make change for a given amount of money.
	// Hard coded to 1, 5, 10 and 25 cent coins.
	// Example: NumberOfWaysToMakeChange(6) = 2
	// Example: NumberOfWaysToMakeChange(11) = 4
	public static int numberOfWagsToMakeChange(int cents)
	{

		//Assume cents is non-negative

		if (cents == 0)
		{

			return 1;

		}
		else
		{

			
			
		}



	}

}