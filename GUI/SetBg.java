import java.awt.*;
class SetBg extends Frame {
    SetBg(String s) {
        setTitle(s);
        setSize(400, 400);
        setBackground(Color.cyan);
        //or another way
        //setBackground(new Color(0,255,255));
        //or
        //setBackground(new Color(0x00FFFF));
        //or
       //Color c=new Color(0,255,255);
        //setBackground(c); 
        setVisible(true);
    }

    public static void main(String args[]) {
        new SetBg("Set Background Color");
    }
    
}
