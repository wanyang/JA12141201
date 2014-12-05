public class Manager extends Employee{
	//特有属性
	String car;
	String office;
	
	
	// 子类构造方法：必须调用【父类构造方法】
	// 子类无参构造方法 + 没有显式调用父类构造方法 = 自动调用父类的无参构造方法
	public Manager(){ 
		super();    //自动调用无参的构造函数
		System.out.println("子类无参构造函数");
	}
	
	//子类一参构造方法
	public Manager(int id){
		super(id);    // 父类的构造函数
		System.out.println("子类一参构造函数");
		//this.id = id;
		
	}
	
	public Manager(int id,String name){
		this(id);    //this 代表一参构造函数
		System.out.println("子类的两参构造函数");
		//this.id = id;
		
		this.name = name;
	}
	
	
	public void drive(){
		//System.out.println("name:" + name + "开" + car + "上班");
		//System.out.println("name:" + super.name + "开" + this.car + "上班");
		System.out.println("name:" + this.name + "开" + this.car + "上班");
	}
	//super:父类的引用
	public void info(){
	
		System.out.println("子类的info()");
		
		//System.out.println("id:" + id + "\nname :" + name + "\nsalary:" + salary);
		
		super.info();
	
		System.out.println("car:" + car + "\noffice :" + office);
	}
}