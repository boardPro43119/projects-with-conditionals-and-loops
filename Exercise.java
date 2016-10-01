import java.util.Scanner;

public class Exercise {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = in.nextLine();

		for(int i=str.length()-1; i>=0; i--){
			System.out.print(str.charAt(i));
		}
	}
}