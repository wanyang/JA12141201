public class Dog
{
	String name;
	String color;
	int age;
	//三参构造器
	Dog(String name,int age,String color)
	{
		System.out.println("它是一只小狗狗");
		this.name = name;
		this.age = age ;
		this.color = color;
	
	}
	void info()
	{
		System.out.println("Name:" + this.name + "\tage:" + this.age + "\tcolor:" + this.color);

	}
	public static void main(String[] agrs) 
	{
		Dog dog = new Dog("旺旺",5,"白色");
		dog.info();

	}


}