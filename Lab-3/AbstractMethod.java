abstract class Base
{
    abstract void show();
    abstract void display();
    void Sum(int x, int y)
    {
        System.out.println("\nSum is: "+(x+y));
    }

}

class Derived extends Base
{
    void show()
    {
        System.out.println("\nI am Bishal Koirala.");
    }

    void display()
    {
        System.out.println("\nI am Software Engineer.");
    }

   
}

public class AbstractMethod
{
    public static void main(String str[])
    {
        Derived obj = new Derived();
        obj.show();
        obj.display();
        obj.Sum(3, 5);

    }
}