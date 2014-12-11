public class Test{
	public static void main(String[] args){
		//MiWifi mi = new MiWifi();  //正常使用方法
		
		USB_WIFI mi = new MiWifi();  //向上转型
		
		MiWifi mi2 = (MiWifi)mi;     //强制类型转换，向下转型
		mi.open();
		mi.close();
		mi.read();
		mi.write();
		mi.usb2wifi();
		System.out.println("brand:" + mi2.brand);
	}
}