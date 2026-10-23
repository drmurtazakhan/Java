import java.awt.*;
import java.awt.image.*;


class MyFrame1 extends Frame {
	private Image im;
	public MyFrame1() {
		im = Toolkit.getDefaultToolkit().getImage("kfupmtwr.jpg");
		} // End of MyFrame1() constructor
		public void paint(Graphics g) {
			g.drawImage(im, 50, 50, this);
			} // End of paint() method
} // End of MyFrame1 class


class BlueFilter extends RGBImageFilter {
	protected boolean canFilterIndexColorModel = true;
	public int filterRGB(int x, int y, int rgb) {
		//return rgb & 0xFFFF0000; //only red
		//return rgb & 0xFF00FF00; //only green
		//return rgb & 0xFF0000FF; //only blue
		return rgb & 0xFFAAAAFF; //mix
		}
}


class BlueImage extends Frame {
	Image im, blueim;
	public BlueImage(){
		im =    Toolkit.getDefaultToolkit().getImage("kfupmtwr.jpg");
		
		BlueFilter filtBlue = new BlueFilter();
		FilteredImageSource fis = new FilteredImageSource(im.getSource(), filtBlue);
		blueim = createImage(fis);
		} // End of RGBImageFrame() constructor
		public void paint(Graphics g) {
			g.drawImage(blueim, 50, 50, this);
			} // End of paint() method
	} // End of BlueImage() class

public class BlueImageTest1{
	 public static void main(String args[]) {
	 	MyFrame1 fr= new MyFrame1();
	 	fr.setTitle("Original Image");
	 	fr.show();
	 	fr.setSize(400,400);
	 	BlueImage f = new BlueImage();
	 	f.setTitle("Blue Filter Image");
	 	f.show();
	 	f.setSize(400,400);
	 	} // End of main() method
} // End of class Test