package messageBase;


public class SimpleEnigma {
	
	private String outerRing = "#BDFHJLNPRTVXZACEGIKMOQSUWY";
	private String middleRing;
	private String innerRing;
	private char t;
	private String originalO;
	private String originalM;
	private String originalI;
	
	public SimpleEnigma(String midRotor, String insideRotor)
	{
		middleRing = midRotor;
		innerRing = insideRotor;
		t = innerRing.charAt(0);
	}
	
	public SimpleEnigma(String outerRotor,String middleRotor, String innerRotor)
	{
		outerRing = outerRotor;
		middleRing = middleRotor;
		innerRing = innerRotor;
		t = innerRing.charAt(0);
		originalO = outerRing;
		originalM = middleRing;
		originalI = innerRing;
	}
	
	private void rotate()
	{
		innerRing = innerRing.substring(innerRing.length()-1) + innerRing.substring(0, innerRing.length()-1);
		
		if(t == innerRing.charAt(0))
		{
			middleRing= middleRing.substring(middleRing.length()-1) + middleRing.substring(0,middleRing.length()-1);
			
		}
		
	}
	
	public void reset()
	{
		outerRing = originalO;
		middleRing = originalM;
		innerRing =  originalI;
	}
	/**
	 * Encodes a message with the three rings
	 * @return
	 */
	public String encode(String plainText)
	{
		String result ="";
		plainText = plainText.toUpperCase();
		for(int i =0; i < plainText.length();i++)
		{
			char c= plainText.charAt(i);
			int v = innerRing.indexOf(c);
		if(v== -1)
		{
			v=innerRing.indexOf('#');
		}
		
			char a = outerRing.charAt(v);
			int s = middleRing.indexOf(a);
			char r = outerRing.charAt(s);
			result = result + r;
			rotate();
		
		}
		
		
		return result;
	}
	/**
	 * Decodes a message using the reverse of Encode
	 * @return
	 */
	public String decode(String plainText)
	{
		String result ="";
		plainText = plainText.toUpperCase();
		for(int i =0; i < plainText.length();i++)
		{
			char c= plainText.charAt(i);
			int v = outerRing.indexOf(c);
			char a = middleRing.charAt(v);
			int s = outerRing.indexOf(a);
			char r = innerRing.charAt(s);
			result = result + r;
			rotate();
		
		}
		
		
		return result;
	}

	
	
	
}

