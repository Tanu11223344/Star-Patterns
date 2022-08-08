package in.ineuron.main;
// Program to print INeuron
public class pattern1
{  
/*public static void main(String[] args)  
{  
int i, j, n=5;  
// Outer for loop for number of lines  
for (i = 0; i<=n; i++)   
{  
System.out.println("*");
		
}  
} */ 

/*	public static void main(String[] args) {
		for(int row = 1; row <=8; row++) {
			for(int col = 1; col<=8; col++) {
				if(col==1 || col==8 || col==row)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}

public static void main(String[] args) {
	for(int row = 1; row <=10; row++) {
		for(int col = 1; col<=10; col++) {
			if((row==1 || row==10 || row == 10/2) && col%2==1|| col==1)
			System.out.print("*");
			else
			System.out.print(" ");
			
		}
		System.out.println();
	}
	
}

	public static void main(String[] args) {
		for(int row=1;row<5;row++) {
			for(int col=1;col<=5;col++) {
				if((col==1||col==5) && row<4 || row==4 && col%2==0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
			
	}

	public static void main(String[] args) {
		int fp = 2;
		boolean flg = false;
		for(int row=1;row<=10;row++) {
			for(int col=1;col<=8;col++) {
				if(col==1 || (row==1 || row==10/2) && col%2==1 || col==8 && row<10/2 && row!=1)
					System.out.print("*");
				else if(row>10/2 && col == fp) {
					System.out.print("*");
					flg=true;
				}else
					System.out.print(" ");
			}
			System.out.println();
			if(flg==true) {
			fp++;
			}
		}
	}
	public static void main(String[] args) {
		for(int i=1;i<8;i++) {
			for(int j=1;j<8;j++ ) {
				if(i+j==4||i*j==4||j-i==4||i-j==4||i*j==28||i+j==12)
				{
					System.out.print("*" + " ");
				}
					else
				{
					System.out.print(" " + " ");
				}
						
			}
			System.out.println();
			}
		}*/
	public static void main(String[] args) {
		for(int row = 1; row <=8; row++) {
			for(int col = 1; col<=8; col++) {
				if(col==1 || col==8 || col==row)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}



