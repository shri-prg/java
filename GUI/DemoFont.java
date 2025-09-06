import java.awt.*;
public class DemoFont extends Frame {
    DemoFont(String s){
        setTitle(s);//frame title
        setSize(400,400);//frame size 300 width and 300 height
        setVisible(true);//now frame will be visible, by default not visible
        setBackground(Color.cyan);//frame background color
    }
    public void paint(Graphics g){//paint method
        Font f=new Font("Arial",Font.BOLD,20);//Font for text field
        g.setFont(f);//setting font to text field
        g.setColor(Color.white);// setting color to text
        g.drawString("Hello Shridhar",50,100);//drawing string
        g.fillRect(100,150,100,50);//drawing rectangle
        
    }
    public static void main(String args[]){
        new DemoFont("Font Demo");//creating instance of Frame class
    }
    
}
