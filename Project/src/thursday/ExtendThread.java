package thursday;
class NewThread extends Thread{
	public void run()
	{
		try
		{
			for(int i=5; i>0;i--)
			{
				System.out.println("Child THread : " + i);
				Thread.sleep(600);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Child interrupted");
		}
		System.out.println("Exiting child thread");
	}
    public static class ExtendThread {
    	public static void main(String[] args) {
           NewThread t= new NewThread();
           t.setName("Demo Thread");
           System.out.println("Child thread : " + t);
           t.start();
    
    try
    {
    	for(int i=5;i>0;i--)
    	{
    		System.out.println("Main Thread : " + i);
    		Thread.sleep(300);
    		
    	}
    }
    catch (InterruptedException e)
    	{
    		System.out.println("Main thread interrupted");
        }
    	System.out.println("Main thread exiting");
	}

}
	}
    
    
 
