import java.awt.*;
import java.awt.event.*;
public class MYMouseListener extends Frame implements MouseListener {
    MYMouseListener(String s) {
        setTitle(s);
        setSize(400, 400);
        setLayout(null);
        setBackground(Color.cyan);
        setVisible(true);
        //adding mouse listener
        addMouseListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {  
                System.out.println("Window Closing");
                System.exit(0);
            }
        });
    }
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked at: " + e.getX() + ", " + e.getY());
    }
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed at: " + e.getX() + ", " + e.getY());
    }
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released at: " + e.getX() + ", " + e.getY());
    }
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered at: " + e.getX() + ", " + e.getY());
    }
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited at: " + e.getX() + ", " + e.getY());
    }
    public static void main(String args[]) {
        new MYMouseListener("Mouse Listener Demo");
    }
    
}
