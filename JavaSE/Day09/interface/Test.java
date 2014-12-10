public class Test{
	public static void main(String[] args){
		Mobile T2 = new Mobile(1234,"锤子 2s");
		T2.info();
		
		T2.call();
		T2.sms();
		
		//WiFi
		T2.open();
		T2.close();
		//接口名 直接访问 常量
		System.out.println("wifi:" + WiFi.ssid + "密码:" + WiFi.pass);
		//System.out.println("wifi:" + T2.ssid + "密码:" + T2.pass);
		//USB
		T2.read();
		T2.write();
		//接口名 直接访问 常量
		System.out.println("USB标准:" + USB.version);
		//System.out.println("USB标准:" + T2.version);
	}
}