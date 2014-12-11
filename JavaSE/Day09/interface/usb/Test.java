public class Test{
	public static void main(String[] args){
		
		//USB_KEY u = new USB_KEY(); 这种方法也是可以的
		USB upan = new USB_KEY();//继承的向上转型 vs 接口、实现类的向上转型
		upan.read();
		upan.write();
		//System.out.println(upan.brand + "读键盘" + upan.brand + "写键盘");
		
		USB key = new Udisk();
		key.read();
		key.write();
		//System.out.println(key.brand + "读U盘" + key.brand +" 写U盘");
	}
}