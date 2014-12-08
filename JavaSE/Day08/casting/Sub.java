public class Sub extends Base{
	String str = "sub class";//子类特有的属性
	void sub_show(){
		System.out.println("sub类特有的方法");
	}
	
	void show(){
		System.out.println("子类复写了父类的方法sub class");
	}
	public static void main(String[] args){
		
		//向上转型：默认  不需要强制类型转换
		//基类的引用指向子类的对象
		//= ！子类新增的属性【】=基类特有的属性被子类覆盖方法
		Base base = new Sub();
		
		//System.out.println(base.str);
		
		//base.sub_show();
		
		
		System.out.println(base.a);
		
		//base.base_show();
		
		//base.show();
		
		
		//向下转型 不会默认转换  必须要进行强制类型转换
		
		Base ba = new Sub();
		Sub sub = (Sub)ba;
		//Sub sub = new Base();
		//Sub sub = (Sub)new Base();
		
		//访问父类的属性
		System.out.println(sub.a);
		//sub.base_show();
		//子类复写父类方法
		sub.show();
		//访问子类的属性
		System.out.println(sub.str);
	}
	
}