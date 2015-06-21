package ThreadsRunnables;


public class Task implements Runnable {
	private String name;
	
	public Task (String name) {
	 this.name = name;	
	}

@Override
public void run() {
	
for (int i = 1; i < 50; i++) {
System.out.println(name + ": " + i);

// for exception
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

  
}

}

}
