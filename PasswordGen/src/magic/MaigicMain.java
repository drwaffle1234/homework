package magic;

import java.awt.Button;
import java.awt.Color;
//import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JApplet;
//import javax.swing.JOptionPane;

public class MaigicMain extends JApplet implements ActionListener {
	private static final long serialVersionUID = 1L;
	Button addHealth, subHealth, poison, turn, diceRoll;
	TextField dice,dice1,dice2,dice3,dice4,dice5;
	TextField showHealth, ShowRoll;
	Player player1 = new Player();
	Random gen= new Random();
	public void init() {
		setSize(300, 350);
		setLayout(null);
		addHealth = new Button("add Health");
		addHealth.setSize(70, 25);
		addHealth.setLocation(40, 100);
		add(addHealth);
		
		subHealth = new Button("sub Health");
		subHealth.setSize(70, 25);
		subHealth.setLocation(120, 100);
		add(subHealth);
		
		showHealth=new TextField(player1.getHealthinString());
		showHealth.setSize(50,50);
		showHealth.setLocation(80, 40);
		add(showHealth);
		
		subHealth.addActionListener(this);
		addHealth.addActionListener(this);
	}

	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == addHealth) {
			player1.plusOne();
			showHealth.setText(player1.getHealthinString());
		}else if (evt.getSource() == subHealth) {
			player1.SubOne();
			showHealth.setText(player1.getHealthinString());
		}
	}
}
