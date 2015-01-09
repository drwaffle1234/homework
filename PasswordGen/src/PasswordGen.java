import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.CheckboxGroup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.BorderFactory;
import javax.swing.JProgressBar;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.SwingWorker;

/**
 * Password Gen
 * 
 * @author leebob
 * 
 */
public class PasswordGen extends JApplet implements ActionListener,
		PropertyChangeListener {
	private static final long serialVersionUID = 1L;
	private boolean debugMode = true;
	private boolean settingsMode = false;
	private boolean debugModeOnOff = false;
	data Data = new data();

	private int x = 100;
	private int number;
	private Task task;

	Button okButton;
	Button clear;
	Button debug;
	Button fast;
	Button settings;
	Button debugAble;
	Button PBColor;
	
	TextField nameField;
	TextField passwordL;
	TextField fastPWONOFF;
	TextField PBnumber;
	TextField mesge2;
	TextArea mesge;
	
	JProgressBar pb;

	Checkbox radio1;
	Checkbox radio2;
	Checkbox radio3;
	Checkbox radio4;

	Checkbox radio11;
	Checkbox radio22;
	Checkbox radio33;
	Checkbox radio44;
	Checkbox radio55;
	Checkbox radio66;

	@SuppressWarnings("deprecation")
	public void init() {
		setSize(300, 350);
		setLayout(null);
		CheckboxGroup BPC = new CheckboxGroup();
		okButton = new Button("Gen");
		okButton.setSize(30, 25);
		okButton.setLocation(60, x - 75);

		clear = new Button("clear");
		clear.setSize(45, 25);
		clear.setLocation(130, x - 75);

		debug = new Button("Debug");
		debug.setSize(45, 25);
		debug.setLocation(190, x - 75);
		debug.hide();

		fast = new Button("FASTPW");
		fast.setSize(55, 25);
		fast.setLocation(30, x + 25);
		fast.hide();

		settings = new Button("Settings");
		settings.setSize(50, 25);
		settings.setLocation(5, x - 75);

		debugAble = new Button("debug on");
		debugAble.setSize(50, 25);
		debugAble.setLocation(5, x - 50);
		debugAble.hide();

		PBColor = new Button("PB Color");
		PBColor.setSize(50, 25);
		PBColor.setLocation(5, x - 25);
		PBColor.hide();

		fastPWONOFF = new TextField(Data.getSfastPW());
		fastPWONOFF.setSize(40, 25);
		fastPWONOFF.setLocation(90, x + 25);
		fastPWONOFF.disable();
		fastPWONOFF.hide();

		PBnumber = new TextField("0");
		PBnumber.setForeground(Color.black);
		PBnumber.setSize(25, 25);
		PBnumber.setLocation(30, x + 175);
		PBnumber.enable();
		PBnumber.hide();

		nameField = new TextField("password here");
		nameField.setSize(100, 25);
		nameField.setLocation(150, x + 150);

		passwordL = new TextField("");
		passwordL.setSize(100, 25);
		passwordL.setLocation(90, x - 25);

		mesge2 = new TextField("enter a length ^");
		mesge2.setSize(120, 25);
		mesge2.setLocation(30, x + 50);
		mesge2.disable();
		mesge2.hide();

		mesge = new TextArea("enter a length ^");
		mesge.setSize(120, 100);
		mesge.setLocation(30, x + 25);
		mesge.disable();

		// mesge.enable();
		pb = new JProgressBar();
		pb.setSize(100, 25);
		pb.setLocation(30, x + 150);
		Border border = BorderFactory.createLineBorder(Color.black, 2);
		pb.setBorder(border);
		pb.setBackground(Color.white);
		pb.setForeground(Color.blue);
		pb.setMinimum(0);

		radio1 = new Checkbox("Lower Case", true);
		radio1.setSize(100, 25);
		radio1.setLocation(170, x + 25);

		radio2 = new Checkbox("Upper Case", true);
		radio2.setSize(100, 25);
		radio2.setLocation(170, x + 50);

		radio3 = new Checkbox("1234...", true);
		radio3.setSize(100, 25);
		radio3.setLocation(170, x + 75);

		radio4 = new Checkbox("!@#$%....", false);
		radio4.setSize(100, 25);
		radio4.setLocation(170, x + 100);

		radio11 = new Checkbox("Lower Case", BPC, true);
		radio11.setSize(100, 25);
		radio11.setLocation(170, x + 25);
		radio11.hide();

		radio22 = new Checkbox("Upper Case", BPC, false);
		radio22.setSize(100, 25);
		radio22.setLocation(170, x + 50);
		radio22.hide();

		radio33 = new Checkbox("1234...", BPC, false);
		radio33.setSize(100, 25);
		radio33.setLocation(170, x + 75);
		radio33.hide();

		radio44 = new Checkbox("!@#$%....", BPC, false);
		radio44.setSize(100, 25);
		radio44.setLocation(170, x + 100);
		radio44.hide();

		radio55 = new Checkbox("Lower Case", BPC, true);
		radio55.setSize(100, 25);
		radio55.setLocation(170, x + 25);
		radio55.hide();

		radio66 = new Checkbox("Upper Case", BPC, false);
		radio66.setSize(100, 25);
		radio66.setLocation(170, x + 50);
		radio66.hide();

		add(okButton);
		add(clear);
		add(debug);
		add(fastPWONOFF);
		add(nameField);
		add(passwordL);
		add(mesge);
		add(fast);
		add(PBnumber);
		add(mesge2);
		add(settings);
		add(radio1);
		add(radio2);
		add(radio3);
		add(radio4);
		add(debugAble);
		add(PBColor);
		add(radio11);
		add(radio22);
		add(radio33);
		add(radio44);
		add(radio55);
		add(radio66);

		add(pb);
		PBColor.addActionListener(this);
		debugAble.addActionListener(this);
		settings.addActionListener(this);
		okButton.addActionListener(this);
		clear.addActionListener(this);
		debug.addActionListener(this);
		fast.addActionListener(this);
	}

	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent evt) {
		mesge.setText("Password being \nmade");
		mesge2.setText("Password being made");
		if (evt.getSource() == okButton) {
			okButton.disable();

			number = Integer.parseInt(passwordL.getText());
			pb.setMaximum(number);
			System.out.println(pb.getMaximum());
			task = new Task();
			task.addPropertyChangeListener(this);
			task.execute();

			mesge.setText("Password made");
			mesge2.setText("Password made");
			if (radio1.getState() == true & radio2.getState() == true
					& radio3.getState() == true & radio4.getState() == true) {
				nameField.setText(Data.F1234(number));
			} else if (radio1.getState() == true & radio2.getState() == true
					& radio3.getState() == true) {
				nameField.setText(Data.F123(number));
			} else if (radio2.getState() == true & radio3.getState() == true
					& radio4.getState() == true) {
				nameField.setText(Data.F234(number));

			} else if (radio1.getState() == true & radio3.getState() == true
					& radio4.getState() == true) {
				nameField.setText(Data.F134(number));

			} else if (radio1.getState() == true & radio2.getState() == true) {
				nameField.setText(Data.F12(number));
			} else if (radio2.getState() == true & radio3.getState() == true) {
				nameField.setText(Data.F23(number));
			} else if (radio1.getState() == true & radio3.getState() == true) {
				nameField.setText(Data.F13(number));
			} else if (radio3.getState() == true & radio4.getState() == true) {
				nameField.setText(Data.F34(number));
			} else if (radio1.getState() == true & radio4.getState() == true) {
				nameField.setText(Data.F14(number));
			} else if (radio2.getState() == true & radio4.getState() == true) {
				nameField.setText(Data.F24(number));
			} else if (radio1.getState() == true) {
				nameField.setText(Data.F1(number));
			} else if (radio2.getState() == true) {
				nameField.setText(Data.F2(number));
			} else if (radio3.getState() == true) {
				nameField.setText(Data.F3(number));
			} else if (radio4.getState() == true) {
				nameField.setText(Data.F4(number));
			} else {
				nameField.setText("error!!!");
			}
			okButton.enable();

		} else if (evt.getSource() == debug) {
			if (debugMode == false) {
				nameField.setText("debug on");
				fast.show();
				fastPWONOFF.show();
				mesge.hide();
				mesge2.show();
				PBnumber.show();
				debugMode = true;
			} else {
				nameField.setText("debug off");
				fast.hide();
				fastPWONOFF.hide();
				mesge.show();
				mesge2.hide();
				PBnumber.hide();
				debugMode = false;
			}
		} else if (evt.getSource() == fast) {
			if (Data.getfastPW() == true) {
				Data.setfastPW(false);
				fastPWONOFF.setText(Data.getSfastPW());
			} else {
				Data.setfastPW(true);
				fastPWONOFF.setText(Data.getSfastPW());
			}
		} else if (evt.getSource() == settings) {
			if (settingsMode == false) {
				okButton.hide();
				clear.hide();
				// debug.hide();
				fastPWONOFF.hide();
				nameField.hide();
				passwordL.hide();
				mesge.hide();
				fast.hide();
				PBnumber.hide();
				mesge2.hide();
				radio1.hide();
				radio2.hide();
				radio3.hide();
				radio4.hide();
				pb.hide();
				debugAble.show();
				PBColor.show();
				settingsMode = true;
			} else {
				okButton.show();
				clear.show();
				// debug.show();
				// fastPWONOFF.show();
				nameField.show();
				passwordL.show();
				mesge.show();
				// fast.show();
				// PBnumber.show();
				// mesge2.show();
				radio1.show();
				radio2.show();
				radio3.show();
				radio4.show();
				pb.show();
				debugAble.hide();
				PBColor.hide();
				settingsMode = false;
			}

		} else if (evt.getSource() == PBColor) {

		}

		else if (evt.getSource() == debugAble) {
			if (debugModeOnOff == false) {
				debug.show();
				debugModeOnOff = true;
			} else {
				debug.hide();
				debugModeOnOff = false;
			}

		} else {

			nameField.setText("clear");
			okButton.enable();
			pb.setValue(0);
		}

	}

	public static void main(String[] args) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				PasswordGen.run(new PasswordGen(), 300, 350);
			}
		});
	}

	public static void run(JApplet applet, int width, int height) {

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(applet);
		frame.setSize(width, height);
		applet.init();
		applet.start();
		frame.setTitle("Password Generator");
		frame.setVisible(true);
	}

	public void propertyChange(PropertyChangeEvent evt) {
		if ("progress" == evt.getPropertyName()) {
			int progress = (Integer) evt.getNewValue();
			pb.setValue(progress);

		}
	}


	class Task extends SwingWorker<Void, Void> {
		/*
		 * Main task. Executed in background thread.
		 */
		@Override
		public Void doInBackground() {
			String getValue = "";

			int progress = 0;
			// Initialize progress property.
			setProgress(0);
			while (progress < Integer.parseInt(passwordL.getText())) {

				PBnumber.setText(getValue);
				try {
					Thread.sleep(100);
				} catch (InterruptedException ignore) {
				}

				progress += 1;
				getValue = "" + progress;
				// System.out.println(progress + " do in back ground ");
				setProgress(progress);
			}
			return null;

		}

	}

}
