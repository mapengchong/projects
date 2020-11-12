import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Legos1 extends JFrame {
	int startX,startY,legoWidth,legoHeight,baseLength;
	Legos1(int X,int Y,int width,int height, int base)
	{
		//Declaring the variables.
		startX=X;
		startY=Y;
		legoWidth=width;
		legoHeight=height;
		baseLength=base;
	}
	@Override
	public void paint(Graphics g) {
		int X,Y;
		super.paint(g);
		
		// Decrease the number by one for next row until there is only one.  
		for(int j=baseLength;j>=1;j--)
		{
			X=startX;
			Y=startY;
			// start a loop drawing rectangles.
			
		for(int i=1;i<=j;i++)
		{
			// if the index is equal,then it's blue otherwise it's red.
			if(i%2==0)
			{
				g.setColor(Color.blue);
			}
			else
			{
					g.setColor(Color.red);
			}
			//drawing rectangle.
		g.fillRoundRect(X, Y, legoWidth, legoHeight,2,2);
		
		// The x coordinate of next rectangle can be calculated by adding width to the coordinate of previous.
		// The y coordinate will be the same as the next rectangle in the same line.
		X=X+legoWidth;
		}
		// for next row the x coordinate of first rectangle can be calculated by the adding half width to the x coordinate of first rectangle of previous.
		// The Y coordinate of next can be calculated by decreasing the height from the previous y coordinates as the next is above the previous.
		
		startX=startX+(legoWidth/2);
		startY=startY-legoHeight;

		}
	}
	public static void main(String[] args) {
		
		Legos1 l1=new Legos1(20,300,50,20,10);
		l1.setSize(550, 325);
		l1.setVisible(true);
	}
}
