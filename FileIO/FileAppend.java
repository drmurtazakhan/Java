import java.io.*;
public class FileAppend
{ public static void main(String[ ] args) throws IOException
   {  String  message  =  "Java is platform independent";
     PrintWriter  outputStream = 
	new PrintWriter(new FileWriter("datafile.txt", true)); 
      outputStream.println(message);
     outputStream.close( );
  }
  }