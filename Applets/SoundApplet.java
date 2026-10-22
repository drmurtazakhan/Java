import java.applet.*;
import java.awt.*;
import javax.swing.*;

public class SoundApplet extends JApplet 
{
	AudioClip clip;
	public void init()
	{
		clip=getAudioClip(getDocumentBase(),getParameter("adel.mp3"));		
		start();
	}
	public void start()
	{
		clip.loop();		
	}
	public void stop()
	{
		clip.stop();		
	}	
	public void paint(Graphics g) 
	{
		Graphics2D g2 = (Graphics2D) g; 
				
		
	}
	
	
}
		