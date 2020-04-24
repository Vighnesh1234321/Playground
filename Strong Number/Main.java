import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0, temp, check = n;
        while(n>0)
        {
           temp = n%10;
           int fac = 1;
           for(int i=2;i<=temp;i++)
           {
              fac=fac*i;
           }
           sum = sum +fac;
           n = n/10;
        }
        if(sum == check)
           System.out.println("Yes");
         else
           System.out.println("No");
	}
}