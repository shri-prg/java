import java.awt.*;
import java.awt.event.*;
class SI_CALC extends Frame implements ActionListener{
	Button b1,b2;
	TextField tf1,tf2,tf3,tf4,tf5;
	Label l1,l2,l3,l4,l5;

	public SI_CALC(){
		setTitle("Simple Interest Calculator");
		setVisible(true);
		
		setSize(900,900);
		setLayout(null);
		Font f = new Font("Arial",Font.BOLD,20) ;

		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});

		l1=new Label("Principle");
		l1.setFont(f);
		l1.setBounds(50,50,100,30);
		l2=new Label("Rate");
		l2.setFont(f);
		l2.setBounds(50,100,100,30);
		l3=new Label("Time");
		l3.setFont(f);
		l3.setBounds(50,150,100,30);
		l4=new Label("Simple Interest");
		l4.setFont(f);
		l4.setBounds(50,200,100,30);
		l5=new Label("Amount");
		l5.setFont(f);
		l5.setBounds(50,250,100,30);
		tf1=new TextField("Enter the Principle");
		tf1.setFont(f);
		tf1.setBounds(200,50,200,40);
		tf2=new TextField("Enter the Rate");
		tf2.setFont(f);
		tf2.setBounds(200,100,200,40);
		tf3=new TextField("Enter the Time");
		tf3.setFont(f);
		tf3.setBounds(200,150,200,40);
		tf4=new TextField();
		tf4.setEditable(false);
		tf4.setFont(f);
		tf4.setBounds(200,200,200,40);
		tf5=new TextField();
		tf5.setEditable(false);
		tf5.setFont(f);
		tf5.setBounds(200,250,200,40);

		//creating button
		b1=new Button("Clear");
		b1.setFont(f);
		b1.setBounds(50,350,100,40);
		
		b2=new Button("Calculate");
		b2.setFont(f);
		b2.setBounds(300,350,150,40);

		//adding components
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(tf1);
		add(tf2);
		add(tf3);
		add(tf4);
		add(tf5);
		add(b1);
		add(b2);

		b1.addActionListener(this);
		b2.addActionListener(this);
		
		
	}
	public void actionPerformed(ActionEvent e){
		Button clickButton =(Button)e.getSource();
		String clickButtonLabel=clickButton.getLabel();
		if(clickButtonLabel.equals("Calculate"))
		{
			//Declaration
			float p,si,amount;
			int rate,time;

			p=Float.parseFloat(tf1.getText());
			rate=Integer.parseInt(tf2.getText());
			time=Integer.parseInt(tf3.getText());
			// Simple Interset calculation
			si=(p*rate*time)/100;
			tf4.setText(Float.toString(si));
			// calculation of amount
			amount=si+p;
			tf5.setText(Float.toString(amount));



		}
		else
		{
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf4.setText("");
			tf5.setText("");
		}


	}

	public static void main(String [] args){
		SI_CALC si1=new SI_CALC();
	}
} 