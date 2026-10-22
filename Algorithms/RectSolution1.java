import java.util.*; 
import java.math.*;
import java.awt.Rectangle;

public class RectSolution1
{
	public static int solution(int K, int L, int M, int N, int P, int Q, int R, int S) {	
     
    int area1, area2, area3, netArea;
 
    Rectangle rec1=new Rectangle(K, L, M-K, N-L);
 
    Rectangle rec2=new Rectangle(P, Q, R-P, S-Q);
 
    Rectangle intersection=rec1.intersection(rec2); 
 
    area1=(int)(rec1.getHeight())*(int)(rec1.getWidth());
    area2=(int)rec2.getHeight()*(int)rec2.getWidth();
    area3=(int)intersection.getHeight()*(int)intersection.getWidth(); 
    netArea = area1+area2-area3;
 
    if(netArea < 0)
      return -1;
      
    return netArea;
  }
  
 public static void main(String args []) {
 
      
      System.out.println(RectSolution1.solution(-4, 1, 2, 6, 0, -1, 4, 3));
      System.out.println(RectSolution1.solution(-4, 1, 2, 6, -4, 1, 2, 6));
 
 	
  }
 
}
