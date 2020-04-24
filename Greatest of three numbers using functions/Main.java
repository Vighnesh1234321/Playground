import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int great = greatest_number(n1,n2);
        System.out.println(greatest_number(great,n3));
    }
    public static int greatest_number(int num1, int num2)
    {
       if(num1>num2)
          return num1;
       else
          return num2;
    }
}