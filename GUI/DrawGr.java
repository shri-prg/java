import java.awt.*;
class DrawGr extends Frame {
    //constructor
    DrawGr(String s){
        setTitle(s);
        setSize(400,400);
        setVisible(true);
        setBackground(Color.cyan);
    }
    //override paint method
    public void paint(Graphics g){
        //draw a string
        g.drawString("Hello Shridhar",30,50);
        //draw rectangle
        g.drawRect(60, 60, 56, 76);
        //draw oval
        g.drawOval(200, 50, 56, 76);
        //draw filled oval
        g.fillOval(200, 200, 56, 76);
        //draw filled rectangle
        g.fillRect(50, 200, 56, 76);
        //draw line
        g.drawLine(300,256,250,300);
    }
    public static void main(String args[]){
        new DrawGr("Draw Graphics");
    }
}
