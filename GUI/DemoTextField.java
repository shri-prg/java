import java.awt.*;
public class DemoTextField extends Frame{
    TextField tf;//Text Field object
    Label l;//Label objrct
    DemoTextField(String s){
        setTitle(s);//frame title
        l=new Label("Text Field Example");//Label
        l.setBounds(100,70,100,30);//x axis, y axis, width, height
        setSize(400,400);//frame size 300 width and 300 height
        tf=new TextField();//Text Field
        tf.setText("Hello World");//Default Text
        tf.setBounds(100,100,100,30);//x axis, y axis, width, height
        add(tf);//add text field to frame
        add(l); //add label to frame
        Font f=new Font("Arial",Font.BOLD,15);//Font for text field
        tf.setFont(f);//setting font to text field
        setLayout(null);//no layout
        setVisible(true);//now frame will be visible, by default not visible
    }
    public static void main(String args[]){
        new DemoTextField("TextField Demo");
    }
    
}
