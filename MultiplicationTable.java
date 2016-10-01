public class MultiplicationTable {
	public static void main(String[] args){
		// First row (top heading)
		System.out.print("X    ");
		for(int i=1; i<13; i++){
			System.out.print(i);
			applySpacing(i);
		}
		System.out.println();

		// Rows 1-12
		for(int currentRow = 1; currentRow<13; currentRow++){
			System.out.print(currentRow);
			applySpacing(currentRow);
			for(int multiplier = 1; multiplier<13; multiplier++){
				System.out.print(currentRow*multiplier);
				applySpacing(currentRow*multiplier);
			}
			System.out.println();
		}
	}
	public static void applySpacing(int num){
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