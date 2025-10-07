import java.awt.*;
import java.awt.event.*;
public class CheckboxDemo extends Frame implements ItemListener {
    Checkbox cb1,cb2,cb3;
    Label l;
    public CheckboxDemo(){
        setVisible(true);
        setSize(400,400);
        setTitle("Checkbox Example");
        setLayout(null);
        //window closing event
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
        Font f = new Font("Arial",Font.BOLD,15);
        //creating checkbox group
        CheckboxGroup cbg = new CheckboxGroup();
        //creating checkboxes
        cb1 = new Checkbox("C++",cbg,false);
        cb1.setBounds(100, 100, 100, 50);

        cb2 = new Checkbox("Java",cbg,false);
        cb2.setBounds(100, 150, 100, 50);
        cb3 = new Checkbox("Python",cbg,false   );
        cb3.setBounds(100, 200, 100, 50);
        cb1.setFont(f);
        cb2.setFont(f);
        cb3.setFont(f);

        //creating label
        l = new Label("Select your programming language");
        l.setFont(f);
        l.setAlignment(Label.CENTER);
        l.setSize(60,100);
        l.setBackground(Color.YELLOW);
        l.setBounds(50, 20, 300, 50);

        //adding checkboxes and label to frame
        add(l);
        add(cb1);        
        add(cb2);
        add(cb3);

        //adding item listener to checkboxes
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e){
        Checkbox cb = (Checkbox)e.getItemSelectable();
        
        if(cb1.getState()==true){
            l.setText("C++ is selected");
        }
        if(cb2.getState()==true){
            l.setText("Java is selected");
            
        }
        if(cb3.getState()==true){
            l.setText("Python is selected");
        }
    
    }
    public static void main(String[] args){
        CheckboxDemo check = new CheckboxDemo();
    }
    
}
