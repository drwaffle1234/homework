package turtlework;

import java.awt.Color;

public class turtlework {
	public static void main(String args[]){
		Turtle lee =new Turtle();
		lee.switchTo(Color.gray);
		for(int i=0; i<200; i++){
			lee.switchTo(Color.gray);
			lee.RandomMoveTo();
			lee.fillCircle(5);
			lee.sleep(10);
			lee.move(lee.getX()+5, lee.getY()+5);
			
			
		}
		lee.clear();
		for(int i=0; i<200; i++){
			lee.switchTo(Color.gray);
			lee.RandomMoveTo();
			lee.fillCircle(5);
			lee.sleep(10);
			lee.move(lee.getX()+5, lee.getY()+5);
			
			
		}
		
	}
}
