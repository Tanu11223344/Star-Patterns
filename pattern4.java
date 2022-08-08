package in.ineuron.main;
import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		int lines = 0;
		int blank = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of lines:- ");
		lines = sc.nextInt();
		blank = (lines*2)-2;
		// code
		for(int i=1;i<=lines;i++) { //no of lines
			for(int l=1;l<=i;l++) { //left part
				System.out.print("*");
			}
			for(int b=1;b<=blank;b++) { // no of blanks
				System.out.print(" ");
			}
			for(int r=1;r<=i;r++) {  // right part
				System.out.print("*");
			}
				blank = blank-2;
				System.out.println();
				
			
		}
		

	}

}
