class Outer{
	//��Ա����
	int a = 123;
	private String str = "�ⲿ��ı���";
	
	/*
	{
		Inner in = new Inner();
		in.run();
	}
	*/
	
	//��Ա�ڲ���
	class Inner{
		//static int a=123;  //�ڲ��಻�����徲̬����
		
		final static int a=123; 
		String str = "�ڲ���ı���";
		void run(){
			String str = "�ֲ�����";
			System.out.println("�ڲ���run()");
			System.out.println(a);
			System.out.println(str);
			System.out.println(this.str);
			System.out.println(Outer.this.str);
		}
	}	
	
	//��Ա����
	void run(){
		System.out.println("�ⲿ��run()");
		Inner in = new Inner();
		in.run();
	}
	
	//��̬��Ա����
	static void static_run(){
		Outer.Inner in = new Outer().new Inner();
		in.run();
	}
	
	
}

public class InnerDemo{
	public static void main(String[] args){
		//�ⲿ���ʹ��
		Outer outer = new Outer();
		//outer.run();
		outer.static_run();
		
		/*
		//�ڲ����ʹ��
		//Outer out = new Outer();
		//Outer.Inner in = out.new Inner();
		//in.run();
		Outer.Inner inner = new Outer().new Inner(); //��������
		//Outer.Inner inner = (new Outer()).Inner();
		inner.run();
		*/	
		
	}

}