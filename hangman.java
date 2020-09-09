package hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class hangman {

	
	  // import the txt file dictionary to the hangman folder
	public static void main(String[] args) throws Exception {
		File dictionary = new File("C:\\Users\\Patrik\\eclipse-workspace\\hangman\\src\\dictionary.txt");

		System.out.println("\t" + "START THE GAME BY ENTERING A LETTER");
		
	 // textScanner scans dictionary text file
		Scanner textScanner = new Scanner(dictionary);  
		Scanner input = new Scanner(System.in);
     
	// Creation of a new Arraylist word from words in the dictionary txt file
		ArrayList<String> words = new ArrayList<>();
		while (textScanner.hasNextLine()) {
			words.add(textScanner.nextLine());
		}

		
	// Get random words from Array word randomly and hide the words	
		String hidden_text = words.get((int) (Math.random() * words.size()));
		char[] textArray = hidden_text.toCharArray();
		char[] userEntry = new char[textArray.length];
		for (int i = 0; i < textArray.length; i++) {
			userEntry[i] = '*';
		}

		boolean gameEnd = false;
		int guesses = 7;

		
	
		while (gameEnd == false) {
			System.out.println("\t" + ":::::::::: HANGMAN::::::::::");
			System.out.println("\t" + "Enter a letter please");
		
			
	//Getting & Checking using unput. If its empty or not an alphabet than user gets a prompt to enter valid input	
			String userInput = input.next();
			while (userInput.length() != 1 || Character.isDigit(userInput.charAt(0))) {
				System.out.println("Please enter a valid input");
				userInput = input.next();
			}

	// Check if the userInput is found in the word array
			boolean correct = false;
			for (int i = 0; i < textArray.length; i++) {
				if (userInput.charAt(0) == textArray[i]) {
					userEntry[i] = textArray[i];
					correct = true;
				}
			}
	
	// If no match minus guesses & draw hangman 	
				if (!correct) {
				guesses--;
				System.out.println("Your input does not match!!");
				look.drawMan(guesses);
			}

			boolean done = true;
			for (int i = 0; i < userEntry.length; i++) {
				if (userEntry[i] == '*') {
					System.out.print(" _");
					done = false;
				} else {
					System.out.print(" " + userEntry[i]);
				}
			}
			System.out.println(" " + "Guesses left : " + guesses);

	// Check to see if the game has finished
			if (done) {
				System.out.println("\n"+"\t"+"::::::You are Clever!::::::");
				gameEnd = true;

			}
			
			if (guesses <=0) {
				System.out.println("\n"+"\t"+"::::::Oh NO !!!!:::::: ");
				gameEnd=true;
			}
		}
		
		System.out.println("\n"+"\t"+"The word was:  "+hidden_text);
	}
}