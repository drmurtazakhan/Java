// clipboard.java
// Example to show how to define your own Transferable objects
// This is code just for *example's* sake.  There are other
// easier ways to do copy/paste on text components (see Java's
// APIs, they provide that behavior already)
//
// loosely based on technote at sun's web page
// http://developer.java.sun.com/developer/TechTips/1999/tt0414.html
//
import javax.swing.*;
import java.awt.datatransfer.*;
import java.awt.event.*;
import java.awt.Toolkit;

class clipboard {
	public static void main(String argv[]) {
		new Example();
	}
}

class TText implements Transferable {
	protected static DataFlavor[]  supported =
		{ DataFlavor.stringFlavor };
	protected String theText;		// what was copied

	TText(String text) { theText = text; }

	public DataFlavor[] getTransferDataFlavors()
		{ return supported; }
	public boolean isDataFlavorSupported(DataFlavor f)
		{ return (f == DataFlavor.stringFlavor); }
	public Object getTransferData(DataFlavor f)
	{
		if (f.equals(DataFlavor.stringFlavor))
			return theText;
		else
			//... exception ...
			return null;
	}
}

class Example {
	private JFrame w = new JFrame("Clipboard Example");
	private JButton copy = new JButton("Copy");
	private JButton paste = new JButton("Paste");
	private JTextArea text = new JTextArea(5, 20);
	private Example me;
	public Example() {
		me = this;
		JPanel p = new JPanel();
		p.add(copy);
		copy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				// do a copy
				me.doCopy();
			}});
		p.add(paste);
		paste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				// do a paste
				me.doPaste();
			}});

		p.add(text);
		w.getContentPane().add(p);
		w.show();
	}
	public void doCopy()
	{
		TText t = new TText(text.getSelectedText());
		Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
		c.setContents(t, null); 
	}
	
	public void doPaste()
	{
		Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
		Transferable t = c.getContents(this);

		try {
			// you could check if not legal, throw an exception
			// if (t.isDataFlavorSupported(DataFlavor.stringFlavor))
			String s = (String)t.getTransferData(DataFlavor.stringFlavor);
			text.replaceSelection(s);
        }
        catch (Throwable exc) {
			System.err.println(exc);
        }
	}
}