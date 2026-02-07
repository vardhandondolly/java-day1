class Student1
{
    public static void main(String args[])
    {
        String Name = "Dolly";
        int Age = 24;
        char Grade='A';
        int Marks=90;
        System.out.println("Name: "+Name);
        System.out.println("Age: "+Age);
        System.out.println("Grade: "+Grade);
        System.out.println("Marks: "+Marks);
        if(Marks>=35)
        {
            System.out.println("passed");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}