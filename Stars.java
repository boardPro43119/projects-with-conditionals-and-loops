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
		int asterisks = 1;
		int width;
		int spaces;

		if(size%2 == 0){
			width = size-1;
		}
		else{
			width=size;
		}

		spaces = width/2;

		System.out.println("size = " + size);
		System.out.println("width = " + width);
		System.out.println("spaces = " + spaces);

		while(spaces >= 0){
			for(int i=0; i<spaces; i++){
				System.out.print(" ");
			}
			spaces--;
			for(int i=0; i<asterisks; i++){
				System.out.print("*");
			}
			asterisks+=2;
			System.out.println();
		}

			if(size%2 == 1){
			asterisks-=2;
			spaces++;
			}

		while(spaces < width/2){
			spaces+=1;
			for(int i=0; i<spaces; i++){
				System.out.print(" ");
			}
			asterisks-=2;
			for(int i=0; i<asterisks; i++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}