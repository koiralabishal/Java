
//SerializeDemo. java
import java.io.*;

public class SerializeDemo {
    public static void main(String[] args) {
        Student e = new Student();
        e.name = "Bishal Koirala";
        e.address = "Pokhara, Nepal";
        e.regNum = 745;
        e.number = 101;
        try {
            FileOutputStream fileOut = new FileOutputStream("Students.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved as Students.ser \n");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}