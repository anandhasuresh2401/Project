package friday;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadDemo {
	
	void readFile() throws IOException
	{
		FileInputStream f=null;
		byte b[]=new byte[150];
		
		try
		{
			f=new FileInputStream("text1.txt");
			f.read(b);
			String str=new String(b);
			System.out.println(str.trim());
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
			
		}
		finally
		{
			f.close();
			
		}
		
	}

	public static void main(String[] args)throws IOException
	{
      ReadDemo fileInput =new ReadDemo();
      fileInput.readFile();
	}

}
