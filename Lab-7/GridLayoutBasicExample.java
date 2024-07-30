import java.awt.*;

public class GridLayoutBasicExample extends Frame {
    public GridLayoutBasicExample(String title) {
        setLayout(new GridLayout(3, 2));
        add(new Button("1"));
        add(new Button("2"));
        add(new Button("3"));
        add(new Button("4"));
        add(new Button("5"));
        add(new Button("6"));

    }

    public static void main(String args[]) {

        GridLayoutBasicExample gl = new GridLayoutBasicExample("GridLayout Basic Example");
        gl.setSize(300, 200);
        gl.setVisible(true);

    }
}
