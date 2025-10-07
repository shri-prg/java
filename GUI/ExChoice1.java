import java.awt.*;
import java.awt.event.*;
public class ExChoice1 extends Frame implements ItemListener {
        Choice c;
        Label l;
        public ExChoice1(){
            setVisible(true);
            setSize(400,400);
            setTitle("Choice Example");
            setLayout(null);
            //window closing event
            this.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent we){
                    System.exit(0);
                }
            });
            Font f = new Font("Arial",Font.BOLD,15);
            //creating choice
            c = new Choice();
            c.setBounds(100, 100, 100, 50);
            c.setFont(f);
            //adding items to choice
            c.add("C");
            c.add("C++");
            c.add("Java");
            c.add("Python");
            //creating label
            l = new Label("Select your programming language");
            l.setFont(f);
            l.setAlignment(Label.CENTER);
            l.setSize(400,100);
            l.setBackground(Color.YELLOW);
            l.setBounds(50, 20, 300, 50);
            //adding choice and label to frame
            add(c);
            add(l);
            //adding item listener to choice
            c.addItemListener(this);
        }
        public void itemStateChanged(ItemEvent e){
            String str = c.getSelectedItem();
            l.setText(str + " is selected");
        }
        public static void main(String[] args) {
            new ExChoice1();
        }
    
}
