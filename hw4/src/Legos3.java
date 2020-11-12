import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Legos3 extends JFrame {
	int startX,startY,legoWidth,legoHeight,baseLength;
	
	Color ColorArray[]={Color.red,Color.blue,Color.yellow,Color.green,Color.pink,Color.black,Color.magenta,Color.orange,Color.cyan};
	Random rnd=new Random();
	
	Legos3(int X,int Y,int width,int height, int base)
	{
		startX=X;
		startY=Y;
		legoWidth=width;
		legoHeight=height;
		baseLength=base;
		
	}
	@Override
	public void paint(Graphics g) {
		int X,Y,col,temp;
		super.paint(g);
		for(int j=baseLength;j>=1;j--)
		{
			X=startX;
			Y=startY;
		col=rnd.nextInt(ColorArray.length);
		for(int i=1;i<=j;i++)
		{
			
			g.setColor(ColorArray[col]);
			g.fillRoundRect(X, Y, legoWidth, legoHeight,2,2);
			X=X+legoWidth;
			//randomly select next integer.
			temp=rnd.nextInt(ColorArray.length);
			
			//if the next integer is same as the previous, keep selecting until different. 
			while(temp==col)
			{
				
				temp=rnd.nextInt(ColorArray.length);
			}
			// set different integer to be the index of ColorArray.
			col=temp;
		}
		startX=startX+(legoWidth/2);
		startY=startY-legoHeight;

		}
	}
	public static void main(String[] args) {
		
		Legos3 l1=new Legos3(20,300,50,20,10);
		l1.setSize(550, 325);
		l1.setVisible(true);
	}
}

