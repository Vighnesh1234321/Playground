import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr_size = sc.nextInt();
        int array[]=new int[arr_size];
        for(int i=0;i<arr_size;i++)
        {
          array[i]=sc.nextInt();
        }
        int greatest=array[0];
        for(int i=1;i<arr_size;i++)
        {
           if(array[i]>=greatest)
             greatest=array[i];
        }
        System.out.println(greatest);
    }
}