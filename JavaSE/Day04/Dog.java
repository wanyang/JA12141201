public class Dog
{
	String name;
	String color;
	int age;
	//���ι�����
	Dog(String name,int age,String color)
	{
		System.out.println("����һֻС����");
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
		Dog dog = new Dog("����",5,"��ɫ");
		dog.info();

	}


}