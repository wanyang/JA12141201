public class ClassInit{
	//�����
	static String str = getStaticVar();
	//�෽��
	private static String getStaticVar(){
		System.out.println("static����");
		return "Static����";
	}

	//ʵ������
	int var = getIntVar();
	//ʵ������
	private int getIntVar(){
		System.out.println("ʵ������");
		return 123;
	}	
	//��̬�����
	static{
	
		System.out.println("static�������");
	}
	//���췽��
	public ClassInit(){
		System.out.println("���췽��");
	
	}
	
	/*
	public static void main(String[] args){
		System.out.println("����main");
		
		ClassInit ci = new ClassInit();
		System.out.println("�˳�main");
	}
	*/
}