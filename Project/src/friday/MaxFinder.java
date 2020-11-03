 package friday;

interface Transaction1{
	

	int maximum(int i, int j);
}
public class MaxFinder {

	public static void main(String[] args) {
Transaction1 obj= (num1 , num2) ->
{
	int res=num1>num2?num1:num2;
	return res;
};
	int result = obj.maximum(10,30);
	obj.maximum(55,90);
	System.out.println(result);
	}

}


