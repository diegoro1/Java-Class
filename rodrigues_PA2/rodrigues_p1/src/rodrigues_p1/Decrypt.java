package rodrigues_p2;

import java.util.Scanner;

public class Decrypt 
{
	public static void main(String args[])
	{
		int i;
		int number;
		int encrypt[] = new int[4];
		Scanner scrn = new Scanner(System.in);
		
		System.out.print("Please enter the 4 digit number: ");
		number = scrn.nextInt();
		
		// converts number to a string then get ASCII of each char to then convert to int
		// then placed in array.
		encrypt= Integer.toString(number).chars().map(c -> c-'0').toArray();
		
		// decrypts array.
		System.out.print("Decrypted Number: ");
		for (i = 0; i < 4; i++)
		{
			System.out.printf("%d", (encrypt[i] + 3) % 10);
		}
		
		scrn.close();
	}
}
