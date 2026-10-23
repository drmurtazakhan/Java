import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TwoImageObs extends JFrame {
      private DefaultBoundedRangeModel model =
                  new DefaultBoundedRangeModel(100,0,0,100);

      private JSlider slider = new JSlider(model);
      private JLabel readOut = new JLabel("100%");

      private ImageIcon image = new ImageIcon("tower1.jpg");
      private ImageView imageView = new ImageView(image, model);

      public TwoImageObs() {
            super("The Observer Design Pattern");
            Container contentPane = getContentPane();
            JPanel panel = new JPanel();

            panel.add(new JLabel("Set Image Size:"));
            panel.add(slider);
            panel.add(readOut);

            contentPane.add(panel, BorderLayout.NORTH);
            contentPane.add(imageView, BorderLayout.CENTER);

            model.addChangeListener(new ReadOutSynchronizer());
      }
      public static void main(String args[]) {
            TwoImageObs test = new TwoImageObs();
            test.setBounds(100,100,400,350);
            test.show();
      }
      class ReadOutSynchronizer implements ChangeListener {
            public void stateChanged(ChangeEvent e) {
                  String s = Integer.toString(model.getValue());
                  readOut.setText(s + "%");
                  readOut.revalidate();
            }
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
            model.addChangeListener(new ModelListener());

            originalSize.width = icon.getIconWidth();
            originalSize.height = icon.getIconHeight();
      }
      class ModelListener implements ChangeListener {
            public void stateChanged(ChangeEvent e) {
              BoundedRangeModel model =
               (BoundedRangeModel)e.getSource();

                  if(model.getValueIsAdjusting()) {
                        int min = model.getMinimum(),
                              max = model.getMaximum(),
                              span = max - min,
                              value = model.getValue();

                        double multiplier = (double)value / (double)span;

                        multiplier = multiplier == 0.0 ?
                                           0.01 : multiplier;
                        
                        Image scaled = originalImage.getScaledInstance(
                              (int)(originalSize.width * multiplier),
                              (int)(originalSize.height * multiplier),
                              Image.SCALE_FAST);

                        icon.setImage(scaled);
                        panel.revalidate();
                        panel.repaint();
                  }
            }
      }
}