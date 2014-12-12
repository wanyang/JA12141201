package gem.javase;

class Person{
	String name;
	int    age;
	public Person(){}
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return "name:"+name+"\t age:"+age;
		//return "��д��object��toString����";
	}
	
	//ͬһ����� ���ԣ�
	public boolean equals(Object obj){
		//�Ƿ�ָ��ͬһ����
		if(this==obj){
			return true;
		}
		//�Ƿ���ͬһ�����
		boolean res = obj instanceof Person;
		if(res){
			Person obj2 = (Person)obj;
			//ͬһ��
			if(this.name == obj2.name && this.age == obj2.age){//�����Ƿ���ͬ��
				return true;
			}else{
				return false;
			}
			
		}else{
			return false;
		}
	}
}

public class Test{
	public static void main(String[] args){
		Test test = new Test();
		System.out.println(test.getClass());
		//ֱ�Ӵ�ӡ����ʱ����Ĭ�ϵ���toString����
		System.out.println(test);
		System.out.println(test.toString());
		
		Person p = new Person("geminno",12);
		Person p1 = new Person("google",13);
		Person p2 = p1;
		System.out.println("equals():" + p.equals(p1) + "==" + (p==p1));
		System.out.println("equals():" + p2.equals(p1)+ "==" + (p2==p1));
		
		//System.out.println(p);
	}
}