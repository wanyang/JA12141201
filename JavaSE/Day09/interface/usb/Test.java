public class Test{
	public static void main(String[] args){
		
		//USB_KEY u = new USB_KEY(); ���ַ���Ҳ�ǿ��Ե�
		USB upan = new USB_KEY();//�̳е�����ת�� vs �ӿڡ�ʵ���������ת��
		upan.read();
		upan.write();
		//System.out.println(upan.brand + "������" + upan.brand + "д����");
		
		USB key = new Udisk();
		key.read();
		key.write();
		//System.out.println(key.brand + "��U��" + key.brand +" дU��");
	}
}