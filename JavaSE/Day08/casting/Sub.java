public class Sub extends Base{
	String str = "sub class";//�������е�����
	void sub_show(){
		System.out.println("sub�����еķ���");
	}
	
	void show(){
		System.out.println("���ิд�˸���ķ���sub class");
	}
	public static void main(String[] args){
		
		//����ת�ͣ�Ĭ��  ����Ҫǿ������ת��
		//���������ָ������Ķ���
		//= ���������������ԡ���=�������е����Ա����า�Ƿ���
		Base base = new Sub();
		
		//System.out.println(base.str);
		
		//base.sub_show();
		
		
		System.out.println(base.a);
		
		//base.base_show();
		
		//base.show();
		
		
		//����ת�� ����Ĭ��ת��  ����Ҫ����ǿ������ת��
		
		Base ba = new Sub();
		Sub sub = (Sub)ba;
		//Sub sub = new Base();
		//Sub sub = (Sub)new Base();
		
		//���ʸ��������
		System.out.println(sub.a);
		//sub.base_show();
		//���ิд���෽��
		sub.show();
		//�������������
		System.out.println(sub.str);
	}
	
}