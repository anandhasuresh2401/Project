package pack;
import java.util.Scanner;
class Password extends Exception{
	
public String toString() {
	return "incorrect password";
}

	public static void main(String[] args) {
    final String password="suresh24";
    int count=0;
    		for(int i=0;i<3;i++)
    		{
    			System.out.println("Enter password");
    			Scanner scan=new Scanner(System.in);
    			String s=scan.next();
    			if(s.equals(password))
    			{
    				count++;
    				break;
    			}
    		}
	try
	{
		if(count==0)
		{
			throw new PasswordException();
		}
		else
			System.out.println("continue");
			
		}
	catch(PasswordException e){
		System.out.println(e);
	}
	}

}
