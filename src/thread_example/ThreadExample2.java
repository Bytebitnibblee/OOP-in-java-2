package thread_example;

public class ThreadExample2 {
	public static void main(String[]args) {
		
		System.out.println("** Application started**");
}
	MyTask task= new MyTask();
	task.executeTask();
	
	for(int doc=1; doc<=10; doc++)
	{
			System.out.println("printing Document -->" +doc+"--> printed1");
	}
	System.out.println("**Application Finished**");
	}

	
}
