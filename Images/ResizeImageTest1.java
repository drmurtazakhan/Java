import java.awt.*;
import java.applet.*;

public class ResizeImageTest1 {
	public static void main(String[] args) {
		
		MyFrame2 frame2 = new MyFrame2();
		frame2.setTitle("Not Resizable Frame");
		frame2.setSize(500, 500);
		frame2.setResizable(true);
		frame2.show();    		
	} // End of main method
} // End of class ResizeImageTest1


class MyFrame2 extends Frame {
	private Image im;  
	public MyFrame2() {
		im =    Toolkit.getDefaultToolkit(). getImage("kfupmtwr.jpg"); 		
	} // End of MyFrame1() constructor
	
	public void paint(Graphics g) {
	    g.drawImage(im, 50, 50, im.getWidth(this) * 2, im.getHeight(this) * 2, this);
	} // End of paint() method
} // End of MyFrame2 class
