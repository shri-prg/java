import java.awt.*;
import java.awt.event.*;
 public class Card extends Frame implements ActionListener {
    CardLayout card;
    Button b1,b2,b3;
    public Card(){
        setVisible(true);
        setSize(400,400);
        setTitle("Card Layout");
        card = new CardLayout();
        setLayout(card);
        //window closing event
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
        Font f = new Font("Arial",Font.BOLD,20);

        //creating buttons
        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
        b1.setFont(f);
        b1.setBackground(Color.RED);
        b2.setFont(f);
        b2.setBackground(Color.GREEN);
        b3.setFont(f);
        b3.setBackground(Color.BLUE);
        //adding buttons to frame
        add(b1);        
        add(b2);
        add(b3);

        //adding action listener to buttons
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){
        card.next(this);
    }
    public static void main(String[] args){
        Card card = new Card();
    }
}
