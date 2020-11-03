package tuesday;
import java.util.*;
public class HashMapTask {

	public static void main(String[] args) {
 
		HashMap<HashSet<String>,List<Integer>> a=new HashMap<HashSet<String>,List<Integer>>();
		HashSet<String> s1=new HashSet<String>();
		
		s1.add("Hello");
        s1.add("Job");
        s1.add("Java");
        List<Integer> A=new ArrayList<Integer>();
        
        A.add(1);
        A.add(2);
        A.add(3);
    
    a.put(s1, A);
    System.out.println(a);
	}

}
