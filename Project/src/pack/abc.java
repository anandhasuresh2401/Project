package pack;
import java.util.Scanner;
class MyNewExceptions extends Exception
{
	public String toString()
	{
		return "incorrect password";
	}
}
public class abc {
	static String password()
	{
		return "xyz";
	}

	public static void main(String[] args) {
   String abc=password();
   int c=0;
   for(int i=0;i<3;i++)
   {
	   System.out.println("Enter password");
	   Scanner scan=new Scanner(System.in);
	   String entered=scan.next();
	   if(entered.equals(abc))
	   {
		   c=1;
		   break;
	   }
	    System.out.println("flag:"+(i+1));
	    }
   try{
	   if(c==0)
		   throw new MyNewExceptions();
	   else
		   System.out.println("continue");
	   
   }
   catch(MyNewExceptions f)
   {
	   System.out.println(f);
	   
   }
	}

}
