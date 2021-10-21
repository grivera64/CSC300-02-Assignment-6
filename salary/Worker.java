package assignment6.salary;

public class Worker implements Comparable<Worker>
{
	
	private int id;
	private String name;
	private Integer salary;
	
	public Worker(int id, String name, Integer salary)
	{
		
		this.setId(id);
		this.setName(name);
		this.setSalary(salary);
		
	}
	
	public void setId(int id)
	{
		
		this.id = id;
		
	}
	
	public int getId()
	{
		
		return this.id;
		
	}
	
	public void setName(String name)
	{
		
		this.name = name;
		
	}
	
	public String getName()
	{
		
		return this.name;
		
	}
	
	public void setSalary(Integer salary)
	{
		
		this.salary = salary;
		
	}
	
	public Integer getSalary()
	{
		
		return this.salary;
		
	}
	
	//@Override
	public int compareTo(Worker o)
	{
		
		return this.salary.compareTo(o.salary);
		
	}
	
	//@Override
	public String toString()
	{
		
		return String.format("ID: %d Name: %s Salary: $%s", this.id, this.name, this.salary);
		
	}
	
}
