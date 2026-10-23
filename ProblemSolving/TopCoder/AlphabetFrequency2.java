import java.io.*;
import java.util.*;
class AlphabetFrequency2
{
	static String s;
	static int countFr;
    public static void main(String args[])throws IOException
    {
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner br = new Scanner(System.in);
        //System.out.print("Enter any string: ");
         //s = br.readLine();
         s = br.next();
 
        s=s.toLowerCase(); //converting the string into lowercase
        int l=s.length(); //finding the length of the string
 
        char alph[]=new char[26]; //array for storing alphabets from 'a' to 'z'
        int freq[]=new int[26]; //array for storing frequency of all alphabets
 
        char c='a';
 
        for(int i=0; i<26; i++)
            {
                alph[i]=c; //storing all alphabets from 'a' till 'z' in alph[] array
                freq[i]=0; //intializing the count of every alphabet with '0'
                c++;
            }
 
        char ch;
        
        /* Counting frequency of alphabets begins below */
        for(int i=0; i<26; i++)
            {
                for(int j=0; j<l; j++)
                {
                    ch=s.charAt(j); //extracting characters of the string one by one
                    if(ch==alph[i]) //first checking the whole string for 'a', then 'b' and so on
                        freq[i]++; //increasing count of those aplhabets which are present in the string
                }
            }
             
        countFr=0;
        for(int i=0; i<26; i++)
            {
            	
                if(freq[i]!=0) //printing only those alphabets whose count is not '0'
                {
                	countFr++;
                	//System.out.println("   "+alph[i]+"\t\t    "+freq[i]);
                }
                    
            }		
		
		
		CompareToHelper[] cs = new CompareToHelper[countFr];
        
        //System.out.println(countFr);
        
        int j=0;
	    for(int i=0; i<26; i++){
	    	if(freq[i]!=0){	    		
	    		cs[j] = new CompareToHelper(alph[i]+"",freq[i]);
	    		j++;
	    	}
	    	
	    }             
        
        insertionSort1(cs);      	
      	insertionSort2(cs);
      	
      	for (int i=0; i<cs.length; i++)
      	System.out.println(cs[i]);
      	System.out.println();
            
        } // end of main
        
       	
    public static void insertionSort1(CompareToHelper[] a)
	{	int  i, j;
		CompareToHelper cs;
		for (i = 1; i < a.length; i++)
		{	cs = a[i];
			for(j=i;j>0&&cs.compTo1(a[j-1])<0;j--)
			a[j] = a[j-1];
			a[j] = cs;			
		}
	}
	
	public static void insertionSort2(CompareToHelper[] a)
	{	int  i, j;
		CompareToHelper cs;
		for (i = 1; i < a.length; i++)
		{	cs = a[i];
			for(j=i;j>0&&cs.compTo2(a[j-1])>0;j--)
			a[j] = a[j-1];
			a[j] = cs;			
		}
	}	
		
 
        
    }

class CompareToHelper 
{	private String ch;    
    private int fr;    
    public CompareToHelper(String ch, int fr)
    {  	this.ch = ch;        	
    	this.fr = fr;     	
    }
    public String toString()
    {    return ch+"";
    }
    public int compTo1(Object other)
    {	CompareToHelper s = (CompareToHelper) other;
   		if (this.ch.compareTo(s.ch) < 0)
	    return -1;
	    else if (this.ch.compareTo(s.ch) > 0)
	    return 1;
	    else
	    return 0;           
    }
    public int compTo2(Object other)
    {	CompareToHelper s = (CompareToHelper) other;
   		if (this.fr < s.fr)
	    return -1;
	    else if (this.fr > s.fr )
	    return 1;
	    else
	    return 0;           
    }    
} 
