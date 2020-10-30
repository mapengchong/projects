import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Legos2 extends JFrame {
	int startX,startY,legoWidth,legoHeight,baseLength;
	
	// Create array contain all the colors.
	Color ColorArray[]={Color.red,Color.blue,Color.yellow,Color.green,Color.pink,Color.black,Color.magenta,Color.orange,Color.cyan};
	
	Legos2(int X,int Y,int width,int height, int base)
	{
		startX=X;
		startY=Y;
		legoWidth=width;
		legoHeight=height;
		baseLength=base;
		
	}
	@Override
	public void paint(Graphics g) {
		int X,Y,col;
		super.paint(g);
		for(int j=baseLength;j>=1;j--)
		{
			X=startX;
			Y=startY;
			
		for(int i=1;i<=j;i++)
		{
			// Create object of random class.
			Random rnd=new Random();
			
			// select a number from 0 to ColorArray.length-1.
			col=rnd.nextInt(ColorArray.length);
			
			//set color at the randomly selected index in ColorArray.
			g.setColor(ColorArray[col]);
			
			//Drawing Rectangle.
		g.fillRoundRect(X, Y, legoWidth, legoHeight,2,2);
		X=X+legoWidth;
		}
		startX=startX+(legoWidth/2);
		startY=startY-legoHeight;

		}
	}
	public static void main(String[] args) {
		
		Legos2 l1=new Legos2(20,300,50,20,10);
		l1.setSize(550, 325);
		l1.setVisible(true);
	}
}


