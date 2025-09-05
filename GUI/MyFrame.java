import java.awt.*;

public class MyFrame extends Frame {
    TextField tf; // object of TextField
    Button b;// object of Button
    Label l;//  object of Label
    // constructor
    MyFrame(String s){
        setTitle(s);// set title of frame
        tf=new TextField();// create text field using TextField class object
        b=new Button("Click");// create button  using Button class object
        l=new Label("Enter Name");//  create label using Label class object
        // add all the components to frame
        add(tf);
        add(l);
        add(b);
        setSize(500,600);// set size of frame
        // set location of components
        tf.setBounds(40,100,80,30);
        b.setBounds(40,150,60,30);
        l.setBounds(150,100,80,30);
        setLayout(null);// no layout manager
        setVisible(true);// set frame visible
    }
    public static void main(String[] args) {
        new MyFrame("My Frame");// create frame object
    }
    
}
