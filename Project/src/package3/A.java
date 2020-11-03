package package3;

public interface A {
	void add();
	default void show()
	{
		System.out.println("Show");
	}

	static void show1()
	{
		System.out.println("Static Show");
	}
	

	}


