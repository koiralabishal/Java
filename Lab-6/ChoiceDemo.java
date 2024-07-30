import java.awt.*;
import java.awt.event.*;

public class ChoiceDemo extends Frame implements ItemListener {
    private LayoutManager Layout;
    private Choice Selector;
    private Font SansSerif;

    public ChoiceDemo() {
        String[] ColorList;
        int i;
        ColorList = new String[9];
        SansSerif = new Font("SansSerif", Font.BOLD, 14);
        Layout = new FlowLayout();
        Selector = new Choice();
        ColorList[0] = "Red";
        ColorList[2] = "Blue";
        ColorList[4] = "Green";
        ColorList[6] = "White";
        ColorList[1] = "Magenta";
        ColorList[3] = "Cyan";
        ColorList[5] = "Yellow";
        ColorList[7] = "Gray";
        ColorList[8] = "Black";
        for (i = 0; i < ColorList.length; ++i) {
            Selector.insert(ColorList[i], i);
        }
        Selector.setBackground(Color.yellow);
        Selector.setForeground(Color.red);
        Selector.setFont(SansSerif);
        setLayout(Layout);
        add(Selector);
        Selector.addItemListener(this);
        Selector.select(5);
        setBackground(Color.yellow);
    }

    public void itemStateChanged(ItemEvent e) {
        int Selection;
        Selection = Selector.getSelectedIndex();
        if (Selection == 0) {
            setBackground(Color.red);
        } else if (Selection == 1) {
            setBackground(Color.magenta);
        } else if (Selection == 2) {
            setBackground(Color.blue);
        } else if (Selection == 3) {
            setBackground(Color.cyan);
        } else if (Selection == 4) {
            setBackground(Color.green);
        } else if (Selection == 5) {
            setBackground(Color.yellow);
        } else if (Selection == 6) {
            setBackground(Color.white);
        } else if (Selection == 7) {
            setBackground(Color.gray);
        } else if (Selection == 8) {
            setBackground(Color.black);
        }
    }

    public static void main(String[] args) {
        ChoiceDemo cd = new ChoiceDemo();
        cd.setVisible(true);
        cd.setSize(300, 300);
    }
}