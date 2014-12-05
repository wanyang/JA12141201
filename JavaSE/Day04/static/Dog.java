//Dog  抽象的狗

//Dog 某种品种的狗

public class Dog{
	//属性
	//品种
	static String   type;   // 类变量：不依赖于对象【类名.类变量】
	
	int       age;			//实例变量：依赖于对象  【对象引用.实例变量】
	String  color;
	
	//静态代码块
	
	static{
		//使命：初始化类变量
		type = "中华田园犬";
		System.out.println("我是在static代码块中");
		//age = "110";  	 实例变量
		//color = "white";   static代码块中不能直接访问类的实例变量和实例方法
	
	
	}

	//方法
	Dog(){
	
	}
	Dog(int age,String color){
		
		this.type = "哈士奇";
		this.age = age;
		this.color = color;
	}
	//实例方法:this 代表调用者的引用
	void bark(){
		this.type = "泰迪";
		System.out.println("barking...." + age + color);
		
	}
	
	//类方法：不能访问【实例变量】===不依赖于对象
	static void bark1(){ 
		// 没有对象，所以不访问实例变量、实例方法
		//只能访问类变量、局部变量
		type = "京巴";
		System.out.println("类方法");
	}

}