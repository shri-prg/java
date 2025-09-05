import java.awt.*;
class Calc extends Frame{
TextField tf;
String[] labels={"C","CE","1/x","x^2","xroot","=","+","*","/","0","1","2","3","4","5","6","7","8","9"};
Button [] buttons=new Button[labels.length];
Calc(String s){
    setTitle(s);    
	setLayout(new GridLayout(5,4,5,5));
		setSize(400,400);
		tf= new TextField(20);
		add(tf,BorderLayout.NORTH);
		for(int i=0;i<labels.length;i++){
			buttons[i]=new Button(labels[i]);
			add(buttons[i],BorderLayout.CENTER);
		}
		setVisible(true);
	}
	public static void main(String args[]){
		new Calc("Calculator");
	}
}
		
                		