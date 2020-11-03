package package2;
import package3.*;
class Ia implements A {
	public void add()
	{
		System.out.println("Method of interface");
	}
public void show()
{
	System.out.println("overridden show");
}
	public static void main(String[] args) {
		Ia obj=new Ia();
		obj.add();
		obj.show();
		A.show1();

	}

}
