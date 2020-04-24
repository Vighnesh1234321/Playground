import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int array[]=new int[array_size];
        int count=0;
        for(int i=0;i<array_size;i++)
        {
           array[i]=sc.nextInt(); 
        }
        int search_1=sc.nextInt();
        int search_2=sc.nextInt();
        for(int i=0;i<array_size;i++)
        {
           if(array[i]==search_1 || array[i]==search_2) 
           {System.out.println(i);
              count++;
           }
           if(count==2)
             break;
        }
        if(count<2)
        {
          if(count==0)
           System.out.println("-1\n-1");
          if(count==1)
            System.out.print("-1");
        }
       
    }
}