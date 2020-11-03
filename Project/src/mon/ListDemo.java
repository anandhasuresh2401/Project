package mon;
import java.util.*;
import java.util.stream.Collectors;

public class ListDemo {

	public static void main(String[] args) {
    
		List<Integer> numbers=Arrays.asList(new Integer[] {1,87,87,45,9,23})	;
	
		List<Integer> list=numbers.stream().filter(i->i>10).distinct().limit(3).collect(Collectors.toList());
		System.out.println(list);
	}

}
