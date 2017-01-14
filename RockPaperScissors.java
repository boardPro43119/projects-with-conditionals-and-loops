import java.util.Scanner;
import java.util.Random;


public class RockPaperScissors {

	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args){
		String userChoice,
			   computerChoice;
		int wins = 0,
			losses = 0,
			ties = 0;
		boolean running = true;

		while(running){

			// Get user's choice
			userChoice = getUserChoice();

			running = !(userChoice.equalsIgnoreCase("q"));

			if(running){
				// Computer makes its choice
				computerChoice = getComputerChoice();

				switch(getResult(userChoice, computerChoice)){
					case 2:
						System.out.println("Computer chooses " + computerChoice + ", you win!");
						wins++;
						break;
					case 1:
						System.out.println("Computer chooses " + computerChoice + ", it's a tie.");
						ties++;
						break;
					case 0:
						System.out.println("Computer chooses " + computerChoice + ", you lose.");
						losses++;
						break;
				}
			}
		}

		System.out.println("Total wins: " + wins);
		System.out.println("Total losses: " + losses);
		System.out.println("Total ties: " + ties);

	}

	public static String getUserChoice(){
		String userChoice = "";
		while(!isValidUserChoice(userChoice)){
			System.out.print("Choose rock, paper, or scissors (or q to quit): ");
			userChoice = in.nextLine();
		}
		return userChoice;
	}

	public static boolean isValidUserChoice(String userChoice){
		return userChoice.equalsIgnoreCase("rock") ||
			userChoice.equalsIgnoreCase("paper") ||
			userChoice.equalsIgnoreCase("scissors") ||
			userChoice.equalsIgnoreCase("q");
	}

	public static String getComputerChoice(){
		String computerChoice = "";
		Random computerChooser = new Random();
		switch(computerChooser.nextInt(3)){
			case 0:
				computerChoice = "rock";
				break;
			case 1:
				computerChoice = "paper";
				break;
			case 2:
				computerChoice = "scissors";
				break;
		}
		return computerChoice;
	}

	public static int getResult(String userChoice, String computerChoice){
		int result; // Variable to represent win, loss, or tie
		if(userChoice.equalsIgnoreCase(computerChoice)){
			result = 1; // result = 1 for a tie
		}
		else if(computerChoice.equalsIgnoreCase("rock")){
			result = userChoice.equalsIgnoreCase("paper") ? 2 : 0; // result = 2 for a win, 0 for a loss
		}
		else if(computerChoice.equalsIgnoreCase("paper")){
			result = userChoice.equalsIgnoreCase("scissors") ? 2 : 0;
		}

		else {
			result = userChoice.equalsIgnoreCase("rock") ? 2 : 0;
		}
		return result;
	}

}