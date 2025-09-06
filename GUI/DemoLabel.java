import java.awt.*;
public class DemoLabel extends Frame{
    Label l;//Label object
    DemoLabel(String s){
        setTitle(s);//frame title
        setSize(400,400);//frame size 300 width and 300 height
        l=new Label("Hello World");//Label
        l.setBounds(100,100,100,30);// x axis, y axis, width, height
        add(l);//add label to frame
        setLayout(null);//no layout
        setVisible(true);//now frame will be visible, by default not visible
    }
    public static void main(String args[]){
        new DemoLabel("Label Demo");//creating instance of Frame class
    }
    
}
