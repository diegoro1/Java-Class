package rodrigues_p2;
import java.util.Scanner;
import java.lang.Math;


public class bmiCalc 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		double height;
		double weight;
		double result = 0;
		
		System.out.println("Hello!");
		System.out.println("Please select the units of measurement");
		System.out.println("-> 1 for pounds and inches");
		System.out.println("-> 2 for kilograms and meters");
		int select = scan.nextInt();
		
		
		if (select == 1)
		{
			System.out.println("Please insert your height in inches");
			height = scan.nextDouble();
			
			System.out.println("Please insert your weight in pounds");
			weight = scan.nextDouble();
			
			result = (703 * weight) / Math.pow(height, 2);
			
			System.out.printf("Your BMI is %.2f\n", result);
		}
		else if (select == 2)
		{
			System.out.println("Please insert your height in meters");
			height = scan.nextDouble();
			
			System.out.println("Please insert your weight in kilograms");
			weight = scan.nextDouble();
			
			result = weight / Math.pow(height, 2);
			
			System.out.printf("Your BMI is %.2f\n", result);
		}
		else
		{
			System.out.println("Please try again with a correct value");
			scan.close();
			System.exit(0);
		}
		
		
		scan.close();
		
		
		if (result < 18.5)
		{
			System.out.println("This indicates that you are currently underweight");
		}
		else if (result == 18.5 || (result > 18.5 && result < 24.9) || result == 24.9)
		{
			System.out.println("This indicates that you have normal weight!");
		}
		else if (result == 25 || (result > 25 && result < 29.9) || result == 29.9)
		{
			System.out.println("This indicates that you are currently overweight");
		}	
		else if (result > 30)
		{
			System.out.println("This indicates that you are currently obese");
		}
		else 
		{
			System.out.println("Error in category assigment");
			System.exit(0);
		}
		
		
	}

}
