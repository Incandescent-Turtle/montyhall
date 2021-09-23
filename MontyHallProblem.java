import java.util.Random;

public class MontyHallProblem
{
	public static void main(String[] args)
	{		
		Random rand = new Random();

		int stayingWins = 0;
		int switchingWins = 0;
		
		int timesRan = 100_000_000;
		for(int i = 0; i < timesRan; i++)
		{
			if(i%(timesRan/100) == 0) System.out.println(Math.round(100 * (i/(float)timesRan)) + 1 + "%"); // progress
			int[] doors = new int[3]; //the three doors
			doors[rand.nextInt(3)] = 1; //placing prize
			int choice = rand.nextInt(3); //picking a door
			int revealed; //door to be revealed
			do { //reveals a door that isnt your choice and isnt the car
				revealed = rand.nextInt(3);
			} while(revealed == choice || doors[revealed] == 1);
 
			stayingWins += doors[choice]; //if the initial choice won, increase by 1 (winning door index is 1, others are 0)
			switchingWins += doors[3 - choice - revealed]; // the unrevealed unchosen door value, 1 i a winner
		}
		System.out.println("Literally ran one hundred million times");
		System.out.printf("Switching: %.2f%%%n", (switchingWins*100f/timesRan));
		System.out.printf("Staying: %.2f%%", (stayingWins*100f/timesRan));
	}
}