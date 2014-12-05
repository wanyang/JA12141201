public class Student{
	String name;
	public Student(String name){
		this.name = name ;
	}
	
	//成员方法
	Student get(){
		return this;
	}
	
	public static void main(String[] args){
		Student s1 = new Student("小徽徽");
		Student s2 = new Student("大徽徽");
		
		System.out.println(s1);
		System.out.println(s1.get().name);
		System.out.println(s2);
		System.out.println(s2.get().name);
	}
}