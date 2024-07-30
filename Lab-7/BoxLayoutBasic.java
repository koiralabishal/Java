import java.awt.*;
import javax.swing.*; // for BoxLayout

public class BoxLayoutBasic extends Frame {
    public BoxLayoutBasic(String title) {

        setLayout(new BoxLayout(this, BoxLayout.X_AXIS)); // Set Box Layout
        // BoxLayout.X AXIS : horizontally add buttons
        // BoxLayout.Y AXIS : vertically add buttons

        add(new Button("1"));

        add(new Button("2"));

        add(new Button("3"));

        add(new Button("4"));

        add(new Button("5"));

        add(new Button("6"));
    }

    public static void main(String args[]) {
        BoxLayoutBasic blb = new BoxLayoutBasic("SoxLayout Basic");

        blb.setSize(300, 200);
        blb.setVisible(true);
    }
}


//In conclusion, the layout management in the Java lab provided 
//a comprehensive understanding of organizing and arranging GUI components within a graphical user interface.
//During the lab, we explored various layout managers available 
//in Java, such as FlowLayout, BorderLayout, GridLayout, and GridBagLayout. 