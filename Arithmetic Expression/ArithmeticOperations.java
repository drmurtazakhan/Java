/*
 * @(#)ArithmeticOperations.java 1.0 01/01/22
 *
 * You can modify the template of this file in the
 * directory ..\JCreator\Templates\Template_1\Project_Name.java
 *
 * You can also create your own project template by making a new
 * folder in the directory ..\JCreator\Template\. Use the other
 * templates as examples.
 *
 */
 
import java.awt.*;
import java.awt.event.*;

class ArithmeticOperations extends Frame
{
	public ArithmeticOperations()
	{
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				dispose();
				System.exit(0);
			}
		});
	}
	
	public static void main(String args[])
	{
		System.out.println("Starting ArithmeticOperations...");
		ArithmeticOperations mainFrame = new ArithmeticOperations();
		mainFrame.setSize(400, 400);
		mainFrame.setTitle("ArithmeticOperations");
		mainFrame.setVisible(true);
	}
}
