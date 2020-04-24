import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	Scanner in=new Scanner(System.in);
        int row = in.nextInt(),count=1;
        for(int i=row;i>0;i--)
        {
          for(int space=i-1;space>0;space--)
          {
            System.out.print(" ");
          }
            for(int col=i;col<=row;col++)
            {
              System.out.print(count+" ");
              count++;
            }
          System.out.println();
        }    
    }    
}