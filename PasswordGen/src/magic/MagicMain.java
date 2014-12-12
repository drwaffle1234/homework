package magic;



import java.awt.Button;
//import java.awt.Color;
//import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JApplet;
//import javax.swing.JOptionPane;

public class MagicMain extends JApplet implements ActionListener {
	private static final long serialVersionUID = 1L;
	Button addHealth, subHealth, poison, turn, diceRoll;
	Button addHealth2, subHealth2,poison2;
	Button addHealth3, subHealth3,poison3;
	TextField dice,dice1,dice2,dice3,dice4,dice5;
	TextField showHealth,showHealth2,showHealth3;
	
	Player player1 = new Player();
	Player player2=new Player();
	Player player3=new Player();
	Random gen= new Random();
	public void init() {
		setSize(300, 350);
		setLayout(null);
		addHealth = new Button("add Health");
		addHealth.setSize(70, 25);
		addHealth.setLocation(40, 100);
		add(addHealth);
		
		addHealth2 = new Button("add Health");
		addHealth2.setSize(70, 25);
		addHealth2.setLocation(40, 200);
		add(addHealth2);
		
		addHealth3 = new Button("add Health");
		addHealth3.setSize(70, 25);
		addHealth3.setLocation(40, 200);
		add(addHealth3);
		
		subHealth = new Button("sub Health");
		subHealth.setSize(70, 25);
		subHealth.setLocation(120, 100);
		add(subHealth);
		
		subHealth2 = new Button("sub Health");
		subHealth2.setSize(70, 25);
		subHealth2.setLocation(120, 200);
		add(subHealth2);
		
		subHealth3 = new Button("sub Health");
		subHealth3.setSize(70, 25);
		subHealth3.setLocation(120, 200);
		add(subHealth3);
		
		diceRoll = new Button("Roll");
		diceRoll.setSize(30, 25);
		diceRoll.setLocation(200, 0);
		add(diceRoll);
		
		showHealth=new TextField(player1.getHealthinString());
		showHealth.setSize(50,50);
		showHealth.setLocation(80, 40);
		add(showHealth);
		
		showHealth2=new TextField(player2.getHealthinString());
		showHealth2.setSize(50,50);
		showHealth2.setLocation(80, 140);
		add(showHealth2);
		
		showHealth3=new TextField(player3.getHealthinString());
		showHealth3.setSize(50,50);
		showHealth3.setLocation(120, 140);
		add(showHealth3);
		
		dice=new TextField();
		dice.setSize(25,25);
		dice.setLocation(130, 40);
		add(dice);
		
		dice1=new TextField();
		dice1.setSize(25,25);
		dice1.setLocation(130, 140);
		add(dice1);
		
		dice2=new TextField();
		dice2.setSize(25,25);
		dice2.setLocation(60, 0);
		add(dice2);
		dice2.hide();
		
		dice3=new TextField();
		dice3.setSize(25,25);
		dice3.setLocation(90, 0);
		add(dice3);
		dice3.hide();
		
		dice4=new TextField();
		dice4.setSize(25,25);
		dice4.setLocation(120, 0);
		add(dice4);
		dice4.hide();
		
		dice5=new TextField();
		dice5.setSize(25,25);
		dice5.setLocation(150, 0);
		add(dice5);
		dice5.hide();
		
		diceRoll.addActionListener(this);
		subHealth.addActionListener(this);
		subHealth2.addActionListener(this);
		addHealth.addActionListener(this);
		addHealth2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == addHealth) {
			player1.plusOne();
			showHealth.setText(player1.getHealthinString());
		}else if (evt.getSource() == subHealth) {
			player1.SubOne();
			showHealth.setText(player1.getHealthinString());
		}else if (evt.getSource() == addHealth2) {
			player2.plusOne();
			showHealth2.setText(player2.getHealthinString());
		}else if (evt.getSource() == subHealth2) {
			player2.SubOne();
			showHealth2.setText(player2.getHealthinString());
		}else if (evt.getSource() == diceRoll) {
			dice.setText(""+(gen.nextInt(6)+1));
			dice1.setText(""+(gen.nextInt(6)+1));
			dice2.setText(""+(gen.nextInt(6)+1));
			dice3.setText(""+(gen.nextInt(6)+1));
			dice4.setText(""+(gen.nextInt(6)+1));
			dice5.setText(""+(gen.nextInt(6)+1));
		}
	}
}