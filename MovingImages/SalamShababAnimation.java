import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SalamShababAnimation extends JApplet{
       private Button myButton;
       private boolean onOffButton = true;
       private AnimationPanel ap;
       public void init() { //validate parsing the parameter "fps"
           int delay = Integer.parseInt(getParameter("fps"));
           delay = (delay<10)? 10 : delay;
           Container cp = getContentPane();
           cp.setLayout(new BorderLayout());
           ap = new AnimationPanel(delay);
           myButton = new Button ("Start/Stop");
           myButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                   onOffButton = !onOffButton;
                   ap.setOnOff(onOffButton);
                   }});
           cp.add(myButton,BorderLayout.NORTH);
           cp.add(ap, BorderLayout.CENTER);
       }
}


class AnimationPanel extends JPanel implements Runnable {
       private Font myFont;
       private int increment = 1;
       public int xSize, ySize, yCoord = 0;
       int delay;
       Thread animator;
       private boolean onOff=true;
       public AnimationPanel(int delay) {
           xSize=400;
           ySize=350;
           setSize(xSize, ySize);
           myFont = new Font ("Serif", Font.ITALIC, 30);
           animator = new Thread(this);
           animator.start();
       }
       public void setOnOff(boolean onOff) {
          this.onOff = onOff;
       }

	public void paintComponent(Graphics  g) {
           super.paintComponent(g);
           g.setColor(Color.yellow);
           g.fillRect(0,0,xSize, ySize);
           g.setColor (Color.red);
           g.setFont(myFont);
           if(onOff) {
              g.drawString ("Salaam ", xSize/2-100, ySize/2 + yCoord);
              g.drawString ("Shabab!", xSize/2, ySize/2 - yCoord);
           }
    }
       public void run () {
          while(true){
             yCoord = yCoord + increment;//yCoord min is -150 and max 150
             if((yCoord == (ySize-50)/2 || (yCoord == -(ySize-50)/2)))
                increment = -increment; // increment by -1 now
             try{
                Thread.sleep(delay);
             } catch(InterruptedException e){}
             repaint();
           }
       }
}
