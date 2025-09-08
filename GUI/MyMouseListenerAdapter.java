import java.awt.*;
import java.awt.event.*;
public class MyMouseListenerAdapter extends Frame {
    MyMouseListenerAdapter(String s) {
        setTitle(s);
        setSize(400, 400);
        setLayout(null);
        setBackground(Color.cyan);
        setVisible(true);
        //adding mouse listener using adapter
        addMouseListener(new MouseAdapter() {
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
        });
        //adding window listener
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {  
                System.out.println("Window Closing");
                System.exit(0);
            }
        });
    }
    public static void main(String args[]) {
        new MyMouseListenerAdapter("Mouse Listener Adapter Demo");
    }
    
}
