import java.util.Scanner;
class Main
{
   public static void main (String args[])
   {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp = n, count = 1;
      while(temp > 10)
      {
         temp = temp / 10;
         count = count * 10;
      }
      n = n-(temp*count);
      System.out.println(n/(count/10));
   }
}