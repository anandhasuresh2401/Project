package friday;

public class Student  implements java.io.Serializable{ 
	public String name; 
	public String address; 
	public transient String rollno; 
	public  int roomNo;
	
	
	public String toString()
	{
		
		return name;
	}
	}