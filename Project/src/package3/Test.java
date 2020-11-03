package package3;

public class Test {

	public static void main(String[] args) {
		Object o=(Object)new Foo();
		Foo foo =(Foo)o;
		System.out.println("i= " + foo.i);
		
		// TODO Auto-generated method stub

	}

}
class Foo
{
	public int i=3;
}
