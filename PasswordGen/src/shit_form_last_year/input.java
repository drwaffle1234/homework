package shit_form_last_year;
import javax.swing.JOptionPane;

//lee is here
public class input {
	static String numStr;
	static String result;
	static int num;
	static int again;
	static String again1;
	static String[] choices = { "Yes", "No" };
	static String[] choices1 = { "OK" };
	static String[] choiceColor = { "red", "blue", "black" };
	/**for normal input */
	public static int getInput() {

		numStr = JOptionPane.showInputDialog("Enter an angle measurement");
		num = Integer.parseInt(numStr);
		if (num > 180) {

			again = JOptionPane.showOptionDialog(null,
					"please make a number smaller than 180", null,
					JOptionPane.PLAIN_MESSAGE, JOptionPane.YES_NO_OPTION, null,
					choices1, again);
		} else {

			again = JOptionPane.showOptionDialog(null, "is " + num
					+ "the correct number", null, JOptionPane.PLAIN_MESSAGE,
					JOptionPane.YES_NO_OPTION, null, choices, again);
		}

		return num;
	}
	/**input for angles*/
	public static int getInputTRI() {

		numStr = JOptionPane.showInputDialog("Enter an angle measurement");
		num = Integer.parseInt(numStr);
		if (num > 180) {

			again = JOptionPane.showOptionDialog(null,
					"please make a number smaller than 90", null,
					JOptionPane.PLAIN_MESSAGE, JOptionPane.YES_NO_OPTION, null,
					choices1, again);
		} else {

			again = JOptionPane.showOptionDialog(null, "is " + num
					+ "the correct number", null, JOptionPane.PLAIN_MESSAGE,
					JOptionPane.YES_NO_OPTION, null, choices, again);
		}

		return num;
	}
	/**input for Lines*/
	public static int getInputLine() {

		numStr = JOptionPane.showInputDialog("Enter an Line measurement");
		num = Integer.parseInt(numStr);
		if (num > 400) {

			again = JOptionPane.showOptionDialog(null,
					"please make a number smaller than 400", null,
					JOptionPane.PLAIN_MESSAGE, JOptionPane.YES_NO_OPTION, null,
					choices1, again);
		} else {

			again = JOptionPane.showOptionDialog(null, "is " + num
					+ "the correct number", null, JOptionPane.PLAIN_MESSAGE,
					JOptionPane.YES_NO_OPTION, null, choices, again);
		}

		return num;
	}
	/**input for color choice*/
	public static String getInputLColor() {

		again = JOptionPane.showOptionDialog(null, "please select a color",
				null, JOptionPane.PLAIN_MESSAGE, JOptionPane.YES_NO_OPTION,
				null, choiceColor, again);
				
		return again1;
	}
}
