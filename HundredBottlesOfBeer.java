import java.util.Scanner;

public class HundredBottlesOfBeer {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Verses to print (from 1 to 100): ");

		int verses;
		do {
			verses = in.nextInt();
			if(verses<=0 || verses>100){
				System.out.print("Please enter a number of verses from 1 to 100: ");
			}
		} while(verses<=0 || verses>100);

		for(int i=100; i>100-verses; i--){
			System.out.println(i + " bottles of beer on the wall\n" +
							   i + " bottles of beer\n" +
							   "If one of those bottles should happen to fall\n" +
							   (i-1) + " bottles of beer on the wall\n");
		}
	}
}