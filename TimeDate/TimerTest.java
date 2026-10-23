/**@Author Murtaza Ali Khan --> murtaza@ccse.kfupm.edu.sa*/
import java.util.*;
import java.awt.*;
import javax.swing.*;
public class TimerTest
{	public static void main(String args[])
	{
		new GUI();
	}	
}
class GUI extends JFrame
{
	private JButton b1 = new JButton();
	private JButton b2 = new JButton();
	private JButton b3 = new JButton();
	private JButton b4 = new JButton();
	private JLabel tL = new JLabel("Time Left");
	private JTextField timeTF  = new JTextField(5);   	
	private JPanel tP  = new JPanel();
	private JPanel bP  = new JPanel();
	public GUI()
	{
		Container cp = getContentPane();
		tP.setLayout(new FlowLayout());
		tP.add(tL);
		tP.add(timeTF);
		cp.add("North",tP);
		bP.setLayout(new GridLayout(2,2));
		bP.add(b1);bP.add(b2);bP.add(b3);bP.add(b4);
		cp.add("Center", bP);
		setTitle("Timer Design by Murtaza Khan");
        setSize(250,250);
        show();
		TimeThread t1 = new TimeThread();
		t1.start();		
	}
	
	class TimeThread extends Thread // inner class
	{
		int m=60;
		public void run()
		{
		    for (int i=120; i>=0; i--)
			{
				System.out.println(i/m+":"+i%60);	
				timeTF.setText(i/m+":"+i%60);
				String[] d = randomStringArray();
				b1.setText(d[0]); b2.setText(d[1]);b3.setText(d[2]);b4.setText(d[3]);		
				try{ Thread.sleep(1000); } catch(InterruptedException e){}
			}
			
		}
	} // end of inner class
	
	public static String[] randomStringArray()
	{
		int range=26;
		int count=4;
		int[] a = new int[count];
		String[] b = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		String[] c = new String[count];
		Random generator = new Random();
		for (int i = 0; i < count; i++)
		{
			a[i] = generator.nextInt(range-1);
			c[i]=b[a[i]];
		}
		
		return c;
	}
}
