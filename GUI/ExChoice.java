import java.awt.*;
import java.awt.event.*;
public class ExChoice extends Frame {
        Choice c;
        public ExChoice(){
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
            //adding choice to frame
            add(c);
        }
        public static void main(String[] args) {
            ExChoice ch = new ExChoice();
        }
    
}
