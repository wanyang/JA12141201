//Dog  ����Ĺ�

//Dog ĳ��Ʒ�ֵĹ�

public class Dog{
	//����
	//Ʒ��
	static String   type;   // ��������������ڶ�������.�������
	
	int       age;			//ʵ�������������ڶ���  ����������.ʵ��������
	String  color;
	
	//��̬�����
	
	static{
		//ʹ������ʼ�������
		type = "�л���԰Ȯ";
		System.out.println("������static�������");
		//age = "110";  	 ʵ������
		//color = "white";   static������в���ֱ�ӷ������ʵ��������ʵ������
	
	
	}

	//����
	Dog(){
	
	}
	Dog(int age,String color){
		
		this.type = "��ʿ��";
		this.age = age;
		this.color = color;
	}
	//ʵ������:this ��������ߵ�����
	void bark(){
		this.type = "̩��";
		System.out.println("barking...." + age + color);
		
	}
	
	//�෽�������ܷ��ʡ�ʵ��������===�������ڶ���
	static void bark1(){ 
		// û�ж������Բ�����ʵ��������ʵ������
		//ֻ�ܷ�����������ֲ�����
		type = "����";
		System.out.println("�෽��");
	}

}