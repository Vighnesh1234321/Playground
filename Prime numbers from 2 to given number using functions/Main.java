import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prime_number(n);
	}
   public static void prime_number(int num)
   {
      for(int prime=2;prime<=num;prime++)
      {
         int prime_check=2;
         int count=0;
         while(count == 0 && prime_check<prime)
         {
           if(prime%prime_check == 0)
           {
              count++;
           }
           prime_check++;
         }
         if(count == 0 )
            System.out.println(prime);
      }
   }
}