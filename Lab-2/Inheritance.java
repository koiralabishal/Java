
class Vehicle
{
    String model,color;
    double cost;
   

    Vehicle(String model, String color, double cost)
    {  
        this.model = model;
        this.color = color;
        this.cost = cost;
    }


    public double getCost() //override
    {
        return cost;
    }


    void displayDetails()
    {
        System.out.println("Model: "+model+"\t"+"Color: "+color+"\t"+"Cost: Rs."+cost+"/-");
    }
}

class Car extends Vehicle
{
    int numWheels;
    Car(String model, String color, double cost, int numWheels)
    {
        super(model,color, cost);
        this.numWheels= numWheels;
    }

    public double getCost() //override
    {
        return cost*4.3;
    }


    void displayDetails()
    {
        System.out.println("\nDetails of a Car is:");
        super.displayDetails();
        System.out.println("Number of Wheels: "+numWheels);
    }
}

class Bike extends Vehicle
{
    int numWheels;
    Bike(String model, String color, double cost, int numWheels)
    {
        super(model,color,cost);
        this.numWheels= numWheels;
    }


    public double getCost()
    {
        return cost*2.1;
    }


    void displayDetails()
    {
        System.out.println("\nDetails of a Bike is:");
        super.displayDetails();
        System.out.println("Number of Wheels: "+numWheels);
    }
}


public class Inheritance {
    public static void main(String str[]) {
        Car c = new Car("Suzuki","Black", 150000,4);
        c.displayDetails();
        System.out.println("Final cost: Rs."+c.getCost()+"/-");

        Bike b = new Bike("Honda", "Black",100000,2);
        b.displayDetails();
        System.out.println("Final cost: Rs."+b.getCost()+"/-");
    }
}
