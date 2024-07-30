import java.awt.*;
import java.awt.event.*;

public class TextAreaDemo extends Frame implements TextListener {
    /* Declaration */
    private TextArea ta1;
    private TextArea ta2;
    private LayoutManager Layout;

    public TextAreaDemo() {
        /* Instantiation */
        ta1 = new TextArea(2, 40);
        ta2 = new TextArea(2, 40);
        Layout = new FlowLayout();
        /* Configuration */
        ta1.addTextListener(this);
        ta2.setEditable(false);
        /* Location */
        setLayout(Layout);
        add(ta1);
        add(ta2);
        /* Decoration */
        setBackground(Color.yellow);
        ta1.setBackground(Color.green);
        ta1.setText("Enter text in this area and watch!");
    }

    public void textValueChanged(TextEvent e) {
        String Entry;
        Entry = ta1.getText();
        ta2.setText(Entry);
    }

    public static void main(String[] args) {
        TextAreaDemo t = new TextAreaDemo();
        t.setVisible(true);
        t.setSize(500, 200);
    }
}


//In conclusion, the GUI control in Java lab provided a comprehensive 
//understanding of creating graphical user interfaces for Java applications.
//During the lab, we explored various GUI components and their 
//functionalities, such as buttons, labels, text fields, checkboxes, radio buttons, and drop-down menus.