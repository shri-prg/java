import java.awt.*;
import java.awt.event.*;

public class Exchoice2 extends Frame implements ItemListener, ActionListener {
    Choice c;
    Button b1, b2, b3;
    TextField tf;
    Label label;

    public Exchoice2() {
        setTitle("User manually add menu");
        setSize(500, 500);
        setLayout(null);

        Font f = new Font("consolas", Font.BOLD, 15);

        // Label
        label = new Label();
        label.setAlignment(Label.CENTER);
        label.setFont(f);
        label.setBounds(50, 20, 400, 30);
        add(label);

        // Choice
        c = new Choice();
        c.setFont(f);
        c.setBounds(200, 220, 100, 30);
        add(c);

        // TextField
        tf = new TextField("Enter an item");
        tf.setFont(f);
        tf.setBounds(200, 100, 170, 30);
        add(tf);

        // Buttons
        b1 = new Button("ADD");
        b1.setFont(f);
        b1.setBounds(50, 150, 100, 30);
        add(b1);

        b2 = new Button("REMOVE");
        b2.setFont(f);
        b2.setBounds(200, 150, 100, 30);
        add(b2);

        b3 = new Button("REMOVEALL");
        b3.setFont(f);
        b3.setBounds(350, 150, 100, 30);
        add(b3);

        // Listeners
        c.addItemListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        label.setText("Select Item ---> " + c.getSelectedItem());
    }

    public void actionPerformed(ActionEvent e) {
        String button_label = e.getActionCommand();
        if (button_label.equals("ADD")) {
            String item = tf.getText();
            c.add(item);
            label.setText("Item added ----> " + item);
        }
        if (button_label.equals("REMOVE")) {
            String selected_item = c.getSelectedItem();
            
                c.remove(selected_item);
                label.setText("Selected Item Removed ----> " + selected_item);
            
        }
        if (button_label.equals("REMOVEALL")) {
            c.removeAll();
            label.setText("Removed all items from the choice menu");
        }
    }

    public static void main(String[] args) {
        new Exchoice2();
    }
}
