public class Test{
	public static void main(String[] args){
		Mobile T2 = new Mobile(1234,"���� 2s");
		T2.info();
		
		T2.call();
		T2.sms();
		
		//WiFi
		T2.open();
		T2.close();
		//�ӿ��� ֱ�ӷ��� ����
		System.out.println("wifi:" + WiFi.ssid + "����:" + WiFi.pass);
		//System.out.println("wifi:" + T2.ssid + "����:" + T2.pass);
		//USB
		T2.read();
		T2.write();
		//�ӿ��� ֱ�ӷ��� ����
		System.out.println("USB��׼:" + USB.version);
		//System.out.println("USB��׼:" + T2.version);
	}
}