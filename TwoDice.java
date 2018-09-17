//Imports java scanner
import java.util.Scanner;
//establishing class name setting as public 
public class TwoDice2
{	
	//main shell of the program
	public static void main(String[] args)
	{	
		//variable that holds the string YES
		String question = "YES";
		//setting up scanner as keyboard 
		Scanner keyboard = new Scanner(System.in);
		//while statement that cheks the equality, ignoring case sensetivity, of the user input that is held by the question variable 
		while(question.equalsIgnoreCase("YES"))
		{	
			//setting up 2 new die classes imported from the Die.java folder
			Die Die1 = new Die();
			Die Die2 = new Die();
			//grabbing the random number the die class returns and setting it to 2 variables
			int value1 = Die1.getValue();
			int value2 = Die2.getValue();
			//prints an empty line
			System.out.println("");
			//echos to the user both random values
			System.out.println("First die roll is " + value1);
			System.out.println("Second die roll is " + value2);
		
		//if statement that checks if value 1 is greather than value2
		if(value1 > value2)
			//prints the result of value1 being higher than value 2
			System.out.println("First die is the winner!");
		//else statement to the first if
		else
			//if statement that checks if value 2 is greather than value 1
			if(value2 > value1)
				//prints the result of value 2 being higher than value 1
				System.out.println("Second die is the winner!");
			//else to the second if 
			else
				//the only other possibility is a tie and this else statement prints that to the user
				System.out.println("We have a tie!");
			//output to the user if they would like to continue playing
			System.out.print("Would you like to play again? YES to continue, NO to stop >>");
			//stores their output to the question variable which will be testing in the while loop
			question = keyboard.nextLine();
		}
	}
}