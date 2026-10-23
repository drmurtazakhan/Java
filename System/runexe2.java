class runexe2
{
public static void main(String[] args)
{
Runtime r =Runtime.getRuntime();
Process p =null;
String cmd[]={"magicsquare.exe 4"};
try{
p=r.exec(cmd);
}
catch(java.lang.Exception e)
{}
}
}