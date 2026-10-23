import ccj.*;

public class PlotData4 extends GraphicsApplet
{  public void run()
   {  
      
      
      String filename=readString("Enter data file name");
      TextInputStream in=new TextInputStream(filename);
      int n=in.readInt(); // read number of records in file
      in.readLine();      // next line
      Product[] data = new Product[n];
      int i;
      for (i = 0; i < n; i++)
      {  Product c = new Product();
         c.read(in);
         data[i] = c;
      } 

      setCoord(0, MAX_SPEED, MAX_PRICE, 0);

      for (i = 0; i < n; i++)
         data[i].draw();
   }  // end of run()

   private static double MAX_PRICE = 10000; //$
   private static double MAX_SPEED = 1000;  //MHz
}
     // end of class PlotData4

class Product
{  public Product()
   {  name = "";
      price = 0;
      speed=  0;
      score = 0;
   }

   public void read(TextInputStream in)
   {
      name=in.readLine();
      price=in.readDouble();
      speed=in.readDouble();
      in.readLine();   
   }

   public void draw()
   {  Message label = new Message(new Point(price, speed), name);
      label.getStart().draw();
      label.draw();
   }

   private String name;
   private double price;
   private double speed;
   private int score;
}  // end of class Product
