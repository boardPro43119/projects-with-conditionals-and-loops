//************************************************************************
// Stars.java			Author: Benjamin Prud'homme
// Draws a triangle or diamond of a size specified by the user on the
// screen with asterisks.
//************************************************************************

import java.util.Scanner;

public class Stars {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int shapeChoice,
			rows;

		System.out.print("Choose shape to print:\n"
			+ "1: Bottom-left aligned triangle\n"
			+ "2: Top-left aligned triangle\n"
			+ "3: Bottom-right aligned triangle\n"
			+ "4: Top-right aligned triangle\n"
			+ "5: Diamond\n"
			+ "Shape: ");
		shapeChoice = in.nextInt();

		System.out.print("Size (rows): ");
		rows = in.nextInt();

		switch(shapeChoice){
			case 1:
				bottomLeftTriangle(rows);
				break;
			case 2:
				topLeftTriangle(rows);
				break;
			case 3:
				bottomRightTriangle(rows);
				break;
			case 4:
				topRightTriangle(rows);
				break;
			case 5:
				diamond(rows);
				break;
			default:
		}

	}

	public static void bottomLeftTriangle(int rows){
		int size = rows;
		int asterisks = 1;
		for(int i=0; i<size; i++){
			for(int j=0; j<asterisks; j++){
				System.out.print("*");
			}
			asterisks++;
			System.out.println();
		}
	}

	public static void topLeftTriangle(int rows){
		int size = rows;
		int asterisks = size;
		for(int i=0; i<size; i++){
			for(int j=0; j<asterisks; j++){
				System.out.print("*");
			}
			asterisks--;
			System.out.println();
		}
	}

	public static void bottomRightTriangle(int rows){
		int size = rows;
		int asterisks = 1;
		for(int i=0; i<size; i++){
			for(int j=0; j<(size-asterisks); j++){
				System.out.print(" ");
			}
			for(int k=0; k<asterisks; k++){
				System.out.print("*");
			}
			asterisks++;
			System.out.println();
		}
	}

	public static void topRightTriangle(int rows){
		int size = rows;
		int asterisks = size;
		for(int i=0; i<size; i++){
			for(int j=0; j<(size-asterisks); j++){
				System.out.print(" ");
			}
			for(int k=0; k<asterisks; k++){
				System.out.print("*");
			}
			asterisks--;
			System.out.println();
		}
	}

	public static void diamond(int rows){
		int size = rows;
		int upperRows;
		int lowerRows;
		int asterisks = 1;
		int width;
		int spaces;

		width = (size%2 == 0) ? size-1 : size;
		spaces = width/2;
		upperRows = (size%2 == 0) ? size/2 : (size/2)+1;
		lowerRows = size-upperRows;

		System.out.println("size = " + size);
		System.out.println("width = " + width);
		System.out.println("spaces = " + spaces);


		for(int i=0; i<upperRows; i++){
			for(int j=0; j<spaces; j++){
				System.out.print(" ");
			}
			for(int j=0; j<asterisks; j++){
				System.out.print("*");
			}
			spaces--;
			asterisks+=2; // Increment row
			System.out.println();
		}

		spaces = 0;
		asterisks = width;

		if(size%2 == 1){
			spaces++;
			asterisks-=2; // If there are an odd number of rows, decrement the next row
		}

		for(int i=0; i<lowerRows; i++){
			for(int j=0; j<spaces; j++){
				System.out.print(" ");
			}
			for(int j=0; j<asterisks; j++){
				System.out.print("*");
			}
			spaces++;
			asterisks-=2; // Decrement row
			System.out.println();
		}
	}
}