import java.awt.*;
import java.awt.image.*; // Very important...

class OriginalImage extends Frame {
	Image im;
	public OriginalImage() {
		super("Original Image");
		im =    Toolkit.getDefaultToolkit(). getImage("kfupmtwr.jpg");
		setSize(400,400);
		show();
	}
	public void paint(Graphics g) {		
		g.drawImage(im, 50, 50, this);
	}
}	

class CropImage extends Frame {
	Image im, cropped;
	public CropImage() {
		super("Cropped Image");
		im =    Toolkit.getDefaultToolkit(). getImage("kfupmtwr.jpg");
		CropImageFilter filt = new CropImageFilter(0, 217/2, 135, 217/2);		
		FilteredImageSource fis = new FilteredImageSource(im.getSource(), filt);
		cropped = createImage(fis);
		setSize(400,400);
		show();
	} // End of CropImage() constructor 
	public void paint(Graphics g) {		
		g.drawImage(cropped,50,50+217/2, this);
	}
}

public class CorpImageTestMajor1{	
	public static void main(String args[]) {
		new OriginalImage();
		new CropImage();
	} 
} 

