// 【成员变量】初始化工作？ ====构造函数来完成
//  类变量 能不能 在构造函数中初始化？ === 可以



public class DogTest{
	public static void main(String[] args){
	
		System.out.println("我是在main代码块中");
		
		
		System.out.println("Dog.type=" + Dog.type);
		Dog.type = "藏獒";
		System.out.println("Dog.type=" + Dog.type);
		
		//类方法
		Dog.bark1();

		/*Dog.age = 123;
		Dog.bark();*/
		
	/*	
		//类变量： 不依赖于对象，优先于对象而存在
		System.out.println("dog.type=" + dog.type);
		System.out.println("dog2.type=" + dog2.type);
		System.out.println("Dog.type=" + Dog.type);
		
		//实例变量:依赖于对象
		
		System.out.println("dog.age=" + dog.age);
		System.out.println("dog2.age=" + dog2.age);
		
		//Dog.age = 123;  
		*/
		
		Dog dog = new Dog(12,"Red");
		Dog dog2 = new Dog(15,"Black");
		
		dog.bark();   //this===dog
		dog2.bark();  //this===dog2
		
		//使用对象引用 访问 类方法
		dog.bark1();   //this 
		dog2.bark1();
		
	}

}