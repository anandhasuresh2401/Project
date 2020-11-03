package thursday;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class CompareName {
	static FruitName fn1=new FruitName("Apple");
	static FruitName fn2=new FruitName("Orange");
	static FruitName fn3=new FruitName("grape");
	static FruitName fn4=new FruitName("apple");
	static FruitName fn5=new FruitName("Mango");
	 public static void main(String a[]) {
	 List<FruitName> ls=new ArrayList<FruitName>();
	ls.add(fn1);
	ls.add(fn2);
	ls.add(fn3);
	ls.add(fn4); 
	ls.add(fn5);
	Collections.sort(ls);
	Iterator itr = ls.iterator();  
	 while(itr.hasNext()){
	Object element = itr.next();
	FruitName fn=(FruitName)element;
	System.out.println("Fruitname: "+fn.name+"\n");	 
	}
	}
	}
	class FruitName implements Comparable {
	String name;
    FruitName(String name)
	{
	 this.name=name;
	}
	public int compareTo(Object o)
	{
		 int i=name.compareToIgnoreCase(((FruitName)o).name);
		 
		if (i==0)
			return 0;
		else if (i>0)
		  return 1;
		else 
			return -1;	 
	} 
}