package in.ineuron.main;

public class pattern5 {

	public static void main(String[] args) {
		int n = 9;  // Number of rows.
	      
	      n = n/2 + 1;
	      
	      int i=0;
	      
	      //first print Upper Part using Inverted Right Angled Logic.
	      for(i=0;i<n;i++)
	      {
	          // avoid space for first row
	          for(int k=0;k<i;k++)
	          System.out.print("  ");
	          
	          // No. of '*' for each row changes with i.
	          for(int j=i;j<n;j++)
	          {
	            // print '*' for each row.
	            System.out.print("* ");
	          }
	          
	          System.out.println();
	      }
	      
	      n=i;  // i=n so copy its value to n.
	      
	      // then print Lower Part of Pattern.
	      // The lower part always start with 2 stars in first row so we set m=2.
	      int m=2;
	      for(i=0;i<n-1;i++)
	      {
	          // avoid blank space for last row.
	          for(int k=i;k<n-2;k++)
	          System.out.print("  ");
	          
	          // increment m after this loop to continue printing stars equal to row number.
	          for(int j=0;j<m;j++)
	          {
	            //  print '*' for each row.
	            System.out.print("* ");
	          }
	          m++;
	          System.out.println();
	      }
	        
	  }
	}  		

