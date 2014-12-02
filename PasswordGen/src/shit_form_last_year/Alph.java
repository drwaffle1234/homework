package shit_form_last_year;

import java.awt.Color;

import acm.graphics.GTurtle;

//all letters with curves in them are imperfect

public class Alph
{
	private final static double radtodeg=180/Math.PI;
	private double height;
	private double width;
	private GTurtle turt;
	
	/**
	 * creates the Alph object
	 * @param the integer height of the text in pixels, width is 2/3.0*height
	 * @param a GTurtle object to write with
	 * @param the color object for the text
	 * all elliptic letters must be at least 40 pixels tall
	 */
	public Alph(int heights, GTurtle turts, Color cols)
	{
		height=heights;
		width=height*2/3;
		turt=turts;
		turt.setColor(cols);
	}
	/**
	 * changes the color of the Alph object
	 * @param the color object to change to
	 */
	public void changeColor(Color cols)
	{
		turt.setColor(cols);
	}	
	/**
	 * writes out the letters of the provided String, in turtle graphics
	 * @param the String to be written
	 * @return the total distance in pixels traveled
	 */
	public double write(String toWrite)
	{
		double total=0;
		while(toWrite.length()>0)
		{
			char let=toWrite.charAt(0);
			toWrite=toWrite.substring(1);
			total+=width;
			if(let=='A')
				writeA();
			else if(let=='B')
				writeB();
			else if(let=='C')
				writeC();
			else if(let=='D')
				writeD();
			else if(let=='E')
				writeE();
			else if(let=='F')
				writeF();
			else if(let=='G')
				writeG();
			else if(let=='H')
				writeH();
			else if(let=='I')
				writeI();
			else if(let=='K')
				writeK();
			else if(let=='L')
				writeL();
			else if(let=='M')
				writeM();
			else if(let=='N')
				writeN();
			else if(let=='O')
				writeO();
			else if(let=='P')
				writeP();
			else if(let=='Q')
				writeQ();
			else if(let=='R')
				writeR();
			else if(let=='S')
				writeS();
			else if(let=='T')
				writeT();
			else if(let=='V')
				writeV();
			else if(let=='W')
				writeW();
			else if(let=='X')
				writeX();
			else if(let=='Y')
				writeY();
			else if(let=='Z')
				writeZ();
			else if(let=='0')
				total-=(width-write0());
			else if(let=='1')
				total-=(width-write1());
			else if(let=='2')
				total-=(width-write2());
			else if(let=='3')
				total-=(width-write3());
			else if(let=='4')
				total-=(width-write4());
			else if(let=='5')
				total-=(width-write5());
			else if(let=='6')
				total-=(width-write6());
			else if(let=='7')
				total-=(width-write7());
			else if(let=='8')
				total-=(width-write8());
			else if(let=='9')
				total-=(width-write9());
			else if(let=='=')
				writeEq();
			else if(let==' ')
			{
				space(.5);
				total-=width/2;
			}
			if(toWrite.length()!=0&&let!='S')
			{
				space(.2);
				total+=width/5;
			}
		}
		return total;
	}
	/**
	 * makes an invisible space between letters
	 * @param width of space as a double proportion of the width of Alph
	 */
	public void space(double ratio)
	{
		turt.penUp();
		turt.forward(width*ratio);
		turt.penDown();
	}
	//for use with ellipses
	private static double getFullSlope(double x)
	{
		x=x*4;
		double result=Math.pow(x,2);
		result=result*9/16;
		result=9-result;
		result=Math.sqrt(result);
		result=16*result;
		result=-9*x/result;
		return result;
	}
	private static double getHalfSlope(double x)
	{
		x=x*2;
		double result=Math.pow(x,2);
		result=result*9/4;
		result=9-result;
		result=Math.sqrt(result);
		result=4*result;
		result=-9*x/result;
		return result;
	}
	public void writeDeg()
	{
		//makes degree symbol
		turt.left(90);
		turt.penUp();
		turt.forward(height);
		turt.right(90);
		turt.forward(width/20);
		turt.penDown();
		for(int a=0; a<360; a++)
		{
			turt.right(1);
			turt.forward(Math.PI*width/3600);
		}
		turt.right(90);
		turt.penUp();
		turt.forward(height);
		turt.left(90);
		turt.forward(19*width/20);
		turt.penDown();
	}
	public void writeEq()
	{
		//makes = sign
		turt.penUp();
		turt.left(90);
		turt.forward(3*height/4);
		turt.right(90);
		turt.penDown();
		turt.forward(width);
		turt.penUp();
		turt.right(90);
		turt.forward(height/2);
		turt.right(90);
		turt.penDown();
		turt.forward(width);
		turt.penUp();
		turt.left(90);
		turt.forward(height/4);
		turt.left(90);
		turt.forward(width);
		turt.penDown();
	}
	public void writeA()
	{
		double hypotenuse=Math.sqrt(10)/3;
		turt.left(Math.atan(3)*radtodeg);
		turt.forward(height*hypotenuse);
		turt.right(180-2*radtodeg*Math.atan(1/3.0));
		turt.forward(hypotenuse*height/2);
		turt.right(180-Math.atan(3)*radtodeg);
		turt.forward(height/3);
		turt.right(180);
		turt.forward(height/3);
		turt.right(Math.atan(3)*radtodeg);
		turt.forward(hypotenuse*height/2);
		turt.left(Math.atan(3)*radtodeg);
	}
	public void writeB()
	{
		turt.left(90);
		turt.forward(height);
		turt.right(90);
		turt.forward(height*5/12);
		double disdeg=Math.PI*height/720;
		for(int a=0; a<180; a++)
		{
			turt.right(1);
			turt.forward(disdeg);
		}
		turt.forward(height*5/12);
		turt.left(180);
		turt.forward(height*5/12);
		for(int b=0; b<180; b++)
		{
			turt.right(1);
			turt.forward(disdeg);
		}
		turt.forward(height*5/12);
		turt.left(180);
		turt.penUp();
		turt.forward(width);
		turt.penDown();
	}
	public void writeC()
	{
		turt.penUp();
		turt.forward(width);
		turt.left(90);
		turt.forward(height/2);
		double cont=height/10000;
		double x=width/2-.000000001;
		double angle=90;
		while(angle<134.95)
		{
			turt.forward(cont);
			x+=cont*Math.cos(angle/radtodeg);
			double angs=180+1*radtodeg*Math.atan(getHalfSlope(2*x/width));
			turt.left(angs-angle);
			angle=angs;
		}
		turt.penDown();
		while(x>width/-2)
		{
			turt.forward(cont);
			double angs=180+1*radtodeg*Math.atan(getHalfSlope(2*x/width));
			turt.left(angs-angle);
			x+=cont*Math.cos(angle/radtodeg);
			angle=angs;
		}
		turt.left(270-angle);
		angle=270;
		x=-1*width/2+.000001;
		while(angle<405)
		{
			turt.forward(cont);
			double angs=-1*radtodeg*Math.atan(getHalfSlope(2*x/width));
			turt.left(angs-angle);
			x+=cont*Math.cos(angle/radtodeg);
			angle=360+angs;
		}
		turt.penUp();
		while(x<width/2)
		{
			turt.forward(cont);
			double angs=-1*radtodeg*Math.atan(getHalfSlope(2*x/width));
			turt.left(angs-angle);
			x+=cont*Math.cos(angle/radtodeg);
			angle=360+angs;
		}
		turt.left(180);
		turt.forward(height/2);
		turt.left(90);
		turt.penDown();
	}
	public void writeD()
	{
		turt.left(90);
		turt.forward(height);
		turt.right(90);
		double cont=height/10000;
		double x=0;
		double angle=0;
		while(x<width)
		{
			turt.forward(cont);
			double angs=-1*radtodeg*Math.atan(getFullSlope(x/width));
			turt.right(angs-angle);
			x+=cont*Math.cos(angle/radtodeg);
			angle=angs;
		}
		turt.right(90-angle);
		angle=90;
		x=width-.000000000001;
		while(x>0)
		{
			turt.forward(cont);
			double angs=180+1*radtodeg*Math.atan(getFullSlope(x/width));
			turt.right(angs-angle);
			x+=cont*Math.cos(angle/radtodeg);
			angle=angs;
		}
		turt.right(0-angle);
		turt.penUp();
		turt.forward(width);
		turt.penDown();
	}
	public void writeE()
	{
		turt.left(90);
		turt.forward(height);
		turt.right(90);
		turt.forward(width);
		turt.right(90);
		turt.penUp();
		turt.forward(height/2);
		turt.penDown();
		turt.right(90);
		turt.forward(width);
		turt.left(90);
		turt.forward(height/2);
		turt.left(90);
		turt.forward(width);
	}
	public void writeF()
	{
		turt.left(90);
		turt.forward(height);
		turt.right(90);
		turt.forward(width);
		turt.right(90);
		turt.penUp();
		turt.forward(height/2);
		turt.penDown();
		turt.right(90);
		turt.forward(width);
		turt.left(90);
		turt.forward(height/2);
		turt.left(90);
		turt.penUp();
		turt.forward(width);
		turt.penDown();
	}
	public void writeG()
	{
		//nearly perfect letter
		double cont=height/10000;
		turt.penUp();
		turt.forward(width);
		turt.left(90);
		turt.forward(height/2);
		double x=width/2-.000000001;
		double angle=90;
		while(angle<134.95)
		{
			turt.forward(cont);
			x+=cont*Math.cos(angle/radtodeg);
			double angs=180+1*radtodeg*Math.atan(getHalfSlope(2*x/width));
			turt.left(angs-angle);
			angle=angs;
		}
		turt.left(135-angle);
		turt.penDown();
		angle=135;
		while(x>width/-2)
		{
			turt.forward(cont);
			double angs=180+1*radtodeg*Math.atan(getHalfSlope(2*x/width));
			turt.left(angs-angle);
			x+=cont*Math.cos(angle/radtodeg);
			angle=angs;
		}
		turt.left(270-angle);
		x=-1*width/2+.00001;
		while(x<width/2)
		{
			turt.forward(cont);
			double angs=-1*radtodeg*Math.atan(getHalfSlope(2*x/width));
			turt.left(angs-angle);
			x+=cont*Math.cos(angle/radtodeg);
			angle=360+angs;
		}
		turt.left(540-angle);
		turt.forward(width/2);
		turt.left(180);
		turt.forward(width/2);
		turt.right(90);
		turt.penUp();
		turt.forward(height/2);
		turt.penDown();
		turt.left(90);
	}
	public void writeH()
	{
		turt.left(90);
		turt.forward(height);
		turt.left(180);
		turt.forward(height/2);
		turt.left(90);
		turt.forward(width);
		turt.left(90);
		turt.forward(height/2);
		turt.left(180);
		turt.forward(height);
		turt.left(90);
	}
	public void writeI()
	{
		turt.forward(width/2);
		turt.left(90);
		turt.forward(height);
		turt.left(90);
		turt.forward(width/2);
		turt.left(180);
		turt.forward(width);
		turt.left(180);
		turt.forward(width/2);
		turt.left(90);
		turt.forward(height);
		turt.left(90);
		turt.forward(width/2);
	}
	public void writeK()
	{
		double hypotenuse=width/2*Math.sqrt(6.25);
		turt.left(90);
		turt.forward(height);
		turt.left(180);
		turt.forward(height/2);
		turt.left(90+radtodeg*Math.atan(3/4.0));
		turt.forward(hypotenuse);
		turt.left(180);
		turt.forward(hypotenuse);
		turt.left(2*radtodeg*Math.atan(4/3.0));
		turt.forward(hypotenuse);
		turt.left(radtodeg*Math.atan(3/4.0));
	}
	public void writeL()
	{
		turt.left(90);
		turt.forward(height);
		turt.left(180);
		turt.forward(height);
		turt.left(90);
		turt.forward(width);
	}
	public void writeM()
	{
		double hypotenuse=height/3*Math.sqrt(2);
		turt.left(90);
		turt.forward(height);
		turt.right(135);
		turt.forward(hypotenuse);
		turt.left(90);
		turt.forward(hypotenuse);
		turt.right(135);
		turt.forward(height);
		turt.left(90);
	}
	public void writeN()
	{
		turt.left(90);
		turt.forward(height);
		turt.right(90+radtodeg*Math.atan(3/2.0));
		turt.forward(height*Math.sqrt(13)/3);
		turt.left(90+radtodeg*Math.atan(3/2.0));
		turt.forward(height);
		turt.left(180);
		turt.forward(height);
		turt.left(90);
	}
	public void writeO()
	{
		//nearly perfect letter
		double cont=height/10000;
		turt.penUp();
		turt.forward(width/2);
		turt.penDown();
		double x=0;
		double angle=0;
		while(x<width/2)
		{
			turt.forward(cont);
			double angs=-1*radtodeg*Math.atan(getHalfSlope(2*x/width));
			turt.left(angs-angle);
			x+=cont*Math.cos(angle/radtodeg);
			angle=angs;
		}
		turt.left(90-angle);
		angle=90;
		x=width/2-.000000000001;
		while(x>width/-2)
		{
			turt.forward(cont);
			double angs=180+1*radtodeg*Math.atan(getHalfSlope(2*x/width));
			turt.left(angs-angle);
			x+=cont*Math.cos(angle/radtodeg);
			angle=angs;
		}
		turt.left(270-angle);
		angle=270;
		x=-1*width/2+.000000000001;
		while(x<0)
		{
			turt.forward(cont);
			double angs=-1*radtodeg*Math.atan(getHalfSlope(2*x/width));
			turt.left(angs-angle);
			x+=cont*Math.cos(angle/radtodeg);
			angle=360+angs;
		}
		turt.left(360-angle);
		turt.penUp();
		turt.forward(width/2);
		turt.penDown();
	}
	public void writeP()
	{
		turt.left(90);
		turt.forward(height);
		turt.right(90);
		turt.forward(5*width/8);
		for(int a=0; a<180; a++)
		{
			turt.right(1);
			turt.forward(3*Math.PI*width/1440);
		}
		turt.forward(5*width/8);
		turt.penUp();
		turt.left(90);
		turt.forward(height/2);
		turt.left(90);
		turt.forward(width);
		turt.penDown();
	}
	public void writeQ()
	{
		//nearly perfect letter
		//requires writeO() method
		writeO();
		turt.left(180);
		turt.penUp();
		turt.forward(width/2);
		turt.right(90);
		turt.forward(height/2);
		turt.penDown();
		turt.right(90+radtodeg*Math.atan(3/2.0));
		turt.forward(height*Math.sqrt(13)/6);
		turt.left(radtodeg*Math.atan(3/2.0));
	}
	public void writeR()
	{
		turt.left(90);
		turt.forward(height);
		turt.right(90);
		turt.forward(5*width/8);
		for(int a=0; a<180; a++)
		{
			turt.right(1);
			turt.forward(3*Math.PI*width/1440);
		}
		turt.forward(5*width/8);
		turt.left(90+radtodeg*Math.atan(4/3.0));
		turt.forward(width*Math.sqrt(6.25)/2);
		turt.left(radtodeg*Math.atan(3/4.0));
	}
	public void writeS()
	{
		//thinner than other letters, but takes up the same space
		turt.penUp();
		turt.forward(7*width/8);
		turt.left(90);
		turt.forward(3*height/4);
		for(int a=90; a<135; a++)
		{
			turt.left(1);
			turt.forward(Math.PI*width/480);
		}
		turt.penDown();
		for(int b=135; b<360; b++)
		{
			turt.left(1);
			turt.forward(Math.PI*width/480);
		}
		for(int c=360; c>135; c--)
		{
			turt.right(1);
			turt.forward(Math.PI*width/480);
		}
		turt.penUp();
		for(int d=135; d>90; d--)
		{
			turt.right(1);
			turt.forward(Math.PI*width/480);
		}
		turt.left(180);
		turt.forward(height/4);
		turt.left(90);
		turt.forward(width);
		turt.penDown();
	}
	public void writeT()
	{
		turt.left(90);
		turt.penUp();
		turt.forward(height);
		turt.penDown();
		turt.right(90);
		turt.forward(width);
		turt.left(180);
		turt.forward(width/2);
		turt.left(90);
		turt.forward(height);
		turt.left(90);
		turt.penUp();
		turt.forward(width/2);
		turt.penDown();
	}
	public void writeV()
	{
		double angle=radtodeg*Math.atan(3/1.0);
		double hypotenuse=height*Math.sqrt(10)/3;
		turt.left(90);
		turt.penUp();
		turt.forward(height);
		turt.penDown();
		turt.right(90+angle);
		turt.forward(hypotenuse);
		turt.left(angle*2);
		turt.forward(hypotenuse);
		turt.right(90+angle);
		turt.penUp();
		turt.forward(height);
		turt.penDown();
		turt.left(90);
	}
	public void writeW()
	{
		double hypotenuse=height*Math.sqrt(9.25)/3;
		double angle=radtodeg*Math.atan(3/.5);
		turt.left(90);
		turt.penUp();
		turt.forward(height);
		turt.penDown();
		turt.right(90+angle);
		turt.forward(hypotenuse);
		turt.left(angle*2);
		turt.forward(hypotenuse);
		turt.right(angle*2);
		turt.forward(hypotenuse);
		turt.left(angle*2);
		turt.forward(hypotenuse);
		turt.right(90+angle);
		turt.penUp();
		turt.forward(height);
		turt.penDown();
		turt.left(90);
	}
	public void writeX()
	{
		double hypotenuse=height*Math.sqrt(13)/3;
		double angle1=radtodeg*Math.atan(3/2.0);
		double angle2=radtodeg*Math.atan(2/3.0);
		turt.left(angle1);
		turt.forward(hypotenuse);
		turt.left(90+angle2);
		turt.penUp();
		turt.forward(width);
		turt.penDown();
		turt.left(90+angle2);
		turt.forward(hypotenuse);
		turt.left(angle1);
	}
	public void writeY()
	{
		double hypotenuse=width*Math.sqrt(3.25)/2;
		double angle1=radtodeg*Math.atan(1.5);
		double angle2=radtodeg*Math.atan(1/1.5);
		turt.left(90);
		turt.penUp();
		turt.forward(height);
		turt.penDown();
		turt.right(90+angle1);
		turt.forward(hypotenuse);
		turt.right(angle2);
		turt.forward(height/2);
		turt.left(180);
		turt.forward(height/2);
		turt.right(angle2);
		turt.forward(hypotenuse);
		turt.right(90+angle1);
		turt.penUp();
		turt.forward(height);
		turt.penDown();
		turt.left(90);
	}
	public void writeZ()
	{
		double angle=radtodeg*Math.atan(2/3.0);
		turt.left(90);
		turt.penUp();
		turt.forward(height);
		turt.penDown();
		turt.right(90);
		turt.forward(width);
		turt.right(90+angle);
		turt.forward(height*Math.sqrt(13)/3);
		turt.left(90+angle);
		turt.forward(width);
	}
	//numbers are in boxes of various sizes, commented on first line
	//caution! methods are both mutators and accessors
	//all return the number of pixels traveled forward
	public double write0()
	{
		//1
		turt.penUp();
		turt.forward(height/2);
		turt.penDown();
		for(int a=0; a<360; a++)
		{
			turt.left(1);
			turt.forward(Math.PI*height/360);
		}
		turt.penUp();
		turt.forward(height/2);
		turt.penDown();
		return height;
	}
	public double write1()
	{
		//0
		turt.left(90);
		turt.forward(height);
		turt.left(180);
		turt.forward(height);
		turt.left(90);
		return 0;
	}
	public double write2()
	{
		//imperfect letter
		//2/3
		turt.left(90);
		turt.penUp();
		turt.forward(2*height/3);
		turt.penDown();
		double b=0;
		for(int a=1; a<10*radtodeg*Math.atan(1/.8)+1800; a++)
		{
			turt.right(.1);
			turt.forward(Math.PI*height/5400);
			b=a;
		}
		turt.left(180+radtodeg*Math.atan(1/.8)-b/10);
		turt.forward(2*height/3);
		turt.left(90+radtodeg*Math.atan(1/.8));
		turt.forward(2*height/3);
		return 2*height/3;
	}
	public double write3()
	{
		//1/2
		turt.left(90);
		turt.penUp();
		turt.forward(3*height/4);
		for(int a=0; a<45; a++)
		{
			turt.right(1);
			turt.forward(Math.PI*height/720);
		}
		turt.penDown();
		for(int a=0; a<225; a++)
		{
			turt.right(1);
			turt.forward(Math.PI*height/720);
		}
		turt.left(180);
		for(int a=0; a<225; a++)
		{
			turt.right(1);
			turt.forward(Math.PI*height/720);
		}
		turt.penUp();
		for(int a=0; a<45; a++)
		{
			turt.right(1);
			turt.forward(Math.PI*height/720);
		}
		turt.right(90);
		turt.forward(height/2);
		turt.right(90);
		turt.forward(height/4);
		turt.penDown();
		turt.left(90);
		return height/2;
	}
	public double write4()
	{
		//1/2
		turt.left(90);
		turt.penUp();
		turt.forward(height);
		turt.penDown();
		turt.left(180);
		turt.forward(height/2);
		turt.left(90);
		turt.forward(height/2);
		turt.left(90);
		turt.forward(height/2);
		turt.left(180);
		turt.forward(height);
		turt.left(90);
		return height/2;
	}
	public double write5()
	{
		//3/4
		turt.left(90);
		turt.penUp();
		turt.forward(height);
		turt.penDown();
		turt.right(90);
		turt.forward(3*height/4);
		turt.left(180);
		turt.forward(3*height/4);
		turt.left(90);
		turt.forward(5*height/8);
		turt.left(180);
		for(int a=0; a<315; a++)
		{
			turt.right(1);
			turt.forward(Math.PI*height/480);
		}
		turt.penUp();
		for(int a=0; a<45; a++)
		{
			turt.right(1);
			turt.forward(Math.PI*height/480);
		}
		turt.left(180);
		turt.forward(3*height/8);
		turt.left(90);
		turt.forward(3*height/4);
		turt.penDown();
		return 3*height/4;
	}
	public double write6()
	{
		//2/3
		turt.penUp();
		turt.forward(2*height/3);
		turt.left(90);
		turt.forward(2*height/3);
		turt.penDown();
		for(int a=0; a<180; a++)
		{
			turt.left(1);
			turt.forward(Math.PI*height/540);
		}
		turt.forward(height/3);
		for(int b=0; b<360; b++)
		{
			turt.left(1);
			turt.forward(Math.PI*height/540);
		}
		turt.penUp();
		turt.forward(height/3);
		turt.left(90);
		turt.forward(2*height/3);
		turt.penDown();
		return 2*height/3;
	}
	public double write7()
	{
		//1/2
		turt.left(90);
		turt.penUp();
		turt.forward(height);
		turt.penDown();
		turt.right(90);
		turt.forward(height/2);
		turt.right(90+radtodeg*Math.atan(1/2.0));
		turt.forward(height*Math.sqrt(5)/2);
		turt.left(90+radtodeg*Math.atan(1/2.0));
		turt.penUp();
		turt.forward(height/2);
		turt.penDown();
		return height/2;
	}
	public double write8()
	{
		//1/2
		turt.left(90);
		turt.penUp();
		turt.forward(height);
		turt.right(90);
		turt.forward(height/4);
		turt.penDown();
		for(int a=0; a<540; a++)
		{
			turt.right(1);
			turt.forward(Math.PI*height/720);
		}
		for(int b=0; b<540; b++)
		{
			turt.left(1);
			turt.forward(Math.PI*height/720);
		}
		turt.penUp();
		turt.forward(height/4);
		turt.penDown();
		return height/2;
	}
	public double write9()
	{
		//1/2
		turt.left(90);
		turt.penUp();
		turt.forward(height);
		turt.right(90);
		turt.forward(height/4);
		turt.penDown();
		for(int a=0; a<450; a++)
		{
			turt.right(1);
			turt.forward(Math.PI*height/720);
		}
		turt.left(180);
		turt.forward(height/4);
		turt.left(180);
		turt.forward(height);
		turt.left(90);
		return height/2;
	}
}