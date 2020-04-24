import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[] = new int[n];
    for(int i=0;i<n;i++)
    {
      list[i]=sc.nextInt(); 
    }
    int sum=list[0]+list[1]+list[2], check=1;
    for(int i=3;i<n;i=i+3)
    {
       if(list[i]+list[i+1]+list[i+2] == sum)
       {
          check=1; 
       }
       else
       {check=0;break;}
    }
    if(check==1)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
}