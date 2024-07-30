import java.util.Scanner;

class Division
{
    
    public static void main(String str[])
    {
        double a, b;
        System.out.println("Enter the two numbers");
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b= input.nextDouble();
        System.out.println("Division is: "+a/b);
        input.close();
    }
}