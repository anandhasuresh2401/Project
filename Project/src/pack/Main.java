package pack;

class MyNegativeAgeException extends Exception
{
	public String toString()
	{
		return "Age cannot be negative";
	}
}

public class Main {
   static int getAge()
   {
	   return -10;
   }
	public static void main(String[] args) {
int age=getAge();
try
{
	if(age<0)
		throw new MyNegativeAgeException();
	else
		System.out.println("Age entered is "+ age);
}
catch(MyNegativeAgeException e)
{
	System.out.println(e);
}
	}

}
