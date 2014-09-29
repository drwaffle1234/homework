package messageBase;

import java.awt.Button;

import java.awt.TextField;
import java.awt.TextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;


public class Chat extends JApplet implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TextField ECTB; //encode text box
	TextField DCTB; //decode text box
	TextField TOP;
	TextField MIDDLE;
	TextField INNER;
	TextField MESSAGE;
	TextArea MessageBox;
	Button encode;
	Button decode;
	
	public void init() {
		setSize(300, 350);
		setLayout(null);
		encode = new Button("encode");
		encode.setSize(50, 25);
		encode.setLocation(30,25);
		
		decode = new Button("decode");
		decode.setSize(50,25);
		decode.setLocation(30,50);
		
		TOP = new TextField("TOP");
		TOP.setSize(250, 25);
		TOP.setLocation(30,250);
		
		MIDDLE = new TextField("MIDDLE");
		MIDDLE.setSize(250, 25);
		MIDDLE.setLocation(30,275);
		
		INNER = new TextField("INNER");
		INNER.setSize(250, 25);
		INNER.setLocation(30,300);
		
		MESSAGE = new TextField("MESSAGE");
		MESSAGE.setSize(100, 25);
		MESSAGE.setLocation(90,20);
		
		MessageBox= new TextArea("MESSAGE");
		MessageBox.setSize(200, 140);
		MessageBox.setLocation(90,60);
		
		add(encode);
		add(decode);
		add(TOP);
		add(MIDDLE);
		add(INNER);
		add(MESSAGE);
		add(MessageBox);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==encode){
			
		}
		
	}
}
