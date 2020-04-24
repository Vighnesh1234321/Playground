import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
        int row=in.nextInt();
        for(int i=row;i>0;i--)
        {
          for(int col=i;col>0;col--)
          {
            System.out.print(col);
          }
          System.out.println();
        }
	}
}