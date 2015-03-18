package turtlework;



import java.awt.Color;

public class turtlework {
	public static void main(String args[]){
		Turtle lee =new Turtle();
		lee.switchTo(Color.gray);
		for(int i=0; i<200; i++){
			lee.switchTo(Color.gray);
			lee.moveTo(0,6);
			lee.fillCircle(5);
			lee.sleep(10);
			
			
			
		}
		
		
	}
}
