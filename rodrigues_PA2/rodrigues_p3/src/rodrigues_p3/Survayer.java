package rodrigues_p3;
import java.util.Scanner;

public class Survayer 
{
	public static void main(String args[])
	{	
		double[] pointTotal= new double[5];
		double[] averages = new double[5];
		int[][] responses = new int[5][10]; 
		String[] topics = {"Should eggplants be frozen", 
							"Using marinara as ice cream toping", 
							"Should water buffalos have the right to vote", 
							"How to organize an interracial mixer",
							"How to water a juice"};
		String[] shortTopics = {"Eggplant  ","Marinara  ","Waterbuff ","Inter.Mix ","Water Juic"};
		int i;
		int j = 0;
		int count = 0;
		int menu;
		int rate;
		double total = 0;
		int highest = 0;
		int lowest = 0;
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("for the following program, you will be rating 5 topics"
				+ " out of importance from 1 - 10 (1 being the least import).");
		System.out.println("Select from the following menu options.");
		System.out.print("-> 1: Rate\n-> 2: Exit");
		menu = scan.nextInt();
		
		
		
		if (menu == 1)
		{
			while (menu == 1)
			{
				for (i = 0; i < 5; i++) 
				{
					System.out.printf("\n\n%s\n",topics[i]);
					System.out.print("Insert Rate: ");
					rate = scan.nextInt();
					
					if (rate < 1 || rate > 10)
					{
						System.out.println("Wrong Format, Goodbye!");
						System.exit(0);
					}
					
					responses[i][rate-1]++;
					
				}
				
				System.out.println("Please select an option:");
				System.out.println("-> 1: Next user to continue rating");
				System.out.println("-> 2: view results");
				System.out.println("-> 3: Exit without view");
				
				menu = scan.nextInt();
			}
			
			if (menu == 2)
			{
				System.out.printf("      rate   |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |  9  |  10  | average\n");
				System.out.printf("topics       |     |     |     |     |     |     |     |     |     |      |\n");
				
				for (i = 0; i < 5; i++)
				{
					for (j = 0; j < 10; j++)
					{
						count = count + responses[i][j];
						total = total + (responses[i][j] * (j+1));
					}
					averages[i] = total / count;
					pointTotal[i] = total;
				}
				
				for (i = 0; i < 5; i++) 
				{
					
						System.out.printf("%s   |  %d  |  %d  |  %d  |  %d  |  %d  |  %d  |  %d  |  %d  |  %d  |  %d   |  %.2f  \n",shortTopics[i],
								responses[i][0],responses[i][1], responses[i][2],responses[i][3],responses[i][4],responses[i][5],responses[i][6],
								responses[i][7], responses[i][8], responses[i][9], averages[i]);
				}
				
				for (i = 0 ; i < 5 ; i++)
				{
					highest = 0;
					for (j = 0 ; j < 5; j++)
					{
						if (pointTotal[i] < pointTotal[j])
							highest = j;
						if (pointTotal[i] > pointTotal[j])
							lowest = j;
					}
				}
				
				System.out.printf("The issue with highest point total is : %s\n with total: %.2f\n", topics[highest], pointTotal[highest]);
				System.out.printf("The issue with highest point total is : %s\n with total: %.2f\n\n", topics[lowest], pointTotal[lowest]);
				
				
				
			}
			else if (menu == 3)
			{
				System.out.println("See you soon!");
				scan.close();
				System.exit(0);
			}
			else
			{
				System.out.println("Wrong Format, Goodbye");
				scan.close();
				System.exit(0);
			}
		}
		
		if (menu == 2)
		{
			System.out.println("See you later!");
		}
		
		else
		{
			System.out.println("Wrong input");
		}
		scan.close();
							
	}
	

}
