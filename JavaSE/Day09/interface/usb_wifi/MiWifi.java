public class MiWifi implements USB_WIFI{
	//�ص�
	String brand = "С��";
	
	//����
	public void read(){
		System.out.println("��wifi: usb read");
	}
	public void write(){
		System.out.println("��wifi: usb write");
	}
	public void open(){
		System.out.println("��wifi: wifi open");
	}
	public void close(){
		System.out.println("��wifi: wifi close");
	}
	//usb2wifi
	public void usb2wifi(){
		System.out.println("USBתWiFi");
	}
}