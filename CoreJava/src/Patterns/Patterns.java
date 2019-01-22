package Patterns;

class Patterns{
	public static void main(String args[]) {
		/*
		 * to print a pattern 
		 * 
		 * ****
		 * ****
		 * ****
		 * ****
		 * 
		 * 
		 */
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	
}