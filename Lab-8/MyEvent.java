import javax.swing.*;
import java.awt.event.*;

public class MyEvent extends JFrame {
    JButton b1;

    
    public static void main(String arg[]) {
        MyEvent event = new MyEvent();
    }

    
    public MyEvent() {
        super("Window Title: Event Handling");
        b1 = new JButton("Click Me");
        
        getContentPane().add(b1);
        
        ButtonListener listen = new ButtonListener();
        b1.addActionListener(listen);
        
        setVisible(true);
        setSize(200, 200);
    }

    
    class ButtonListener implements ActionListener {
        
        public void actionPerformed(ActionEvent evt) {
            JButton source = (JButton) evt.getSource();
            source.setText("Button Clicked!");
        }
    }
}
