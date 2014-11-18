package shit_form_last_year;
import acm.program.*; // Common classes used by all parts of the acm package
import acm.graphics.*; // Defines graphical object classes

import java.awt.*; // Allows access to Java's Color class

import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class Turtles extends GraphicsProgram {

	private int choiceint = 35;
	GTurtle turtle = new GTurtle(300, 300); // window
	// middle
	angles angle = new angles(turtle, 150);
	Shape shapes = new Shape(100, turtle);
	words theWords = new words(70, turtle, Color.black);
	words theWords1 = new words(30, turtle, Color.black);
	private boolean showtrue = false;

	/* start the trutle controler */
	public void run() {

		this.setSize(800, 600);

		add(turtle);

		turtle.setDirection(0); // 0 deg = East, 90 = north, etc.
		turtle.penUp(); // draw when the turtle moves
		turtle.setColor(Color.BLACK); // draw black lines
		turtle.setSpeed(1); // range is 0 .. 1
		if (!showtrue) {
			turtle.hideTurtle();
		} else
			turtle.showTurtle();

		turtle.penDown();

	}

	/* start the GUI */
	public void init() {
		
		removeAll();

		add(new JButton("Line"), 100, 100);

		add(new JButton("Triangle"), 100, 130);
		add(new JButton("Quadrilateral"), 100, 160);
		add(new JButton("settings"), 100, 190);
		add(new JButton("credits"),100,220);
		add(new JButton("Exit"), 100, 250);

		addActionListeners();
	}

	/** Listen for a button action. and add the more **/
	public void actionPerformed(ActionEvent e) {

		println(e.getActionCommand());

		if (e.getActionCommand().equalsIgnoreCase("Line")) {

			removeAll();
			add(new JButton("Line"), 100, 100);
			// add(new JButton("Angle"), 100,130);
			add(new JButton("Triangle"), 100, 130);
			add(new JButton("Quadrilateral"), 100, 160);
			add(new JButton("settings"), 100, 190);
			add(new JButton("credits"),100,220);
			add(new JButton("Exit"), 100, 250);
			// add(new JButton("Line"), 100, 100);
			add(new JButton("Angle"), 210, 100);
			add(new JButton("clear"), 210, 130);
			add(new JButton("Back"), 210, 160);
			addActionListeners();
		} else if (e.getActionCommand().equalsIgnoreCase("Angle")) {
			// add(new JButton("gen"), 280, 81);
			// add(new JButton("choice"), 280, 109);

			choiceint = input.getInput();
			angle.drawAngle(choiceint);

		} else if (e.getActionCommand().equalsIgnoreCase("settings")) {
			removeAll();

			add(new JButton(" angle color "), 100, 100);
			add(new JButton("Triangle color"), 220, 100);
			add(new JButton("Quadrilateral color"), 350, 100);
			add(new JButton("Show Turtle"), 500, 100);
			add(new JButton("Back"), 620, 100);
			addActionListeners();
		} else if (e.getActionCommand().equalsIgnoreCase("Triangle")) {
			println(e.getActionCommand() + " in if statement");
			removeAll();
			add(new JButton("Line"), 100, 100);
			// add(new JButton("Angle"), 100,130);
			add(new JButton("Triangle"), 100, 130);
			add(new JButton("Quadrilateral"), 100, 160);
			add(new JButton("settings"), 100, 190);
			add(new JButton("credits"),100,220);
			add(new JButton("Exit"), 100, 250);
			add(new JButton("Back"), 210, 280);
			add(new JButton("Right triangle"), 210, 100);
			add(new JButton("Equilateral Triangle"), 210, 130);
			add(new JButton("Isosceles Triangle"), 210, 160);
			add(new JButton("Scalene Triangle"), 210, 190);
			add(new JButton("clear"), 210, 220);
			

			addActionListeners();
		} else if (e.getActionCommand().equalsIgnoreCase("Back")) {
			println(e.getActionCommand() + " in if statement");
			removeAll();

			add(new JButton("Line"), 100, 100);
			// add(new JButton("Angle"), 100,130);
			add(new JButton("Triangle"), 100, 130);
			add(new JButton("Quadrilateral"), 100, 160);
			add(new JButton("settings"), 100, 190);
			add(new JButton("credits"),100,220);
			add(new JButton("Exit"), 100, 250);

			addActionListeners();
		} else if (e.getActionCommand().equalsIgnoreCase("Quadrilateral")) {
			// println(e.getActionCommand() + " in if statement");
			removeAll();
			add(new JButton("Line"), 100, 100);
			// add(new JButton("Angle"), 100,130);
			add(new JButton("Triangle"), 100, 130);
			add(new JButton("Quadrilateral"), 100, 160);
			add(new JButton("settings"), 100, 190);
			add(new JButton("Exit"), 100, 280);
			add(new JButton("Back"), 210, 250);
			add(new JButton("credits"),100,220);
			add(new JButton("rectangle"), 210, 130);
			add(new JButton("Rhombus"), 210, 160);
			add(new JButton("square"), 210, 100);
			add(new JButton("clear"), 210, 190);
			
			addActionListeners();

		} else if (e.getActionCommand().equalsIgnoreCase(" angle color ")) {
			removeAll();

			add(new JButton("angle color"), 100, 100);
			add(new JButton("Triangle color"), 220, 100);
			add(new JButton("Quadrilateral color"), 350, 100);
			add(new JButton("Back"), 620, 100);
			add(new JButton("Show Turtle"), 500, 100);
			add(new JButton("Angle color"), 100, 150);
			add(new JButton("Line color"), 100, 200);
			addActionListeners();
		} else if (e.getActionCommand().equalsIgnoreCase("Triangle color")) {
			removeAll();

			add(new JButton("angle color"), 100, 100);
			add(new JButton("Triangle color"), 220, 100);
			add(new JButton("Quadrilateral color"), 350, 100);
			add(new JButton("Show Turtle"), 500, 100);
			add(new JButton("Back"), 620, 100);
			add(new JButton("Congruent lines"), 220, 150);
			addActionListeners();
		} else if (e.getActionCommand().equalsIgnoreCase("Quadrilateral color")) {
			removeAll();

			add(new JButton("angle color"), 100, 100);
			add(new JButton("Triangle color"), 220, 100);
			add(new JButton("Quadrilateral color"), 350, 100);
			add(new JButton("Back"), 620, 100);
			add(new JButton("Show Turtle"), 500, 100);
			add(new JButton("Congruent lines pair 1"), 350, 150);
			add(new JButton("Congruent lines pair 2"), 350, 200);
			addActionListeners();
		} else if (e.getActionCommand().equalsIgnoreCase("Show Turtle")) {
			// add(new JButton("gen"), 280, 81);
			// add(new JButton("choice"), 280, 109);
			if (showtrue == false) {
				showtrue = true;
			} else {
				showtrue = false;
			}

		} else if (e.getActionCommand().equalsIgnoreCase("Right triangle")) {
			turtle.setLocation(400, 300);
			shapes.DrawRight(input.getInputTRI());
		} else if (e.getActionCommand()
				.equalsIgnoreCase("Equilateral Triangle")) {
			turtle.setLocation(400, 300);
			shapes.DrawEquil();
		} else if (e.getActionCommand().equalsIgnoreCase("Isosceles Triangle")) {
			turtle.setLocation(400, 300);
			shapes.DrawIsos(input.getInputTRI());
		} else if (e.getActionCommand().equalsIgnoreCase("Scalene Triangle")) {
			turtle.setLocation(400, 300);
			shapes.DrawScal(input.getInputTRI(), input.getInputTRI());
		}

		else if (e.getActionCommand().equalsIgnoreCase("exit")) {
			System.exit(1);

			addActionListeners();
		}

		else if (e.getActionCommand().equalsIgnoreCase("rectangle")) {
			turtle.setLocation(400, 300);
			shapes.DrawRect(input.getInputLine());
		} else if (e.getActionCommand().equalsIgnoreCase("Rhombus")) {
			turtle.setLocation(400, 300);
			int choice = input.getInputLine();
			int choice1 = input.getInputTRI();
			shapes.DrawRhombus("quad", choice, choice1);
		} else if (e.getActionCommand().equalsIgnoreCase("square")) {
			turtle.setLocation(400, 300);
			shapes.DrawSquare();
		} else if (e.getActionCommand().equalsIgnoreCase("clear")) {
			turtle.erasePath();

			turtle.setLocation(400, 300);

		}
		else if (e.getActionCommand().equalsIgnoreCase("credits")) {
			turtle.erasePath();			
			turtle.setLocation(300, 300);
			theWords1.writeLee();
			turtle.setLocation(300, 350);
			theWords1.writeCasey();
			turtle.setLocation(300, 400);
			theWords1.writeKyle();
		}
		else if (e.getActionCommand().equalsIgnoreCase("Angle Color")) {
			add(new JButton("Red"), 50, 400);
			add(new JButton("green"), 110, 400);
			add(new JButton("blue"), 180, 400);
			add(new JButton("black"), 240, 400);
			add(new JButton("brown"), 310, 400);
			add(new JButton("pink"), 380, 400);
			add(new JButton("purple"), 430, 400);
			addActionListeners();
			
			
		}
		else if (e.getActionCommand().equalsIgnoreCase("Line color")) {
			add(new JButton("Red"), 50, 400);
			add(new JButton("green"), 110, 400);
			add(new JButton("blue"), 180, 400);
			add(new JButton("black"), 240, 400);
			add(new JButton("brown"), 310, 400);
			add(new JButton("pink"), 380, 400);
			add(new JButton("purple"), 430, 400);
			addActionListeners();
		}

		println(e.getActionCommand());
		run();
	}
	public static void main(String[] args){
		new Turtles().start();
	}
}
