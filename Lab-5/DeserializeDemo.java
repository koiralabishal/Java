
//DeserializeDemo. java
import java.io.*;

public class DeserializeDemo {
    public static void main(String[] args) {
        {
            Student e = null;
            try {
                FileInputStream fileIn = new FileInputStream("Students.ser");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                e = (Student) in.readObject();
                in.close();
                fileIn.close();
            } catch (IOException i) {
                i.printStackTrace();
                return;
            } catch (ClassNotFoundException c) {
                System.out.println("Student class not found");
                c.printStackTrace();
                return;
            }
            System.out.println("Deserialized Student...");
            System.out.println("Name: " + e.name);
            System.out.println("Address: " + e.address);
            System.out.println("Reg Num: " + e.regNum);
            System.out.print("\nThe value of regNum is 745. But in our output its value is Zero because ");
            System.out.print("regNum is transient variable. Transient variable are not helping in the serialization process. ");
            System.out.print("But throughtout deserialization, the values of transient variables are set to the default value.");
            System.out.print("\n\nNumber: " + e.number);
        }
    }
}