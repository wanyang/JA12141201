//抽象类

public abstract class AbsDemo{
	//抽象方法组成：
	
	//构造方法在子类的构造方法中，不能和new关键字结合
	public abstract void run();
	
	public static void main(String[] args){
		//抽象类不能直接实例化对象
		//AbsDemo abs = new AbsDemo();
	
	}
}