import java.util.Scanner;

public class MultiplicationTable {
	//************************************************************************
	// MultiplicationTable.java			Author: Benjamin Prud'homme
	// An application that prints a specific portion of the multiplication
	// table as requested by the user.
	//************************************************************************
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Start with row: ");
		int startingRow = in.nextInt();
		System.out.print("Start with column: ");
		int startingColumn = in.nextInt();
		System.out.print("How many rows to print? ");
		int rows = in.nextInt();
		System.out.print("How many columns to print? ");
		int columns = in.nextInt();

		int columnLength = getColumnLength(startingRow, startingColumn, rows, columns);

		// First row (top heading)
		printNext("X", columnLength);
		for(int i=startingColumn; i<startingColumn+columns; i++){
			printNext(Integer.toString(i), columnLength);
		}
		System.out.println();

		// Rows 1-12
		for(int currentRow = startingRow; currentRow<startingRow+rows; currentRow++){
			printNext(Integer.toString(currentRow), columnLength);
			for(int multiplier = startingColumn; multiplier<startingColumn+columns; multiplier++){
				printNext(Integer.toString(currentRow*multiplier), columnLength);
			}
			System.out.println();
		}
	}

	public static void printNext(String str, int columnLength){
		System.out.print(str);
		for(int i=str.length(); i<= columnLength; i++){
			System.out.print(" ");
		}
	}

	public static int getColumnLength(int startingRow, int startingColumn, int rows, int columns){
		int largestNumber = (startingRow+rows-1)*(startingColumn+columns-1);
		return Integer.toString(largestNumber).length();
	}
}