/*
	����ʵ����=ʵ�ֽӿ�
*/
public class Mobile implements USB,WiFi{
	private int     num;
	private String  brand;
	
	//���幹�캯��
	public Mobile(){}
	public Mobile(int num,String brand){
		this.num = num;
		this.brand =brand;
	}
	//info()
	public void info(){
		System.out.println("Ʒ�ƣ�"+brand);
	}
	
	
	public void call(){
		System.out.println("��绰");
	}
	public void sms(){
		System.out.println("������");
	}
	
	
	//ʵ��������ʵ�ָ��ӿڡ����С��ĳ��󷽷�
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