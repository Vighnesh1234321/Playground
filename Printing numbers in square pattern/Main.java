import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        for(int i=1;i<=row;i++)
        {
          for(int j=1;j<=row;j++)
          {
            System.out.print(i);
          }
          System.out.println();
        }
	}
}