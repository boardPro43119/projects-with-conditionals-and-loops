import java.util.Scanner;


public class Exercise {
	public static void main(String args[]){
		powersOfTwo();
	}

	public static void powersOfTwo(){
		for(int i=1; i<11; i++){
			System.out.println((int)Math.pow(2, i));
		}
	}
}