import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.RectangularShape;

/**
   A class for converting between user selectable units
   and pixels. This class converts x- and y- values 
   individually and has convenience methods to convert
   points, lines, and rectangular shapes to pixel 
   coordinates.
*/

public class UnitConverter 
{  /**
      Constructs a unit converter that converts 
      user-selected units to pixels in a window.
      @param x1 the x-value for the left edge
      @param x2 the x-value for the right edge
      @param y1 the y-value for the bottom edge
      @param y2 the y-value for the top edge
      @param w the width of the window
      @param h the height of the window
   */      
   public UnitConverter(double x1, double x2, 
      double y1, double y2, double w, double h)
   {  xleft = x1;
      xright = x2;
      ybottom = y1;
      ytop = y2;
      width = w;
      height = h;
   }

   /**
      Converts a point from user coordinates to pixels.
      @param p a point
      @return the point that was passed in
   */
   public Point2D convert(Point2D p)
   {  double x = xToPixel(p.getX());
      double y = yToPixel(p.getY());
      p.setLocation(x, y);
      return p;
   }
   
   /**
      Converts a line from user coordinates to pixels.
      @param l a line
      @return the line that was passed in
   */
   public Line2D convert(Line2D l)
   {  double x1 = xToPixel(l.getX1());
      double y1 = yToPixel(l.getY1());
      double x2 = xToPixel(l.getX2());
      double y2 = yToPixel(l.getY2());
      l.setLine(x1, y1, x2, y2);
      return l;
   }
   
   /**
      Converts a rectangular shape from user coordinates 
      to pixels.
      @param r a line
      @return the shape that was passed in
   */
   public RectangularShape convert(RectangularShape r)
   {  double xmin = xToPixel(r.getMinX());
      double ymin = yToPixel(r.getMinY());
      double xmax = xToPixel(r.getMaxX());
      double ymax = yToPixel(r.getMaxY());
      r.setFrameFromDiagonal(xmin, ymin, xmax, ymax);
      return r;
   }

   /**
      Converts an x-value from user coordinates to pixels.
      @param x an x-value a line
      @return the corresponding pixel value
   */
   public double xToPixel(double x)
   {  return (x - xleft) * (width - 1) / (xright - xleft);
   }
   
   /**
      Converts a y-value from user coordinates to pixels.
      @param y an y-value a line
      @return the corresponding pixel value
   */
   public double yToPixel(double y)
   {  return (y - ytop) * (height - 1) / (ybottom - ytop);
   }
   
   /**
      Converts a pixel value to an x-value in user 
      coordinates.
      @param px a pixel value
      @return the corresponding x-value value
   */
   public double pixelToX(double px)
   {  return xleft + px * (xright - xleft) / (width - 1);
   }
   
   /**
      Converts a pixel value to an y-value in user 
      coordinates.
      @param py a pixel value
      @return the corresponding y-value value
   */
   public double pixelToY(double py)
   {  return ytop + py * (ybottom - ytop) / (height - 1);
   }
   
   private double xleft;
   private double xright;
   private double ytop;
   private double ybottom;
   private double width;
   private double height;
}