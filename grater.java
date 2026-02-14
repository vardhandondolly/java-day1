import java.util.*; 
public class grater
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        System.out.println("Enter second number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)System.out.println("A is Grater");
        else System.out.println("B is Grater");
    }
}