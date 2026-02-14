import java.util.*;
public class alpha
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Letter");
        char letter=sc.next().charAt(0);
        if(letter=='A')System.out.println(letter+" is vowel");
        else if(letter=='E')System.out.println(letter+" is vowel");
        else if(letter=='I')System.out.println(letter+" is vowel");
        else if(letter=='O')System.out.println(letter+" is vowel");
        else if(letter=='U')System.out.println(letter+" is vowel");
        else System.out.println(letter+" is consonant");
    }
}