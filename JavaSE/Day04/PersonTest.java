//����Person��
public class PersonTest{
	public static void main (String[] args){
		//ʵ����:����=����=ʵ��
		
		//�ڶ������ʱ��û�С��Զ����޲ι��캯�����������Զ�ָ�����캯��
		//�ڶ������ʱ�򡾡��Զ����޲ι�������ʹ���Զ���Ĺ�����
		//����ʹ�ã�����.��Ա����  ����.��Ա����
		Person geminno = new Person();
		Person gem = new Person("�߲�");
		Person gemptc = new Person("�߲�����",12);
		
		
		//��������
		geminno.info();
		gem.info();
		gemptc.info();
		
	}// end main 
	
}//end class 