import java.util.Scanner;
class Rectangle 
{

    float length,breadth,height,base;
    Scanner sc = new Scanner(System.in); 
    
   public void displayArea()
   {
        System.out.println("\nEnter length & breadth of rectangle.");
        length = sc.nextInt();
        breadth = sc.nextInt();
        System.out.println("Area of Rectangle is: "+(length*breadth));
   }
} 


class Square extends Rectangle
{
  
    public void displayArea()
    {  
        System.out.println("\nEnter length of square.");
        length = sc.nextInt();
        System.out.println("Area of Square is: "+(4*length));
    }
} 


class Triangle extends Rectangle
{
    
    public void displayArea()
    {
        

        System.out.println("\nEnter height and base of traingle.");
        height = sc.nextInt();
        base = sc.nextInt();
        System.out.println("Area of Triangle is: "+(0.5)*height*base);
    }
}


public class DispatchAtRuntime
{
    public static void main(String str[])
    {

        Rectangle r = new Rectangle();
        r.displayArea();


        r = new Square();
        r.displayArea();


       r = new Triangle();
        r.displayArea();


    }
}
