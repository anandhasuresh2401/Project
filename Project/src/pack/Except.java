package pack;

public class Except
{
   public static void main(String[] args) 
	{
   try
   {
	   int i=5/0;
   }
   catch(ArithmeticException e)
   {
	   System.out.println("print");
   }
   System.out.println("dont print");
	}

}
