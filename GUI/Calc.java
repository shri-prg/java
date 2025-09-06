import java.awt.*;
class Calc extends Frame{
	TextField tf;//Text Field object
//Button labels
String[] labels={"C","CE","1/x","x^2","xroot","=","+","*","/","0","1","2","3","4","5","6","7","8","9"};
//Button array
Button [] buttons=new Button[labels.length];
Calc(String s){
    setTitle(s);  //frame title  
	setLayout(new GridLayout(5,4,5,5));//5 rows and 4 columns
		setSize(400,400);//frame size 300 width and 300 height
		tf= new TextField(20);//Text Field
		add(tf);//add text field to frame
		for(int i=0;i<labels.length;i++){//creating buttons and adding to frame
			buttons[i]=new Button(labels[i]);//Button
			add(buttons[i],BorderLayout.CENTER);//add button to frame
		}
		setVisible(true);//now frame will be visible, by default not visible
	}
	public static void main(String args[]){
		new Calc("Calculator");
	}
}
		
                		