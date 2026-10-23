import javax.swing.*;
import java.awt.*;

public class ImageinPanel extends JFrame {
      private DefaultBoundedRangeModel model = new DefaultBoundedRangeModel(100,0,0,100);
   
      private ImageIcon image = new ImageIcon("tower1.jpg");
      private ImageView imageView = new ImageView(image, model);
      
      public ImageinPanel() {
            super("The Observer Design Pattern");
            Container contentPane = getContentPane();
            JPanel panel = new JPanel();
            contentPane.add(panel, BorderLayout.NORTH);
            contentPane.add(imageView, BorderLayout.CENTER);
      }
      public static void main(String args[]) {
            ImageinPanel test = new ImageinPanel();
            test.setBounds(100,100,400,350);
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