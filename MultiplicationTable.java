import java.util.Scanner;

public class MultiplicationTable {
	//************************************************************************
	// MultiplicationTable.java			Author: Benjamin Prud'homme
	// An application that prints a specific portion of the multiplication
	// table as requested by the user.
	//************************************************************************
	public static void main(String[] args){
		// Get range from user
		Scanner in = new Scanner(System.in);
		System.out.print("Start with row: ");
		int startingRow = in.nextInt();
		System.out.print("Start with column: ");
		int startingColumn = in.nextInt();
		System.out.print("How many rows to print? ");
		int rows = in.nextInt();
		System.out.print("How many columns to print? ");
		int columns = in.nextInt();

		// Determine length of largest number in table
		int columnLength = getColumnLength(startingRow, startingColumn, rows, columns);

		// First row (top heading)
		printCell("X", columnLength); // Start with multiplication symbol
		for(int i=startingColumn; i<startingColumn+columns; i++){
			// Print column numbers starting from startingColumns
			printCell(Integer.toString(i), columnLength);
		}
		System.out.println(); // Move to next row

		// All subesquent rows
		for(int currentRow = startingRow; currentRow<startingRow+rows; currentRow++){
			printCell(Integer.toString(currentRow), columnLength); // Print row number
			for(int multiplier = startingColumn; multiplier<startingColumn+columns; multiplier++){
				// On each row, print results of multiplying row number by column numbers
				printCell(Integer.toString(currentRow*multiplier), columnLength);
			}
			System.out.println(); // Move to next row
		}
	}

	// Prints next number (or "X" at top left), adds appropriate spacing
	public static void printCell(String str, int columnLength){
		System.out.print(str); // Print next number
		for(int i=str.length(); i<= columnLength; i++){
			// Add a space for each digit short of the maximum length, plus one
			System.out.print(" ");
		}
	}

	// Returns the number of digits in the largest number to be printed
	public static int getColumnLength(int startingRow, int startingColumn, int rows, int columns){
		int largestNumber = (startingRow+rows-1)*(startingColumn+columns-1); // Calculate largest number to be printed
		return Integer.toString(largestNumber).length(); // Returns number of digits in this number
	}
}