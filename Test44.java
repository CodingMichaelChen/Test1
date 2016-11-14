public class Test44
{
	public static void main(String[] args)
	{
		thread tr=new thread("fjkdg");
		tr.start();
		try
		{
			tr.join();
		}catch(InterruptedException e){}
		for(int i=0;i<10;i++)
			System.out.println("main"+i);
	}
}
class thread extends Thread
{
	thread(String s)
	{
		super(s);
	}
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println(getName()+"i");
				sleep(1000);
			}
		}catch(InterruptedException e)
		{
			return ;
			
		}
	}
}