public class FlipRace {
	//************************************************************************
	// FlipRace.java			Author: Benjamin Prud'homme
	// Races two coins against each other to see which one can be first to
	// come up heads on three consecutive flips.
	//************************************************************************
	public static void main(String[] args){
		Coin coin1 = new Coin(),
			 coin2 = new Coin();
		int flips = 0,
			coin1Heads = 0,
			coin2Heads = 0;
		boolean running = true;

		while(running){
			flips++;

			coin1.flip();

			if(coin1.isHeads()){
				coin1Heads++;
			}
			else{
				coin1Heads = 0;
			}

			System.out.println("Coin 1 flip " + flips + ": " + coin1 + ", score: " + coin1Heads);

			coin2.flip();
			if(coin2.isHeads()){
				coin2Heads++;
			}
			else{
				coin2Heads = 0;
			}

			System.out.println("Coin 2 flip " + flips + ": " + coin2 + ", score: " + coin2Heads);

			if(coin1Heads==3){
				if(coin2Heads==3){
					System.out.println("It's a tie!  Both coins finish in " + flips + " flips.");
				}
				else{
					System.out.println("Coin 1 wins, finishing in " + flips + " flips.");
				}
				running = false;
			}
			else if(coin2Heads==3){
				System.out.println("Coin 2 wins, finishing in " + flips + " flips.");
				running = false;
			}
		}

	}
}