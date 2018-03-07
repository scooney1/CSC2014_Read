/**
 * Author:	Sam Cooney
 * Project:	Read
 * Date:	Sept. 6, 2017
 * I assert that the program I am submitting is the result of my own efforts. 
 */

import java.util.Scanner;	// Allows use of Scanner.

public class Read {

    public static void main (String[ ] args) {  // Name of method is main
    	String messageOne, messageTwo;
    	Scanner scan = new Scanner(System.in);
    	int X;
    	double Y, Z;
    	
    	System.out.println("Enter a line of text:");	// Asks user to type.
    	messageOne = scan.nextLine();					// Reads in a string of more than one word.
    	System.out.println("You entered: \"" + messageOne + "\"");
    	System.out.println("Please enter one word: ");	// Asks user to type.
    	messageTwo = scan.next();						// Reads in a string of one word.
    	System.out.println("Here is your word: \"" + messageTwo + "\"");
    	System.out.println("Enter an integer: ");		// Asks user to type.
    	X = scan.nextInt();								// Reads in a string of one int.
    	System.out.println("Here is your integer: " + X + ".");
    	System.out.println("Enter a decimal: ");		// Asks user to type.
    	Y = scan.nextDouble();							// Reads in a string of one double.
    	System.out.println("Here is your decimal: " + Y + ".");
    	Z = Y * X;										// Multiply two variables using promotion.
    	System.out.println("You multiplied " + X + " times " + Y + " and got results " + Z + ".\n\n");
    	
    	
		System.out.println("***************************************************************");		// This
		System.out.println("*                         Sam Cooney                          *");		// is
		System.out.println("*                          CSC 2014                           *");		// my
		System.out.println("*                         Project #3                          *");		// own
		System.out.println("***************************************************************\n\n");	// box.
		
		scan.close();
 }        // End of method  main
}         // End of class Read
