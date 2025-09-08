import java.awt.*;
import java.awt.event.*;
public class windowListenerAdapter extends Frame {
    windowListenerAdapter(String s) {
        setTitle(s);
        setSize(400, 400);
        setLayout(null);
        setBackground(Color.cyan);
        setVisible(true);
        //adding window listener
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {  
                System.out.println("Window Closing");
                System.exit(0);
            }
            public void windowOpened(WindowEvent e) {
                System.out.println("Window Opened");
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
        });
    }
    public static void main(String args[]) {
        new windowListenerAdapter("Window Listener Adapter Demo");
    }
    
}
