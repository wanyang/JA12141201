/*
	定义实现类=实现接口
*/
public class Mobile implements USB,WiFi{
	private int     num;
	private String  brand;
	
	//定义构造函数
	public Mobile(){}
	public Mobile(int num,String brand){
		this.num = num;
		this.brand =brand;
	}
	//info()
	public void info(){
		System.out.println("品牌："+brand);
	}
	
	
	public void call(){
		System.out.println("打电话");
	}
	public void sms(){
		System.out.println("发短信");
	}
	
	
	//实现类义务：实现父接口【所有】的抽象方法
	public void open(){
		System.out.println("Open WiFi");
	}
	
	public void close(){
		System.out.println("close WiFi");
	}
	
	public void read(){
		System.out.println("Read USB");
	}
	
	public void write(){
		System.out.println("write USB");
	}

}