public class Array2D_Error_bw_Points
{
    public static void main(String[ ] args)
    {
   
	    // First set of data points 	
	    float[][] xyD1 = {
	            {64,63,62,61,60,59,58,57},
	            {53,54,54,54,54,54,54,54}
	    };
	    
	    // Second set of data points
	    float[][] xyD2 = {
	            {63,62,61,60,59,59,60,61},
	            {52,53,54,54,55,55,56,57}
	    }; 	
	    
	    System.out.println("Length="+xyD1[0].length);
	    System.out.println("Dimensions="+xyD1.length);
	    					
	   	for (int i=0; i<xyD1[0].length; i++){
	    		System.out.println("("+xyD1[0][i]+","+xyD1[1][i]+")"+"<->"+"("+xyD2[0][i]+","+xyD2[1][i]+")");
	   	}
	   	
	   	System.out.println("\nMSE="+mse2D(xyD1, xyD2));    	
    		
    }      
    
    /*
     * compute mean square error between xyD1 and xyD2
     */
    public static float mse2D(float[][] xyD1, float[][] xyD2){
    	

	    float xSD=0;
	    float ySD=0;
	    float sum=0;
	    float N=0;
	    int N1 = xyD1[0].length;
	    int N2 = xyD2[0].length;
	    int M=2;	    
	    
   	    if (N1 < N2)
	    	N=N1;
	    else
	    	N=N2;
	    
	    for (int i=0; i < N; i++){
	    	xSD = (xyD1[0][i]-xyD2[0][i])*(xyD1[0][i]-xyD2[0][i]);
	    	ySD = (xyD1[1][i]-xyD2[1][i])*(xyD1[1][i]-xyD2[1][i]);
	    	sum += xSD + ySD;
	    }
	    float mse = sum/(N*M);
	    
	    return mse;
	    
    }
    	
}


