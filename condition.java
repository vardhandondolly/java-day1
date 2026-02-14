import java.util.*;
public class condition
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        if(a<0)System.out.println("negative");
        else if(a>0)System.out.println("positive");
        else System.out.println("zero");    
    }
}