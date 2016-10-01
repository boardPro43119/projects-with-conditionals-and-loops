public class MultiplicationTable {
	public static void main(String[] args){
		// First row (top heading)
		System.out.print("X    ");
		for(int i=1; i<13; i++){
			printNext(i);
		}
		System.out.println();

		// Rows 1-12
		for(int currentRow = 1; currentRow<13; currentRow++){
			printNext(currentRow);
			for(int multiplier = 1; multiplier<13; multiplier++){
				printNext(currentRow*multiplier);
			}
			System.out.println();
		}
	}
	public static void printNext(int num){
		System.out.print(num);
		if(num<10){
			System.out.print("    ");
		}
		else if(num<100){
			System.out.print("   ");
		}
		else{
			System.out.print("  ");
		}
	}
}