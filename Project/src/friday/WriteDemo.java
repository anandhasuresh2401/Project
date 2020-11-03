package friday;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDemo
{

	public static void main(String[] args)
	{
    byte b[]=new byte[100];
    
    try
    {
    	System.in.read(b);
    	FileOutputStream fout=new FileOutputStream("text1.txt");
    	fout.write(b);
    	
    	fout.close();
    }
    catch(IOException e)
    {
    	e.printStackTrace();
    }
	}

}
