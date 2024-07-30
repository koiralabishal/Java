import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CardLayoutBasicExample extends JFrame implements ActionListener {
    CardLayout card;
    JButton b1, b2, b3, b4;
    Container c;

    CardLayoutBasicExample() {

        c = getContentPane(); // Gets the content pane layer so that we can add elements to it
        card = new CardLayout(40, 30);
        // create CardLayout object with 40 hor space and 30 ver space
        c.setLayout(card);

        b1 = new JButton("Ace");
        b2 = new JButton("King");
        b3 = new JButton("Queen");
        b4 = new JButton("Jocker");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);

    }

    public void actionPerformed(ActionEvent e) {
        card.next(c);
    }

    public static void main(String[] args) {
    CardLayoutBasicExample cl=new CardLayoutBasicExample() ;
    cl.setSize(500,400);
    cl.setVisible(true) ;
    //cl. setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}