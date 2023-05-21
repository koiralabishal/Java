import java.util.*;
public class readData {
    int a,b,s;
    public void getValue()
    {
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b=sc.nextInt();
        sc.close();
    }
    public void displaySum()
    {
        s= a+b;
        System.out.println("Addition is: "+s);
    }
    public static void main(String str[])
    {
        readData d = new readData();
        d.getValue();
        d.displaySum();
        
    }
}
