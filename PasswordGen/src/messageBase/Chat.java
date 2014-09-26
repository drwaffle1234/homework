package messageBase;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.CheckboxGroup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.SwingWorker;

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
		MESSAGE.setLocation(90,100);
		
		add(encode);
		add(decode);
		add(TOP);
		add(MIDDLE);
		add(INNER);
		add(MESSAGE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
