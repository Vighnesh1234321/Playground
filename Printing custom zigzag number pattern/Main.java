import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
       int n=in.nextInt(), disp=1;
       for(int row_no=1;row_no<=n;row_no++)
       {
         if(row_no%2!=0)
         {
            for(int cols_no=1;cols_no<=n;cols_no++)
            {
               if(cols_no == n)
                  System.out.print(disp+1);
               else
                  System.out.print(disp);
            }
         }
           else
           {
             for(int cols_no=1;cols_no<=n;cols_no++)
             {
               if(cols_no==1)
                 System.out.print(disp+1);
               else
                  System.out.print(disp);
             }
           }
         System.out.println();
         disp++;
         }
       }
	}
