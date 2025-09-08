import java.awt.*;

public class DemoTextField extends Frame {
    TextField tf, tf1;
    Label l, l1;

    DemoTextField(String s) {
        setTitle(s);
        setSize(400, 400);
        setLayout(null);

        // Label for normal text field
        l = new Label("Text Field Example");
        l.setBounds(100, 70, 150, 30);
        add(l);

        // Normal text field
        tf = new TextField();
        tf.setText("Hello World");
        tf.setEditable(false);//it shows that text field is not editable
        tf.setBounds(100, 100, 150, 30);
        tf.setFont(new Font("Arial", Font.BOLD, 15));
        add(tf);

        // Label for password field
        l1 = new Label("Password Field Example");
        l1.setBounds(100, 140, 180, 30);
        add(l1);

        // Password text field
        tf1 = new TextField(30);
        
        System.out.println(tf1.isEditable());//it shows that text field is editable
        tf1.setBounds(100, 170, 150, 30);
        tf1.setEchoChar('*');
        add(tf1);

        setVisible(true);
    }

    public static void main(String args[]) {
        new DemoTextField("TextField Demo");
    }
}
