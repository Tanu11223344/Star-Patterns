package in.ineuron.main;
import java.util.*;

public class pattern2 {

	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter no of lines:- ");
			n = sc.nextInt();
			for(int i =1; i<=n; i++) {	
				for(int j=1; j<=n; j++) {
					System.out.print(" " + i + " ");
				}
				System.out.println();
		}
			

	}

}
