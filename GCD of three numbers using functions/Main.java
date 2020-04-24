import java.util.Scanner;
public class Main{
    public static int gcd(int num1,int num2)
    {
       int gd=1,smaller;
        if(num1>num2)
         smaller=num2;
        else
         smaller=num1;
        for(int i=2;i<=smaller;i++)
        {
           if(num1%i == 0 && num2%i == 0)
           {
              if(i>gd)
                gd=i;
           }
        }
        return gd;   
    }
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int gcd_1 = gcd(n1,n2);
        int gcd_final = gcd(gcd_1,n3);
        System.out.println(gcd_final);
	}
}