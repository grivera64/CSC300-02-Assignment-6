package assignment6.salary;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class WorkerMinSalary
{
	
	public static void main(String[] args)
	{
		
		List<Worker> workerAl = new ArrayList<>();
		
		workerAl.add(new Worker(10, "Raghu", 25000));
		workerAl.add(new Worker(120, "Krish", 45000));
		workerAl.add(new Worker(210, "John", 14000));
		workerAl.add(new Worker(150, "Kishore", 24000));
		
		Worker minWorker = Collections.min(workerAl);
		
		System.out.printf("Worker with min salary: %s\n", minWorker);
		
	}

}
