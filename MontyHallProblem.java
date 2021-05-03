import java.util.Random;

public class MontyHallProblem
{
	public static void main(String[] args)
	{		
		Random rand = new Random();

		int stayingWins = 0;
		int switchingWins = 0;
		
		int timesRan = 10000000;
		int count = 0;
		for(int i = 0; i < timesRan; i++)
		{
			System.out.println(count++);
			int[] doors = {0, 0, 0};
			doors[rand.nextInt(3)] = 1;
			int choice = rand.nextInt(3);
			int revealed;
			do {
				revealed = rand.nextInt(3);
			} while(revealed == choice || doors[revealed] == 1);
 
			stayingWins += doors[choice];
			switchingWins += doors[3 - choice - revealed];
		}
		System.out.println("Literally ran 10 million times");
		System.out.println("Switching: " + (switchingWins*100/timesRan) + "%");
		System.out.println("Staying: " + (stayingWins*100/timesRan) + "%");
	}
}