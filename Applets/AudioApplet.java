import java.applet.Applet;

import java.awt.Graphics;
import java.awt.Image;
import java.applet.AudioClip;
import java.awt.Toolkit;

public class AudioApplet extends Applet 
{
	Image myImage;
	AudioClip music;
	String ImgFile="E:/Murtaza_Data/Images/Allah02.jpg";
	
	//URL url = new URL (E:\Murtaza_Data\Images\Allah02.jpg);
	
	public void init() 
	{
		Image myImage = Toolkit.getDefaultToolkit().getImage(ImgFile);
		//myImage = getImage(E:/Murtaza_Data/Images/Allah02.jpg);
		//myImage = getImage(getDocumentBase(), "tower1.jpg");
		//String s=getDocumentBase()+" ";
		//System.out.println(s);
		music = getAudioClip(getDocumentBase(),"spacemusic.au");		
	}
	
	public void paint(Graphics g) 
	{
		
		/* convert the Graphics object to an object of the Graphics2D class */
		
		int iWidth = myImage.getWidth(this);
		int iHeight = myImage.getHeight(this);
		
		int xPos = 10;
		
		g.drawImage (myImage,xPos,10,iWidth/2,iHeight/2,this);
		
		xPos+=(iWidth/2)+10;
		g.drawImage (myImage,xPos,10,this);
		
		xPos+=iWidth+10;
		
		g.drawImage (myImage,xPos,10,iWidth+15,iHeight+15,this);
		
		music.loop();
				
		
	}
}

