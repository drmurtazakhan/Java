// W3frame.java  demonstrate a label and a button

import java.awt.*;
import java.awt.event.*;

class W3frame extends Frame implements ActionListener {
    Button helloButton;
    Button exitButton;
    boolean original=true;
    
  public W3frame()
  {
    // The constructor is responsible for setting
    // up the initial buttons and color background.
    setBackground(Color.cyan);
    setForeground(Color.black);
    setLayout(new FlowLayout(FlowLayout.CENTER, 15, 10));
    
    add(new Label("a label")); // a label

    exitButton = new Button("Press to exit");  // a button
      exitButton.addActionListener(this);
      add(exitButton);

    helloButton = new Button("Hello World");  // a button
      helloButton.addActionListener(this);
      add(helloButton);
      
    setTitle("Label and Button demonstration");
    setSize(200,200);
    setBackground(Color.green);
    setForeground(Color.black);
    addWindowListener(new WindowAdapter ()
          {
            public void windowClosing(WindowEvent e)
            {
              System.exit(0);
            }
          }
                    );
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == exitButton)
    {
      setVisible(false);
      dispose();
      System.exit (0);
    }
    
    if (e.getSource() == helloButton)
    {
      if(original)
      {
        setForeground(Color.white);
        setBackground(Color.red);
        // change text to Good by World
        original = !original;
      }
      else
      {
        setBackground(Color.green);
        setForeground(Color.black);
        original = !original;
      }
    }
  }

  public static void main(String[] args) {
    new W3frame ();
  }
}
