public class Udisk implements USB{
	//特点
	static final String brand = "SanDisk";
	//义务
	public void read(){
		System.out.println("读U盘");
	}
	public void write(){
		System.out.println("写U盘");
	}
}