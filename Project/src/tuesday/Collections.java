package tuesday;
import java.util.*;


public class Collections {

	public static void main(String[] args) {
		//Hashset s1= new Hashset<String>();
		
     HashSet<String> s1=new HashSet<String> ();
     s1.add("Beginner");
     s1.add("Java");   
     s1.add("Java");
     s1.add("tutorial");
     System.out.println("Elements as a set" + s1);
     System.out.println("\n s1.contains Java :" + s1.contains("Java"));
     
    TreeSet<String> t1=new TreeSet<String>(s1);
    System.out.println("t1.equals s1 : "+t1.equals(s1));
    
    Iterator<String> itr=t1.iterator();
    System.out.println("Iteration Type 1 :");
    while (itr.hasNext())
    {
    	String e=(String)itr.next();
    	System.out.println(e);
    }
    System.out.println("Iteration Type 2 :");
    for(String o:t1)
    	System.out.println(o);
    
	}

	

}
