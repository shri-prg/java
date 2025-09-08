import java.awt.*;
import java.awt.event.*;
public class windowListener extends Frame implements WindowListener {
    windowListener(String s) {
        setTitle(s);
        setSize(400, 400);
        setLayout(null);
        setBackground(Color.cyan);
        setVisible(true);
        //adding window listener
        addWindowListener(this);
    }
public void windowOpened(WindowEvent e) {
    System.out.println("Window Opened");
}
public void windowClosing(WindowEvent e) {  
    System.out.println("Window Closing");
    System.exit(0);
}
public void windowClosed(WindowEvent e) {               
    System.out.println("Window Closed");
}
public void windowIconified(WindowEvent e) {
    System.out.println("Window Iconified");
}
public void windowDeiconified(WindowEvent e) {
    System.out.println("Window Deiconified");
}
public void windowActivated(WindowEvent e) {
    System.out.println("Window Activated");
}
public void windowDeactivated(WindowEvent e) {
    System.out.println("Window Deactivated");
}
    public static void main(String args[]) {
        new windowListener("Window Listener Demo");
    }
    

}
