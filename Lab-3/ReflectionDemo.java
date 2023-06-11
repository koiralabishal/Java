import java.lang.reflect.Method;

class Demo{
    void show(){

    }

    void display(){

    }
}


public class ReflectionDemo {
    public static  void main(String str[])
    {
        Demo d = new Demo();
        Class c = d.getClass();
        String name = c.getName();
        System.out.println("Class Name: "+name);

        Method methods[] = c.getDeclaredMethods();
        for(Method m: methods){
            System.out.println("Method Name: "+m.getName());
        }
    }
}
