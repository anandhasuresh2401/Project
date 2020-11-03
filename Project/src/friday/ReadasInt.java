package friday;


import java.io.FileInputStream;
import java.io.IOException;

public class ReadasInt {
	
	public static void main(String args[])
	{
		 
	 
	try
	{
		FileInputStream  f=new FileInputStream("text1.txt");	
	    int i=0;
	    while (( i=f.read())!=-1)
	    {
	       
			System.out.print((char)i);
	    }
			f.close(); 
			 
	}
	 catch (IOException ioe) {
		System.out.println("Exception: " + ioe);
		//return;
	}
	
	 
	}

}

