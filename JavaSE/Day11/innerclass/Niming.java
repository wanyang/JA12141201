//������
abstract class USB{
	public abstract void read();
	public abstract void write();
}

//�ӿ�
interface Wifi{
	  void open();
	  void close();

}
/*
class USB_KEY extends USB{
	//�ص�
	
	//����
	
	//��д
	
}
*/
public class Niming{
	public static void main(String[] args){
		//�����ڲ���==����ľֲ��ڲ���==����Ķ������ʵ����Ķ���
		USB udisk = new USB(){
			
			int a;
			final int b = 123;
			public void read(){
				System.out.println("��ȡU��");
			}
			public void write(){
				System.out.println("дU��");
			}
			
			//System.out.println("");
		};
		udisk.read();
		udisk.write();
		
		//Wifi 
		Wifi wf = new Wifi(){
			
			public void open(){
				System.out.println("��WiFi");
			}
			public void close(){
				System.out.println("�ر�WiFi");
			}
		};
		wf.open();
		wf.close();
	}
}