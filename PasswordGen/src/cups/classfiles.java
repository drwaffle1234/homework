package cups;

import java.awt.Color;
import javax.swing.JOptionPane;
public class classfiles extends Turtle{
	
	
	public void makeCup(){
		switchTo(Color.RED);
		fillBox(25,50);
	}
	public String returnMove(){
		String Str = JOptionPane.showInputDialog("up/down/left/up");
		
		System.out.println(Str);
		
		return Str;
		
	}
	public void hand(String move){
		
	}
	
}
