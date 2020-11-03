package friday;

interface Transaction{
	void add(int a,int b);
}

public class LambdaExpression {

	public static void main(String[] args) {
Transaction obj =new Transaction()
{
	public void add(int a,int b)
	{
		System.out.println("amount :"+(a+b));
	}
};
obj.add(900,100);
	}

}
