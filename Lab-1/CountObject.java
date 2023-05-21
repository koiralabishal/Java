public class CountObject {
    static int count = 0;
    CountObject()
    {
        count++;
    }
    void display()
    {
        System.out.println("No. of object is: "+count);
    }
    public static void main(String str[]) {
        CountObject obj1 = new CountObject();
        CountObject obj2 = new CountObject();
        CountObject obj3 = new CountObject();
        obj3.display();
    }
}
