public class PairOfDice {
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