import java.util.Scanner;
class Main {
	public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int no_row=1;no_row<=n;no_row++)
        {
          for(int no_col=1;no_col<=n;no_col++)
          {
            if(no_col==no_row || no_col==(n+1)-no_row)
              System.out.print("*");
            else
              System.out.print(" ");
          }
          System.out.println();
        }
	}
}