import java.util.Scanner;

public class EvenRangeSum {
	//************************************************************************
	// EvenRangeSum.java			Author: Benjamin Prud'homme
	// Reads an integer input from the user and prints out the sum of all
	// positive even integers between 2 and the input inclusive.
	//************************************************************************
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int value,
			sum;

		System.out.println("Enter an integer 2 or greater.  The sum of all even positive integers up to the input will be printed. ");
		do {
			sum = 0;
			System.out.print("Input: ");
			value = in.nextInt();
			if(value>=2){
				for(int i=2; i<=value; i+=2){
					sum+=i;
				}
				System.out.println("Sum of even integers 2-" + value + ": " + sum);
			}
			else if (value!=0){
				System.out.println("That integer is less than 2.  Try again.");
			}
		} while(value!=0);
	}
}