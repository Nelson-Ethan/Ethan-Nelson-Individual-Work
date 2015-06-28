// Ethan Nelson
import java.util.Iterator;
import java.util.LinkedList;

public class AddRemove {

	public static void main(String[] args) {
	
		//collection with LinkedList	
	LinkedList<String> employees = new LinkedList<String>();
	//add to list
	employees.add("Todd");
	employees.add("John");
	employees.add("Scott");
	employees.add("Jeff");
	employees.add("Chad");
	
	// listIterator will allow me to remove
Iterator<String> emp = employees.listIterator();
//loop
while (emp.hasNext()) {
	String name = emp.next();
	System.out.println(name);
	// remove certain string
	if(name.equals("Jeff")) {
		emp.remove();
		

		
	}
	}
System.out.println();
//iterate through and print with for each
for (String employee : employees) {
	System.out.println(employee);
}

	}
}