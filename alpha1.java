import java.util.*;
public class alpha1
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Letter");
        char letter=sc.next().charAt(0);
        if(letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U')System.out.println(letter+" is vowel");
        else System.out.println(letter+" is consonant");
    }
}
