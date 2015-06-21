package ThreadsRunnables;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	// run threads on parallel
	Task ct = new Task("1st Counter");
	Thread t1 = new Thread(ct);
	t1.start();
	
	Task ct2 = new Task("2nd Counter");
	Thread t2 = new Thread(ct2);
	t2.start();
	// get an input while threads are running
	System.out.println("Enter your name: ");
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	System.out.println("Hello, " + name + "!");
}
}
