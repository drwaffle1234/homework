package problemS;


import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Runner extends JApplet implements ActionListener {
	private static final long serialVersionUID = 1L;

	private static int X=250;

	private static int Y = 100;
	private int x = 25;
	Button math1;
	Button math2;
	Button math3;
	Button math4;

	public void init() {
		setSize(300, 350);
		setLayout(null);

		math1 = new Button("add");
		math1.setSize(25, 25);
		math1.setLocation(25, 25);// 25

		math2 = new Button("sub");
		math2.setSize(25, 25);
		math2.setLocation(50 + x, 25);// 75

		math3 = new Button("div");
		math3.setSize(25, 25);
		math3.setLocation(100 + x, 25);// 125

		math4 = new Button("mult");
		math4.setSize(29, 25);
		math4.setLocation(150 + x, 25);// 175

		add(math1);
		add(math2);
		add(math3);

		add(math4);

		math1.addActionListener(this);
		math2.addActionListener(this);
		math3.addActionListener(this);
		math4.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent evt) {
		
		if (evt.getSource() == math1) {
			String x = 
			        JOptionPane.showInputDialog ( "Enter x integer" ); 
			String y = 
			        JOptionPane.showInputDialog ( "Enter y integer" ); 
			int show=work.add(par(x), par(y));
			JOptionPane.showMessageDialog(null,show);
		}else if(evt.getSource() == math2){
			String x = 
			        JOptionPane.showInputDialog ( "Enter x integer" ); 
			String y = 
			        JOptionPane.showInputDialog ( "Enter y integer" ); 
			int show=work.sub(par(x), par(y));
			JOptionPane.showMessageDialog(null,show);
		}else if(evt.getSource() == math3){
			String x = 
			        JOptionPane.showInputDialog ( "Enter x integer" ); 
			String y = 
			        JOptionPane.showInputDialog ( "Enter y integer" ); 
			int show=work.div(par(x), par(y));
			JOptionPane.showMessageDialog(null,show);
		}else if(evt.getSource() == math4){
			String x = 
			        JOptionPane.showInputDialog ( "Enter x integer" ); 
			String y = 
			        JOptionPane.showInputDialog ( "Enter y integer" ); 
			int show=work.mult(par(x), par(y));
			JOptionPane.showMessageDialog(null,show);
		}else{
			System.out.println("error");
		}
	}

	public static void main(String[] args) {

		Runner.run(new Runner(), X, Y);

	}

	public static void run(JApplet applet, int width, int height) {

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(applet);
		frame.setSize(width, height);
		applet.init();
		applet.start();
		frame.setTitle("Problem Helper");
		frame.setVisible(true);
	}

	public static int sleep(int value) {
		try {
			Thread.sleep(value); // 1000 milliseconds is one second.
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		return value;
	}
	public static int par(String number){
		int intnumber = Integer.parseInt(number);
		return intnumber;
	}

}
