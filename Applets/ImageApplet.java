import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;

public class ImageApplet extends Applet 
{
	Image myImage;
	
	public void init() 
	{
		myImage = getImage(getDocumentBase(), "Images/Islamic/Allah.jpg");
	}
	
	public void paint(Graphics g) 
	{
		int imageWidth = myImage.getWidth(this);  // original width of image
		int imageHeight = myImage.getHeight(this); // original height of image
		imageWidth = 2*imageWidth; // setting width of image
		imageHeight = (int) (1.5*imageHeight); // setting height of image
		int xPos = ( getWidth()-imageWidth )/2;   // centering x coordinate
		int yPos= ( getHeight()-imageHeight )/2; // centering y coordinae
		
		setBackground(Color.pink);
		//image is draw in center of applet screen. 
		g.drawImage (myImage,xPos,yPos,imageWidth,imageHeight,this);			
	}
}

