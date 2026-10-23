import java.awt.*;
import java.io.*;
import java.awt.datatransfer.*;
import java.awt.event.*;

class Main extends Frame {
    TextField textField = new TextField();
    TextDisplay textDisplay = new TextDisplay(textField);

    Main() {
        super("getContents() Example");
    
        // Layout component.
        add(textDisplay, BorderLayout.CENTER);
        add(textField, BorderLayout.SOUTH);

        setSize(300, 100);
        show();
    }

    public static void main(String args[]) {
        new Main();
    }
}

class TextDisplay extends Canvas {
    String text = "";
    TextField textField;
    Font f = new Font("Monospaced", Font.BOLD, 24);

    TextDisplay(TextField textField) {
        this.textField = textField;
        setFont(new Font("Monospaced", Font.BOLD, 24));

        // Listen for events.
        addMouseListener(new MouseEventHandler());
    }

    public void paint(Graphics g) {
        FontMetrics fm = getFontMetrics(f);

        // Draw the character centered in the canvas area.
        g.setFont(f);
        g.drawString(text, (getSize().width-fm.stringWidth(text))/2,
            (getSize().height-fm.getHeight())/2+fm.getAscent());
    }

    class MouseEventHandler extends MouseAdapter {
        public void mousePressed(MouseEvent evt) {
            Transferable t = 
                getToolkit().getSystemClipboard().getContents(this);
    
            try {
                if (t != null 
                        && t.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                    text = 
                        (String)t.getTransferData(DataFlavor.stringFlavor);

                    // Generate the unicode string for 'text'.
                    String result = "";
                    byte big5[] = new byte[text.length()];
                    char unicode[] = new char[text.length()/2];
                    
                    for (int i=0; i<text.length(); i++) {
                        big5[i] = (byte)text.charAt(i);
                    }
        
                    // Create the converter object.
                    sun.io.ByteToCharConverter toUnicodeConv 
                            = sun.io.ByteToCharConverter.getConverter("Big5");

                    // Convert the big5 array to unicode.
                    int len = toUnicodeConv.convert(big5, 0, big5.length, 
                        unicode, 0, unicode.length);

                    // Display the Java unicode characters 
                    // field in the text.
                    for (int i=0; i<len; i++) {
                        String s;

                        result += "\\u";
                        s = "0000" + Integer.toHexString(unicode[i]);
                        result += s.substring(s.length()-4);
                    }
                    text = new String(unicode);

                    // Set it in the text field.
                    textField.setText(result);

                    repaint();
                }
            } catch (UnsupportedFlavorException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
