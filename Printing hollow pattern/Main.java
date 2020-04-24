import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int no_rows=1;no_rows<=n;no_rows++)
        {
          if(no_rows == 1 || no_rows == n)
          {
             for(int no_cols=1;no_cols<=n;no_cols++)
               System.out.print("*");
             
          }
          else
          {
            for(int cols_no=1;cols_no<=n;cols_no++)
             {
                if(cols_no==1 || cols_no==n)
                  System.out.print("*");
                else
                  System.out.print(" ");
            }
            }
          System.out.println();
        }
	}
}