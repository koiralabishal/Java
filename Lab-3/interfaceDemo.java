interface HumanInterface
{
    String type = "Human";
    void study (String qualification);
}

interface AnimalInterface
{
    void eat();
    void travel();
}

interface PlantInterface
{
    void grow();
    void decay();
}

class PersonClass implements HumanInterface, AnimalInterface, PlantInterface
{
    public void study(String qualification)
    {
        System.out.println(type+" studying "+qualification);
    }

    public void eat(){
        System.out.println("Animal eats.");
    }

    public void travel(){
        System.out.println("Animal travels.");
    }

    public void grow(){
        System.out.println("Plant grows.");
    }
    
    public void decay(){
        System.out.println("Plant decays.");
    }
}

public class interfaceDemo {
    public static void main(String str[])
    {
       PersonClass c = new PersonClass();
       c.study("BESE");
       c.eat();
       c.travel();
       c.grow();
       c.decay();
    }
}
