public class IntTest{
	public static void main(String args[]){
		//���ͳ���Ĭ���Զ���ת��int����
		int num = 88;
		//�����γ��������Զ�ת��Ϊlong���ͣ��������int��Χ������
		//long long1 = 8888888888888888;
		long long1 = 8888888888888L; //�����Ǵ�дL
		long long2 = 8888888888888l;
		
		//�˽��Ʊ�ʾ���Σ���0��ͷ
		int var = 013;
		System.out.println("var:" + var);		
		//ʮ�����Ʊ�ʾ���Σ���0x,0X��ͷ
		int hexNum = 0xFF;
		int hexNum1 = 0X1F;
		System.out.println("hexNum:" + hexNum + "\n hexNum1" + hexNum1);
		//�����Ʊ�ʾ����0b��0B��ͷe
		byte byteNum = (byte)0b11111111;
		int intNum = (byte)0b11111111; 
		System.out.println("intNum:" + intNum + "\n byteNum" + byteNum);
		
	
	}
	

}

