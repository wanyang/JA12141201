public class Test{
	public static void main(String[] args){
		//MiWifi mi = new MiWifi();  //����ʹ�÷���
		
		USB_WIFI mi = new MiWifi();  //����ת��
		
		MiWifi mi2 = (MiWifi)mi;     //ǿ������ת��������ת��
		mi.open();
		mi.close();
		mi.read();
		mi.write();
		mi.usb2wifi();
		System.out.println("brand:" + mi2.brand);
	}
}