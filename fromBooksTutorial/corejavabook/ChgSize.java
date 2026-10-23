import java.applet.Applet;
import java.awt.*;

public class ChgSize extends Applet implements Runnable{


Font theFont;
Color[] colors =new Color[50];
Thread theThread;

public void start()
{
if (theThread == null)
theThread =new Thread(this);
theThread.start();
}

public void stop()
{
if (theThread != null)
theThread.stop();
theThread=null;
}

public void run ()
{

boolean flag=true;
int size,count;
setBackground(Color.white);
float c=0;

for (count=0;count<colors.length;count++)
{
   colors[count]=Color.getHSBColor(c, (float)1.0,(float)1.0);
   c+=0.2;
}
count =0;
size=10;
while(true)
 {
   theFont = new Font("Helvetica",Font.BOLD,size);
   setForeground(colors[count++]);
   if (flag==true) size+=5;
   if (flag==false) size-=5;
repaint();
try{ Thread.sleep(200);
} catch(InterruptedException e) {}
   if (size == 65 && flag==true)
   {
     flag=false;
   } 
   if (size == 5 && flag== false)
   {
     flag=true;
   }
if(count == colors.length) count =0;
   
 }
}
 
public void paint(Graphics g)
{

g.setFont(theFont);
g.drawString("Hello World!",60,50);
}
}
