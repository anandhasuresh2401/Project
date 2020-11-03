package mon;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceDemo {

	public static void main(String[] args) {
     Stream.of(10,20,5).reduce((x,y)->x+y).ifPresent(System.out::println);
     
     List<Integer> intList=Arrays.asList(5,7,13,9);
     
     Optional<Integer> result=intList.stream().reduce((a,b)->a>b?a:b);
     
     if(result.isPresent())
     {
    	 System.out.println("Result:"+result.get());
     }
	}

}
