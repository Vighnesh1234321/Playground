import java.util.Scanner;
class Main {
	public static void main (String[] args){
         Scanner in  = new Scanner(System.in);
         int n = in.nextInt(), odd = 1;
	     for(int i=1;i<=n;i++)
         {
             
             System.out.println(odd);
             odd = odd+2;
         }
	}
}