import java.util.*;
class ArithmeticSub {
    public static void main(String s[]) {
        int a,b,sub;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a= input.nextInt();
        b=input.nextInt(); 
        input.close();
        sub= a-b;
        System.out.println("Subtraction is: " + sub);
       
    }
}