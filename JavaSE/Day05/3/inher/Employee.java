public class Employee{
	int     id ;
	String  name ;
	double  salary ;
	//构造函数：不能被继承
	
	
	public Employee(){
		System.out.println("父类的无参构造函数");
	}
	
	public Employee(int id){
		this.id = id;
		System.out.println("父类的一参构造函数");
	}
	
	public Employee(int id,String name){
		this.id = id;
		this.name = name;
		System.out.println("父类的两参构造函数");
	}
	
	public String getName(){
		return name;
	
	}
	public double getSalary(){
		return salary;
	}
	
	public void info(){
		System.out.println("父类的info()");
		System.out.println("id:" + id + "\nname :" + name + "\nsalary:" + salary);
	}
}