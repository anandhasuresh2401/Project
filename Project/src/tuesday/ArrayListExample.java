package tuesday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;



public class ArrayListExample {

	public static void main(String[] args) {
		
		List<Integer> arraylistA =new ArrayList<Integer>();	
		ArrayList<String> arraylistB =new ArrayList<String>();
		
		for(int i=0;i<5;i++)
		{
			arraylistA.add(i);
		}
		System.out.println(arraylistA);
		arraylistB.add("beginner");
		arraylistB.add("Java");
		arraylistB.add("Tutorial");
		arraylistB.add(".");
		arraylistB.add(3,"com");
		arraylistB.add("java");
		arraylistB.add("site");
		
		System.out.println("Second Element is "+arraylistB.get(2));
		arraylistB.remove("java");
		System.out.println("ArrayListB after "+arraylistB);
		Iterator<Integer> i1=arraylistA.iterator();
		System.out.print("ArrayList arraylist --> ");
		while (i1.hasNext())
		{
			System.out.print(i1.next() + " ");
			
		}
          System.out.println();
          
          System.out.print("ArrayList arraylistA --> ");
          for(int j=0;j<arraylistA.size();j++)
          {
        	  System.out.print(arraylistA.get(j) + " ");
        	  
          }
         System.out.println();
         
         System.out.print("Sorted ArrayList arraylistA --> ");
         Collections.sort(arraylistA);
         System.out.print(arraylistA);
         
         Integer a[]={11,12,13,17,18};
         
         List<Integer> arrlist=new ArrayList<Integer>(Arrays.asList(a));
    System.out.println("arrList "+arrlist.get(0));
         



		
	}

}
