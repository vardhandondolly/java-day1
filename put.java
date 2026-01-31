import java.util.Scanner;
public class put {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        String name=sc.nextLine();
        int age=sc.nextInt();
        float marks=sc.nextFloat();
        double d=sc.nextDouble();
        short s=sc.nextShort();
        byte b=sc.nextByte();
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Marks: "+marks);
        System.out.println("Double: "+d);
        System.out.println("Short: "+s);
        System.out.println("Byte: "+b);
    }
} 