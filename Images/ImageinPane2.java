import javax.swing.*;
import java.awt.*;
import java.awt.image.*;

public class ImageinPane2 extends JFrame {
	
     private ImageIcon image;
     private ImageView imageView;
     private JPanel imgPanel=new JPanel();
     
     
      public void ImagePaneMake(Image imgn) {
            DefaultBoundedRangeModel model = new DefaultBoundedRangeModel(100,0,0,100);
            image=new ImageIcon(imgn);
            imageView = new ImageView(image, model);
            
            imgPanel.setLayout(new BorderLayout());
            imgPanel.add(imageView);
            setBounds(100,100,400,350);
            
      }
      
      public ImageinPane2()
      {
      	    //1. Get Filter Image
      	    int fmask=0xFF0000FF;  //blue
      	    //int fmask=0xFFFFFFAF; //mix
      	    MyImageFilter f = new MyImageFilter(fmask);
      	    Image fimg=f.getFiltImg();
      	    
      	    //2. Put fitered Image in Pane   
      	    ImagePaneMake(fimg);
      	    
      	    //3. Put imgPanel in Container
      	    Container contentPane = getContentPane();
            contentPane.add(imgPanel, BorderLayout.CENTER);            
            
      }
      
      public static void main(String args[]) {
      	    
    	    ImageinPane2 test = new ImageinPane2(); 
      	    test.show();             
      }
 
}


class ImageView extends JScrollPane {
      private JPanel panel = new JPanel();
      private Dimension originalSize = new Dimension();
      private Image originalImage;
      private ImageIcon icon;

      public ImageView(ImageIcon icon, BoundedRangeModel model) {
            panel.setLayout(new BorderLayout());
            panel.add(new JLabel(icon));
            this.icon = icon;
            this.originalImage = icon.getImage();
            setViewportView(panel);
            originalSize.width = icon.getIconWidth();
            originalSize.height = icon.getIconHeight();
      }
 
}

class MyFilter extends RGBImageFilter {
	private int mask;
	protected boolean canFilterIndexColorModel = true;
	public MyFilter(int fmask)
	{
		mask=fmask;
	}
	public int filterRGB(int x, int y, int rgb) {
		return rgb & mask; 
	}
}

class MyImageFilter extends Frame {
	Image im, blueim;
	public MyImageFilter(int fmask){
		im =    Toolkit.getDefaultToolkit().getImage("tower1.jpg");		
		MyFilter filtBlue = new MyFilter(fmask);
		FilteredImageSource fis = new FilteredImageSource(im.getSource(), filtBlue);
		blueim = createImage(fis);
	}
	public Image getFiltImg()
	{
		return blueim;
	} 
} 