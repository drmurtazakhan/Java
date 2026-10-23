
import javax.swing.*;
import java.awt.*;


public class TreeCreator
extends JPanel{
  // array of grayvalues
  int imageArray[][];

  // main...
public static void main(String[] args) {
    if ((args.length <1)||(args.length>2)){
      System.out.println("Usage: TreeCreator <filename> [depth]");
      System.exit(0);
    }

    // read optional 2nd argument
    int depth = Integer.MAX_VALUE;
    if (args.length==2){
      depth = (new Integer(args[1])).intValue();
    }

    // create tree
    new TreeCreator(args[0], depth);
  }

//-----------
//Constructor
//-----------
public TreeCreator(String filename, int depth){

    // load tree from file
    QuadTree qt=new QuadTree(filename);
    System.out.println(""+qt);

    // convert tree to 2d-grayvalue array
    // this array is used in paintComponent
    int size = qt.initialSize;
    imageArray = new int[size][size];
    imageArray = qt.toArray(depth);

    // Init Frames etc.
    this.setPreferredSize(new Dimension(size,size));
    JFrame f = new JFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.getContentPane().add(this);
    f.pack();
    f.setVisible(true);
  }

//--------------------
// paint component
// draws imageArray
//--------------------
public void paintComponent(Graphics g){
    for (int y = 0; y<256;y++){
      for(int x=0;x<256;x++){
        int c=imageArray[y][x];
        Color col=new Color(c,c,c);
        g.setColor(col);
        g.fillRect(x,y,1,1);
      }
    }
  }
}