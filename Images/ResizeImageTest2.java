import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;

public class ResizeImageTest2 {
	public static void main(String[] args) {
		
		MyFrame2 frame2 = new MyFrame2();
		frame2.setTitle("Image Resizing");
		frame2.setSize(500, 500);
		frame2.setResizable(true);
		frame2.show();    		
	} // End of main method
} // End of class ResizeImageTest1


class MyFrame2 extends Frame {
	private Image im;
	private JSlider redSlider  = new JSlider(0, 100, 60);	
	private JPanel southPanel = new JPanel();  
	public MyFrame2() {
		im =    Toolkit.getDefaultToolkit(). getImage("kfupmtwr.jpg"); 		
		sliderColorListener slider_listener = new sliderColorListener();		
        redSlider.addChangeListener(slider_listener);
        southPanel.setLayout(new GridLayout(1, 2));
      	southPanel.add(new JLabel("Red",SwingConstants.RIGHT));
      	southPanel.add(redSlider);
      	//Container contentPane = getContentPane();        
      	//contentPane.add(southPanel, "South");
      	add(southPanel, "South");
	} // End of MyFrame1() constructor
	
	public void paint(Graphics g) {
	    g.drawImage(im, 50, 50, im.getWidth(this) * 2, im.getHeight(this) * 2, this);
	} // End of paint() method
	
	private class sliderColorListener implements ChangeListener
    {
    	public void stateChanged(ChangeEvent event)
    	{
    		//setSampleColorBySlider();
    	}
    }
	
} // End of MyFrame2 class
