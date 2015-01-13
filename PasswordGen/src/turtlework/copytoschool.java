package turtlework;

import hitbox.Turtle;

public class copytoschool {
	Turtle hard=new Turtle();
	public void bomb(){
		for(int i=0; i<25; i++){
			hard.RandomMoveTo();
			hard.fillBox(25, 25);
		}
	}
}
