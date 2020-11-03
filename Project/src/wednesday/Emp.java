package wednesday;
import java.util.ArrayList;
public class Emp {
     private int empid;
     String name;
     
     public Emp(int empid,String name){
    	 this.empid=empid;
    	 this.name=name;
     }
     public int hashCode()
     {
    	 return 12; 
     }
     
	public boolean equals(Object obj) 
	{
		//System.out.println("into equals meth");
		boolean flag=false;
		Emp e=(Emp)obj;
		if((this.empid==e.empid) && ((this.name).equals(e.name)));
		flag=true;
		return flag;
    
	}

}
