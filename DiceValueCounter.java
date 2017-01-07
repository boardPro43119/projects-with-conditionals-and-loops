import java.util.Scanner;

public class DiceValueCounter {
	//************************************************************************
	// DiceValueCounter.java			Author: Benjamin Prud'homme
	// Counts the number of times each possible value from 2 to 12 appears
	// in a number of rolls specified by the user, and graphs their
	// distribution.
	//************************************************************************
	public static void main(String[] args){
		PairOfDice dice = new PairOfDice();
		int[] valueFrequencies = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

		Scanner in = new Scanner(System.in);
		System.out.print("How many dice rolls? ");
		int rolls = in.nextInt();

		for(int i=0; i<rolls; i++){
			dice.roll();
			valueFrequencies[dice.getSum()-2]++;
		}

		createResultsGraph(valueFrequencies);
	}
	public static void createResultsGraph(int[] resultsArray){
		for(int i=2; i<=12; i++){
			System.out.print(i + " ");

			if(1<i && i<10) System.out.print(" ");
			System.out.print("|");

			for(int j=0; j<resultsArray[i-2]; j++){
				System.out.print("#");
			}
			System.out.println();
		}
	}
	public static class PairOfDice {
		private Die die1;
		private Die die2;

		public PairOfDice(){
			die1 = new Die();
			die2 = new Die();
		}

		public String roll(){
			return die1.roll() + ", " + die2.roll();
		}

		public void setDie1(int newValue){
			die1.setFaceValue(newValue);
		}

		public void setDie2(int newValue){
			die2.setFaceValue(newValue);
		}

		public int getDie1(){
			return die1.getFaceValue();
		}

		public int getDie2(){
			return die2.getFaceValue();
		}

		public int getSum(){
			return die1.getFaceValue() + die2.getFaceValue();
		}

		public String toString(){
			return die1.getFaceValue() + ", " + die2.getFaceValue();
		}
	}
	public static class Die {
		private final int MAX = 6;  // maximum face value

		private int faceValue;  // current value showing on the die


		//----------------------------------------------------------------
		//  Constructor: Sets the initial face value.   //----------------------------------------------------------------
		public Die(){
			faceValue = 1;
		}

		//----------------------------------------------------------------
		//  Rolls the die and returns the result.   //----------------------------------------------------------------
		public int roll(){
			faceValue = (int)(Math.random() * MAX) + 1;
		  	return faceValue;
	  	}

		//----------------------------------------------------------------
		//  Face value mutator.   //----------------------------------------------------------------
		public void setFaceValue(int value){
			faceValue = value;
		}

		//----------------------------------------------------------------
		//  Face value accessor.   //----------------------------------------------------------------
		public int getFaceValue(){
			return faceValue;
		}

		public boolean equals(Die die){
			if(faceValue == die.getFaceValue()){
				return true;
			}
			else {
				return false;
			}
		}


		//----------------------------------------------------------------
		//  Returns a string representation of this die.   //----------------------------------------------------------------
		public String toString(){
			String result = Integer.toString(faceValue);
		  	return result;
	  	}
	}
}