import java.util.Scanner;

public class HundredBottlesOfBeer {
	public static void main(String[] args){
		final int MAX_BOTTLES = 100;
		int bottles = MAX_BOTTLES,
		verses = readNumOfVerses();

		for(int i=0; i<verses; i++){
			if(bottles==0){
				bottles = MAX_BOTTLES;
				System.out.println("No more bottles of beer on the wall\n" +
							   "No more bottles of beer\n" +
							   "Go to the store and buy some more\n" +
							   bottles + " bottles of beer on the wall\n");
			}
			else {
				System.out.println(bottles + " bottles of beer on the wall\n" +
								   bottles + " bottles of beer\n" +
								   "Take one down and pass it around");
				if(bottles==1){
					System.out.println("No more bottles of beer on the wall\n");
				}
				else {
					System.out.println((bottles-1) + " bottles of beer on the wall\n");
				}
				bottles--;
			}
		}
	}
	public static int readNumOfVerses(){
		System.out.print("Verses to print: ");
		Scanner in = new Scanner(System.in);
		int verses;
		do {
			verses = in.nextInt();
			if(verses<=0){
				System.out.print("Enter a number of verses: ");
			}
		} while(verses<=0);
		return verses;
	}
}
