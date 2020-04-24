import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int temp = n, count = 0, temp_1 = n, sum = 0;
       while(temp>0)
       {
         temp = temp/10;
         count++;
       }
       for(int i = 0; i<count;i++)
       {
          temp = temp_1%10;
          temp_1 = temp_1/10;
          int power=1;
          for(int j= 0;j<count;j++)
          {power=power*temp;}
          sum = sum + power;
       }
       if(sum == n)
         System.out.println("Armstrong Number");
       else
         System.out.println("Not a Armstrong Number");
         
	 }
}