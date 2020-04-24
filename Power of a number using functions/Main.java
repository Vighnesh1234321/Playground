import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      int base= sc.nextInt(), exp = sc.nextInt();
      System.out.println(power(base,exp));
   }
   public static int power(int base, int exp)
   {
      int answer = 1;
      for(int i=0;i<exp;i++)
      {
         answer = answer*base;
      }
      return(answer);
   }
}