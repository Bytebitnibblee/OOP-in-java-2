package thread_example;

public class MyTask1 extends Thread {

	@Override
	public void run() {
	
	for(int doc=1; doc<=10; doc++)
	{
			System.out.println("printing Document -->" +doc+"--> printed2");
	}
	
	}

}
