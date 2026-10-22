import java.awt.*; 
import java.awt.font.*;
import java.awt.geom.Rectangle2D;
public class MessageInRectangleInFrame extends Frame
{	public static final int RS=100; // Rectangle Size
	public static final int FS=9;  // Font Size
	public static final int FW=500; // Frame Width
	public static final int FH=500; // Frame Height
	public MessageInRectangleInFrame()
	{
		setTitle("Graphics Using Frames");
		setSize(FW,FH);
		show();
	}
    public void paint(Graphics g)
    {
    	String s1="Allah Allah";
    	//String s1="20";
    	double totalWidth=0;    	
    	int r1x=(FW-RS)/2;
    	int r1y=(FH-RS)/2;
    	
    	Graphics2D g2 = (Graphics2D)g;
    	Font font=new Font("Times", Font.PLAIN, FS);
    	//Font font=new Font("Garmond", Font.PLAIN, FS);
    	//Font font=new Font("courier", Font.PLAIN, FS);
        g.setFont(font);
        FontRenderContext frc=new FontRenderContext(null,true,true);
        //LineMetrics metrics = font.getLineMetrics(s1,frc);
        GlyphVector gV=font.createGlyphVector(frc,s1);
        int n=gV.getNumGlyphs();
        for (int i=0; i<n; i++)
        {
        	Shape gBounds = gV.getGlyphLogicalBounds(i);
        	Rectangle2D bounds=gBounds.getBounds2D();        	
        	totalWidth+=bounds.getWidth();
        }
        int s1w=(int)totalWidth;        
        Rectangle r1 = new Rectangle(r1x,r1y,RS,RS);
        g2.draw(r1);        
        g2.setColor(Color.red);
        g.drawString(s1,r1x+(RS-s1w)/2+1,r1y+(RS-FS)/2+FS);                   
        g2.setColor(Color.blue);
            
        
    }
    public static void main(String[] args)
    {
    	MessageInRectangleInFrame frame = new MessageInRectangleInFrame();
    }     
} 
