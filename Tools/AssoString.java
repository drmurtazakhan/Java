public class AssoString 
{   
	private String key;
    private Object value;
    public AssoString(String comparable, Object obj)
    {   key = comparable;
        value = obj;
    }

    public AssoString(String comparable)
    {   this(comparable, null);
    }

    public String getKey()
    {   return key;
    }

    public Object getValue()
    {   return value;
    }
    
    public void setValue(Object value)
    {   this.value=value;
    }

    public String toString()
    {   String s = "{ " + key;
        if(value != null)
            s = s + " ,   " + value;
        return s + " }";
    }
    
    public static void printAssoStringAry(AssoString[] strAry)
    {
    	for (int i=0; i<strAry.length; i++)
    	System.out.println(strAry[i]);
    }
    
}
