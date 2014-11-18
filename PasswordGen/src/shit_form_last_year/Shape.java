package shit_form_last_year;
//Our Lord and Savior Kyle presides over this class.
//not any more
import java.awt.Color;

import acm.graphics.GTurtle;

public class Shape {
	
	private static final double degToRad = Math.PI/180;
	private double length;
	private GTurtle turtle;
	
	public Shape(double length, GTurtle turtle){
		this.length = length;
		this.turtle = turtle;
	}
	
	public void DrawEquil()
	{
		Alph theAlph=new Alph((int)(3*length/20), turtle, Color.BLACK);
		Alph bigAlph=new Alph((int)(3*length/10), turtle, Color.BLACK);
		turtle.hideTurtle();
		turtle.penDown();
		//first leg
		turtle.forward(length);
		turtle.left(180);
		turtle.penUp();
		turtle.forward(length/5);
		turtle.left(180);
		turtle.penDown();
		turtle.setColor(Color.BLUE);
		theAlph.writeX();
		turtle.setColor(Color.BLACK);
		turtle.penUp();
		turtle.forward(length/10);
		turtle.penDown();
		turtle.left(120);
		//second leg
		turtle.forward(length);
		turtle.left(150);
		turtle.penUp();
		turtle.forward(length/3.5);
		turtle.right(90);
		turtle.forward(length/20);
		turtle.penDown();
		turtle.left(180);
		turtle.setColor(Color.YELLOW);
		theAlph.writeY();
		turtle.setColor(Color.BLACK);
		turtle.left(180);
		turtle.penUp();
		turtle.forward(length/20);
		turtle.right(90);
		turtle.forward(length/3.5);
		turtle.penDown();
		turtle.left(150);
		//third leg
		turtle.forward(length);
		turtle.left(135);
		turtle.penUp();
		turtle.forward(length/8);
		turtle.penDown();
		turtle.right(15);
		turtle.setColor(Color.RED);
		theAlph.writeZ();
		turtle.setColor(Color.BLACK);
		turtle.left(180);
		turtle.penUp();
		turtle.forward(length/10);
		turtle.left(15);
		turtle.forward(length/8);
		turtle.left(165);
		//move
		turtle.forward(length);
		turtle.left(90);
		turtle.forward(length/5);
		turtle.right(90);
		turtle.penDown();
		//label
		turtle.setColor(Color.BLUE);
		bigAlph.writeX();
		bigAlph.changeColor(Color.BLACK);
		bigAlph.writeEq();
		bigAlph.changeColor(Color.YELLOW);
		bigAlph.writeY();
		bigAlph.changeColor(Color.BLACK);
		bigAlph.writeEq();
		bigAlph.changeColor(Color.RED);
		bigAlph.writeZ();
		bigAlph.changeColor(Color.BLACK);
		bigAlph.writeEq();
		bigAlph.write(" "+60);
		bigAlph.writeDeg();
		turtle.hideTurtle();
	}
	public void DrawScal(double a, double b)
	{
		double c = 180 - (a + b);
		double whatINeed = length / Math.sin(b * degToRad);
		double length2 = Math.sin(a * degToRad) * whatINeed;
		double length3 = Math.sin(c * degToRad) * whatINeed;
		    
			
		turtle.penDown();
		turtle.forward(length);
		turtle.left(180 - c);
		turtle.forward(length2);
		turtle.left(180 - b);
		turtle.forward(length3);
		turtle.penUp();
		turtle.left(180 - a);
		turtle.forward(length * 1.5);
	}
	public void DrawIsos(double a)
	{
		double secondAngle = (180 - a)/2;
		double whatINeed = length / Math.sin(secondAngle * degToRad);
		double length2 = Math.sin(a * degToRad) * whatINeed;
			
		
		turtle.penUp();
		turtle.forward(length);
		turtle.left( 180 - secondAngle);
		turtle.penDown();
		turtle.forward(length);
		turtle.left(180 - a);
		turtle.forward(length);
		turtle.left(180 - secondAngle);
		turtle.forward(length2);
		turtle.penUp();
		turtle.forward(length2 * .5);
	}
	public void DrawRight(double a)
	{
		double c =90-a;
		double hyp = length / Math.sin(c * degToRad);
		double length2 = Math.sin(a* degToRad) * hyp;
		double small;
		if(length>=length2)
			small=length2;
		else
			small=length;
			
		Alph theAlph=new Alph((int)(3*small/20), turtle, Color.BLACK);
		//leg 1
		turtle.penDown();
		turtle.forward(length);
		turtle.left(90);
		turtle.penUp();
		turtle.forward(small/10);
		turtle.left(90);
		turtle.forward(small/5);
		turtle.left(180);
		turtle.penDown();
		theAlph.changeColor(Color.BLUE);
		theAlph.writeX();
		theAlph.changeColor(Color.BLACK);
		turtle.penUp();
		turtle.forward(small/10);
		turtle.right(90);
		turtle.forward(small/10);
		turtle.left(180);
		//leg 2
		turtle.penDown();
		turtle.forward(length2);
		turtle.penUp();
		turtle.left(180);
		turtle.forward(small/3);
		turtle.right(90);
		turtle.forward(small/8);
		turtle.left(180);
		turtle.penDown();
		theAlph.changeColor(Color.YELLOW);
		theAlph.writeY();
		theAlph.changeColor(Color.BLACK);
		turtle.penUp();
		turtle.forward(small/40);
		turtle.left(90);
		turtle.forward(small/3);
		//leg 3
		turtle.penDown();
		turtle.left(180-c);
		turtle.forward(hyp);
		turtle.left(180-a);
		turtle.penUp();
		turtle.forward(small/5);
		turtle.left(90);
		turtle.forward(small/20);
		turtle.right(90);
		turtle.penDown();
		theAlph.changeColor(Color.RED);
		theAlph.writeZ();
		theAlph.changeColor(Color.BLACK);
		turtle.penUp();
		turtle.left(180);
		turtle.forward(3*small/10);
		turtle.left(90);
		turtle.forward(small/20);
		//move
		turtle.left(90);
		turtle.forward(length);
		//label
		turtle.left(90);
		int fifth=(int)(length2/5);
		turtle.forward(3*fifth);
		turtle.right(90);
		turtle.forward(fifth);
		turtle.penDown();
		double far=3*small/10;
		theAlph.changeColor(Color.BLUE);
		theAlph.writeX();
		theAlph.changeColor(Color.BLACK);
		theAlph.writeEq();
		far+=theAlph.write("90 ");
		theAlph.writeDeg();
		turtle.penUp();
		turtle.forward(fifth);
		far+=fifth;
		turtle.penDown();
		far+=3*small/10;
		theAlph.changeColor(Color.YELLOW);
		theAlph.writeY();
		theAlph.changeColor(Color.BLACK);
		theAlph.writeEq();
		far+=theAlph.write(" "+(int)c+" ");
		theAlph.writeDeg();
		turtle.penUp();
		turtle.forward(fifth);
		far+=fifth+3*small/10;
		turtle.penDown();
		theAlph.changeColor(Color.RED);
		theAlph.writeZ();
		theAlph.changeColor(Color.BLACK);
		theAlph.writeEq();
		far+=theAlph.write(" "+(int)a+" ");
		theAlph.writeDeg();
		turtle.left(180);
		turtle.penUp();
		turtle.forward(far);
		turtle.left(90);
		turtle.penUp();
		turtle.forward(3*fifth);
		turtle.penDown();
		turtle.left(90);
		theAlph.write("S1= "+(int)length);
		turtle.penUp();
		turtle.forward(small/5);
		turtle.penDown();
		theAlph.write("S2= "+(int)length2);
		turtle.penUp();
		turtle.forward(small/5);
		turtle.penDown();
		theAlph.write("S3= "+Math.round(hyp));
		turtle.hideTurtle();
	}
	public void DrawSquare()
	{
		Alph theAlph=new Alph((int)(3*length/20), turtle, Color.BLACK);
		Alph bigAlph=new Alph((int)(3*length/10), turtle, Color.BLACK);
		turtle.penDown();
		//first leg
		turtle.forward(length);
		turtle.left(90);
		turtle.penUp();
		turtle.forward(length/10);
		turtle.left(90);
		turtle.forward(length/5);
		turtle.left(180);
		turtle.penDown();
		theAlph.changeColor(Color.GREEN);
		theAlph.writeW();
		theAlph.changeColor(Color.BLACK);
		turtle.penUp();
		turtle.forward(length/10);
		turtle.right(90);
		turtle.forward(length/10);
		turtle.left(180);
		//second leg
		turtle.penDown();
		turtle.forward(length);
		turtle.penUp();
		turtle.left(90);
		turtle.forward(length/5);
		turtle.left(90);
		turtle.forward(length/5);
		turtle.left(90);
		turtle.penDown();
		theAlph.changeColor(Color.BLUE);
		theAlph.writeX();
		theAlph.changeColor(Color.BLACK);
		turtle.penUp();
		turtle.left(90);
		turtle.forward(length/5);
		turtle.right(90);
		turtle.forward(length/10);
		turtle.left(180);
		//third leg
		turtle.penDown();
		turtle.forward(length);
		turtle.penUp();
		turtle.left(90);
		turtle.forward(length/5);
		turtle.left(90);
		turtle.forward(length/10);
		turtle.penDown();
		theAlph.changeColor(Color.YELLOW);
		theAlph.writeY();
		theAlph.changeColor(Color.BLACK);
		turtle.penUp();
		turtle.left(180);
		turtle.forward(length/5);
		turtle.right(90);
		turtle.forward(length/5);
		turtle.left(180);
		//fourth leg
		turtle.penDown();
		turtle.forward(length);
		turtle.penUp();
		turtle.left(90);
		turtle.forward(length/10);
		turtle.left(90);
		turtle.forward(length/10);
		turtle.right(90);
		turtle.penDown();
		theAlph.changeColor(Color.RED);
		theAlph.writeZ();
		theAlph.changeColor(Color.BLACK);
		turtle.penUp();
		turtle.left(180);
		turtle.forward(length/5);
		turtle.left(90);
		//move
		turtle.forward(length/10);
		turtle.left(90);
		//label
		turtle.forward(length);
		turtle.left(90);
		turtle.forward(length/5);
		turtle.right(90);
		turtle.forward(length/5);
		bigAlph.changeColor(Color.GREEN);
		bigAlph.writeW();
		bigAlph.changeColor(Color.BLACK);
		bigAlph.writeEq();
		bigAlph.changeColor(Color.BLUE);
		bigAlph.writeX();
		bigAlph.changeColor(Color.BLACK);
		bigAlph.writeEq();
		bigAlph.changeColor(Color.YELLOW);
		bigAlph.writeY();
		bigAlph.changeColor(Color.BLACK);
		bigAlph.writeEq();
		bigAlph.changeColor(Color.RED);
		bigAlph.writeZ();
		bigAlph.changeColor(Color.BLACK);
		bigAlph.writeEq();
		bigAlph.write(" "+90);
		bigAlph.writeDeg();
	}
	public void DrawRect(double width)
	{
		Alph bigAlph=new Alph((int)(3*length/10), turtle, Color.BLACK);
		double big;
		double small;
		if(length>=width)
		{
			big=length;
			small=width;
		}
		else
		{
			big=width;
			small=length;
		}
		Alph theAlph=new Alph((int)(3*small/20), turtle, Color.BLACK);
		turtle.penDown();
		//first leg
		turtle.forward(big);
		turtle.left(90);
		turtle.penUp();
		turtle.forward(small/10);
		turtle.left(90);
		turtle.forward(small/5);
		turtle.left(180);
		turtle.penDown();
		theAlph.changeColor(Color.GREEN);
		theAlph.writeW();
		theAlph.changeColor(Color.BLACK);
		turtle.penUp();
		turtle.forward(small/10);
		turtle.right(90);
		turtle.forward(small/10);
		turtle.left(180);
		//second leg
		turtle.penDown();
		turtle.forward(small);
		turtle.penUp();
		turtle.left(90);
		turtle.forward(small/5);
		turtle.left(90);
		turtle.forward(small/5);
		turtle.left(90);
		turtle.penDown();
		theAlph.changeColor(Color.BLUE);
		theAlph.writeX();
		theAlph.changeColor(Color.BLACK);
		turtle.penUp();
		turtle.left(90);
		turtle.forward(small/5);
		turtle.right(90);
		turtle.forward(small/10);
		turtle.left(180);
		//third leg
		turtle.penDown();
		turtle.forward(big);
		turtle.penUp();
		turtle.left(90);
		turtle.forward(small/5);
		turtle.left(90);
		turtle.forward(small/10);
		turtle.penDown();
		theAlph.changeColor(Color.YELLOW);
		theAlph.writeY();
		theAlph.changeColor(Color.BLACK);
		turtle.penUp();
		turtle.left(180);
		turtle.forward(small/5);
		turtle.right(90);
		turtle.forward(small/5);
		turtle.left(180);
		//fourth leg
		turtle.penDown();
		turtle.forward(small);
		turtle.penUp();
		turtle.left(90);
		turtle.forward(small/10);
		turtle.left(90);
		turtle.forward(small/10);
		turtle.right(90);
		turtle.penDown();
		theAlph.changeColor(Color.RED);
		theAlph.writeZ();
		theAlph.changeColor(Color.BLACK);
		turtle.penUp();
		turtle.left(180);
		turtle.forward(small/5);
		turtle.left(90);
		//move
		turtle.forward(big/10);
		turtle.left(90);
		//label
		turtle.forward(big);
		turtle.left(90);
		turtle.forward(big/5);
		turtle.right(90);
		turtle.forward(big/5);
		bigAlph.changeColor(Color.GREEN);
		bigAlph.writeW();
		bigAlph.changeColor(Color.BLACK);
		bigAlph.writeEq();
		bigAlph.changeColor(Color.BLUE);
		bigAlph.writeX();
		bigAlph.changeColor(Color.BLACK);
		bigAlph.writeEq();
		bigAlph.changeColor(Color.YELLOW);
		bigAlph.writeY();
		bigAlph.changeColor(Color.BLACK);
		bigAlph.writeEq();
		bigAlph.changeColor(Color.RED);
		bigAlph.writeZ();
		bigAlph.changeColor(Color.BLACK);
		bigAlph.writeEq();
		bigAlph.write(" "+90);
		bigAlph.writeDeg();
	}
	public void DrawRhombus(String QuadType, double width, double angle)
	{
		turtle.penDown();
		turtle.forward(length);
		turtle.left(angle);
		turtle.forward(width);
		turtle.left(180 - angle);
		turtle.forward(length);
		turtle.left(angle);
		turtle.forward(width);
		turtle.penUp();
		turtle.left(180 - angle);
		turtle.forward(length * 1.5);	
		//wieonri vrhnegiojgrwhn go
	}
}