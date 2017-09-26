/* 
	Derek Yu
	9/26/17
	Guessing Game
*/
import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.Math;
public class GuessingGame 
{
	public static void main (String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String s = input.next();
		System.out.println("Nice to meet you " + s);
		System.out.println("How old are you? " + s);
		int x = input.nextInt();
		if (x > 40)
		{
			System.out.println("You are old " + s);
		}
		else 
		{
			System.out.println("You are young " + s);
		}
		System.out.println("You are " + x + " years old " + s); 
		int answer = (int)((Math.random()) * 10 + 1);
		System.out.println("Guess a number between 1 - 10 ");
 		int guess = input.nextInt(); 
 		if(guess != answer)
 		{
 			System.out.println("Guess again ");
 		}
 		while (guess != answer)
		{
 			
 			Scanner guess1 = new Scanner(System.in);
 			try
 			{
 				int z = guess1.nextInt();
 				if(answer != z)
 				{
 					System.out.println("Guess again ");
 				}
 				else
 				{
 					System.out.println("You are correct! ");
 				}
 			}
 			catch (InputMismatchException e)
 			{
 				System.out.println("That was error type " + e);
 			}
		}
	}
}
