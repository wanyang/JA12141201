public class BreakTest{
	public static void main(String args[]){
		int stop = 4;
		for(int i = 1; i <=10;i++){
		//��i����stopʱ���˳�ѭ��
		if(i==stop){
				//System.out.println("�����������˳�����ѭ��");
				//break;
			System.out.println("��������:�˳�����ѭ��");
			continue;
			}
		System.out.println("i=" + i);
		}
	}
}
