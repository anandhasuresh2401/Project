package day3;

public class SimpleTester implements PrimeTester{
  public void primecheck(int a)
  {
	  int count=0;
	  for(int i=1;i<=a;i++)
	  {
		  if(a%i==0)
		  {
			  count++;
		  }
	  }
  if(count==2)
  {
	  System.out.println("It is prime");
  }
  else{
	  System.out.println("Not a prime");
  }
  }
   
  
	public static void main(String[] args) {
		SimpleTester obj=new SimpleTester();
    obj.primecheck(2);
	}

}
