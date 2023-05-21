import java.util.*;
public class Moterbike {
    String name,engineModel;
    int maxSpeed;
    public void getValue()
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name,engine-model and maximum-speed of a moterbike:");
        name = sc.next();
        engineModel = sc.next();
        maxSpeed= sc.nextInt();
        sc.close();
    }
    public void displayInfo()
    {
        System.out.println("\nInformation of a moterbike is:");
        System.out.println("Name: "+name);
        System.out.println("Engine Model: "+engineModel);
        System.out.println("Maximum Speed: "+maxSpeed+" mpH");
    }
    public static void main(String str[])
    {
        Moterbike m = new Moterbike();
        m.getValue();
        m.displayInfo();
    }
}

