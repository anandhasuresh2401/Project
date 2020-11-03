package pack;
import java.io.*;

 class Exception1 {

	public static void main(String[] args) 
	{
  try
  {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("Enter String");
	  String s=br.readLine();
	  System.out.println("Enter no");
	  int n=Integer.parseInt(br.readLine());
	  System.out.println("Enter no");
	  int n1=Integer.parseInt(br.readLine());
	  System.out.println(s+" "+n+" "+n1);
  }
  catch(Exception e)
  {
	  System.out.println("Exception");
  }
  finally
  {
	  System.out.println("Exit");
  }
  System.out.println("Return");
	}
}