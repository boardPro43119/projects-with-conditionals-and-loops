import java.util.Scanner;
import java.util.Random;


public class RockPaperScissors {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Random computerChooser = new Random();
		String userChoice,
			   computerChoice = "";
		int result = -1,
			wins = 0,
			losses = 0,
			ties = 0;
		boolean running = true;

		while(running){
			// Computer makes its choice
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

			// Get user's choice
			System.out.print("Choose rock, paper, or scissors: ");
			userChoice = in.next();

			if(computerChoice.equalsIgnoreCase("rock")){
				switch(userChoice){
				case "rock":
					result = 1;
					break;
				case "paper":
					result = 2;
					break;
				case "scissors":
					result = 0;
					break;
				}
			}
			else if(computerChoice.equalsIgnoreCase("paper")){
				switch(userChoice){
				case "rock":
					result = 0;
					break;
				case "paper":
					result = 1;
					break;
				case "scissors":
					result = 2;
					break;
				}
			}
			else if(computerChoice.equalsIgnoreCase("scissors")){
				switch(userChoice){
				case "rock":
					result = 2;
					break;
				case "paper":
					result = 0;
					break;
				case "scissors":
					result = 1;
					break;
				}
			}

			switch(result){
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

			System.out.print("Do you want to play again (Y/N)? ");
			if(in.next().equalsIgnoreCase("N")) running = false;
		}
		System.out.println("Total wins: " + wins);
		System.out.println("Total losses: " + losses);
		System.out.println("Total ties: " + ties);

	}
}