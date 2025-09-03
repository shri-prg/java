// Java AWT Example to create a Frame with Label, TextField and Button
// and set size of frame according to screen size
import java.awt.*;
class MyFrame1 extends Frame{
    Label l;
    TextField tf;
    Button b;
    MyFrame1(String s){
        setTitle(s);
        l=new Label("Enter Name");
        tf=new TextField();
        b=new Button("Click");
        add(tf);
        add(l); 
        add(b);
        tf.setBounds(40,100,80,30);
        b.setBounds(40,150,60,30);  
        l.setBounds(150,100,80,30);
        // to set size of frame according to screen size
        Toolkit t= Toolkit.getDefaultToolkit();
        // to get screen size
        Dimension screeDimension=t.getScreenSize();
        // set size of frame 80% of screen size
        int width=screeDimension.width*8/10;
        int height=screeDimension.height*8/10;
        // set size and location of frame
        setBounds(width/8,height/8,width,height);
        setLayout(null);
        setVisible(true);
        }
        public static void main(String[] args) {
            MyFrame1 f1=new MyFrame1("My Frame1");// create frame object
        }
    
}
