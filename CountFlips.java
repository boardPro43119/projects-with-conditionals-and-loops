//************************************************************************
// CountFlips.java			Author: Benjamin Prud'homme
// Counts the number of times a coin comes up heads or tails in a number
// of flips specified by the user.
//************************************************************************

import java.util.Scanner;

public class CountFlips{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Coin coin = new Coin();
		int flips,
			heads = 0,
			tails = 0;

		System.out.print("Flips: ");
		flips = in.nextInt();

		for(int i=0; i<flips; i++){
			coin.flip();
			if(coin.isHeads()) heads++;
			else tails++;
		}

		System.out.println(heads + " heads, " + tails + " tails");
	}
}