import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
        int row=in.nextInt(), count = 0;
  		for(int i=1;i<=row;i++)
        {
            for(int col=1;col<=i;col++)
            {
                count++;
               
                if(count % 2==0)
                   System.out.print("#");
                else
                   System.out.print("*");
            }
          System.out.println();
        }
    }
}