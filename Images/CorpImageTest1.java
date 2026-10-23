import java.awt.*;
import java.awt.image.*; // Very important...


class CropImage extends Frame {
	Image im, cropped;
	public CropImage() {
		//super("Cropped Image");
		im =    Toolkit.getDefaultToolkit(). getImage("kfupmtwr.jpg");
		CropImageFilter filt = new CropImageFilter(0, 50, 100, 100);		
		FilteredImageSource fis = new FilteredImageSource(im.getSource(), filt);
		//getSource() Gets the object that produces the pixels for the image
		cropped = createImage(fis);
	} // End of CropImage() constructor 

	public void paint(Graphics g) {		
		// g.drawImage(im, 0, 0, this);
		g.drawImage(cropped, 100, 100, this);
	}
}



public class CorpImageTest1{	
	public static void main(String args[]) {
		CropImage f = new CropImage();
		f.setTitle("Cropped Image");
		f.show();
		f.setSize(400,400);		
	} // End of main() method
} // End of class Test

