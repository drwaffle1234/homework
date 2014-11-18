package shit_form_last_year;
import acm.program.*;
import acm.graphics.*;
import java.awt.Color;

public class angles {
	private final double radtodeg=180/Math.PI;
	private final double degtorad = Math.PI/180;
	//private double degreeOfAngle;
	private double lengthOfLine;
	private GTurtle turtle;
	private Color currColor = Color.black;
	private Color angColor = Color.green;
	
	public angles(GTurtle turtleTurtle, double sizeOfLine){
		//degreeOfAngle = degree;
		turtle = turtleTurtle;
		setLengthOfLine(sizeOfLine);
		turtle.setColor(currColor);
	}
	
	public void drawAngle(int degreeOfAngle){
		turtle.penDown();
		turtle.forward(lengthOfLine);
		turtle.right(180);
		turtle.forward(lengthOfLine/2);
		turtle.right(180);
		turtle.left(degreeOfAngle);
		turtle.setColor(angColor);
		//Casey's additions
		turtle.forward(lengthOfLine/4);
		turtle.right(90);
		for(int a=0; a<degreeOfAngle; a++)
		{
			turtle.right(1);
			turtle.forward(lengthOfLine*Math.PI/720);
		}
		turtle.left(180);
		for(int b=0; b<degreeOfAngle; b++)
		{
			turtle.forward(lengthOfLine*Math.PI/720);
			turtle.left(1);
		}
		turtle.right(90);
		turtle.forward(lengthOfLine/4);
		//end additions
//		turtle.forward(lengthOfLine/2);
		turtle.penUp();
		turtle.right(degreeOfAngle + 90);
		turtle.forward((Math.sin(degreeOfAngle * degtorad)) * (lengthOfLine/2));
		turtle.left(90);
		turtle.forward((lengthOfLine-Math.cos(degtorad*degreeOfAngle)*lengthOfLine)/2); //one more addition
		turtle.forward(lengthOfLine/2);
		turtle.setColor(currColor);
	}
	public void setLengthOfLine(double newLength){
		lengthOfLine = newLength;
	}
	public void setColorOfLine(Color newColor){
		currColor = newColor;
	}
	public void setColorOfAngle(Color newColor){
		angColor =newColor;
	}
	
	//public void setAngDegree(double newDegree){
		//degreeOfAngle = newDegree;
	//}
	
}
